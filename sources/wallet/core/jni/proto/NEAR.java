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

public final class NEAR {

    /* renamed from: wallet.core.jni.proto.NEAR$1 */
    public static /* synthetic */ class C97511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46567xa1df5c61;

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
                f46567xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46567xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.NEAR.C97511.<clinit>():void");
        }
    }

    public static final class AccessKey extends GeneratedMessageLite<AccessKey, Builder> implements AccessKeyOrBuilder {
        /* access modifiers changed from: private */
        public static final AccessKey DEFAULT_INSTANCE;
        public static final int FULL_ACCESS_FIELD_NUMBER = 3;
        public static final int FUNCTION_CALL_FIELD_NUMBER = 2;
        public static final int NONCE_FIELD_NUMBER = 1;
        private static volatile im4<AccessKey> PARSER;
        private long nonce_;
        private int permissionCase_ = 0;
        private Object permission_;

        public static final class Builder extends GeneratedMessageLite.C4930a<AccessKey, Builder> implements AccessKeyOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearFullAccess() {
                copyOnWrite();
                ((AccessKey) this.instance).clearFullAccess();
                return this;
            }

            public Builder clearFunctionCall() {
                copyOnWrite();
                ((AccessKey) this.instance).clearFunctionCall();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((AccessKey) this.instance).clearNonce();
                return this;
            }

            public Builder clearPermission() {
                copyOnWrite();
                ((AccessKey) this.instance).clearPermission();
                return this;
            }

            public FullAccessPermission getFullAccess() {
                return ((AccessKey) this.instance).getFullAccess();
            }

            public FunctionCallPermission getFunctionCall() {
                return ((AccessKey) this.instance).getFunctionCall();
            }

            public long getNonce() {
                return ((AccessKey) this.instance).getNonce();
            }

            public PermissionCase getPermissionCase() {
                return ((AccessKey) this.instance).getPermissionCase();
            }

            public boolean hasFullAccess() {
                return ((AccessKey) this.instance).hasFullAccess();
            }

            public boolean hasFunctionCall() {
                return ((AccessKey) this.instance).hasFunctionCall();
            }

            public Builder mergeFullAccess(FullAccessPermission fullAccessPermission) {
                copyOnWrite();
                ((AccessKey) this.instance).mergeFullAccess(fullAccessPermission);
                return this;
            }

            public Builder mergeFunctionCall(FunctionCallPermission functionCallPermission) {
                copyOnWrite();
                ((AccessKey) this.instance).mergeFunctionCall(functionCallPermission);
                return this;
            }

            public Builder setFullAccess(FullAccessPermission fullAccessPermission) {
                copyOnWrite();
                ((AccessKey) this.instance).setFullAccess(fullAccessPermission);
                return this;
            }

            public Builder setFunctionCall(FunctionCallPermission functionCallPermission) {
                copyOnWrite();
                ((AccessKey) this.instance).setFunctionCall(functionCallPermission);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((AccessKey) this.instance).setNonce(j);
                return this;
            }

            private Builder() {
                super(AccessKey.DEFAULT_INSTANCE);
            }

            public Builder setFullAccess(FullAccessPermission.Builder builder) {
                copyOnWrite();
                ((AccessKey) this.instance).setFullAccess((FullAccessPermission) builder.build());
                return this;
            }

            public Builder setFunctionCall(FunctionCallPermission.Builder builder) {
                copyOnWrite();
                ((AccessKey) this.instance).setFunctionCall((FunctionCallPermission) builder.build());
                return this;
            }
        }

        public enum PermissionCase {
            FUNCTION_CALL(2),
            FULL_ACCESS(3),
            PERMISSION_NOT_SET(0);
            
            private final int value;

            private PermissionCase(int i) {
                this.value = i;
            }

            public static PermissionCase forNumber(int i) {
                if (i == 0) {
                    return PERMISSION_NOT_SET;
                }
                if (i == 2) {
                    return FUNCTION_CALL;
                }
                if (i != 3) {
                    return null;
                }
                return FULL_ACCESS;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PermissionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            AccessKey accessKey = new AccessKey();
            DEFAULT_INSTANCE = accessKey;
            GeneratedMessageLite.registerDefaultInstance(AccessKey.class, accessKey);
        }

        private AccessKey() {
        }

        /* access modifiers changed from: private */
        public void clearFullAccess() {
            if (this.permissionCase_ == 3) {
                this.permissionCase_ = 0;
                this.permission_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFunctionCall() {
            if (this.permissionCase_ == 2) {
                this.permissionCase_ = 0;
                this.permission_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPermission() {
            this.permissionCase_ = 0;
            this.permission_ = null;
        }

        public static AccessKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFullAccess(FullAccessPermission fullAccessPermission) {
            fullAccessPermission.getClass();
            if (this.permissionCase_ != 3 || this.permission_ == FullAccessPermission.getDefaultInstance()) {
                this.permission_ = fullAccessPermission;
            } else {
                this.permission_ = ((FullAccessPermission.Builder) FullAccessPermission.newBuilder((FullAccessPermission) this.permission_).mergeFrom(fullAccessPermission)).buildPartial();
            }
            this.permissionCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeFunctionCall(FunctionCallPermission functionCallPermission) {
            functionCallPermission.getClass();
            if (this.permissionCase_ != 2 || this.permission_ == FunctionCallPermission.getDefaultInstance()) {
                this.permission_ = functionCallPermission;
            } else {
                this.permission_ = ((FunctionCallPermission.Builder) FunctionCallPermission.newBuilder((FunctionCallPermission) this.permission_).mergeFrom(functionCallPermission)).buildPartial();
            }
            this.permissionCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AccessKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<AccessKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFullAccess(FullAccessPermission fullAccessPermission) {
            fullAccessPermission.getClass();
            this.permission_ = fullAccessPermission;
            this.permissionCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setFunctionCall(FunctionCallPermission functionCallPermission) {
            functionCallPermission.getClass();
            this.permission_ = functionCallPermission;
            this.permissionCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AccessKey();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002<\u0000\u0003<\u0000", new Object[]{"permission_", "permissionCase_", "nonce_", FunctionCallPermission.class, FullAccessPermission.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<AccessKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (AccessKey.class) {
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

        public FullAccessPermission getFullAccess() {
            if (this.permissionCase_ == 3) {
                return (FullAccessPermission) this.permission_;
            }
            return FullAccessPermission.getDefaultInstance();
        }

        public FunctionCallPermission getFunctionCall() {
            if (this.permissionCase_ == 2) {
                return (FunctionCallPermission) this.permission_;
            }
            return FunctionCallPermission.getDefaultInstance();
        }

        public long getNonce() {
            return this.nonce_;
        }

        public PermissionCase getPermissionCase() {
            return PermissionCase.forNumber(this.permissionCase_);
        }

        public boolean hasFullAccess() {
            if (this.permissionCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasFunctionCall() {
            if (this.permissionCase_ == 2) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(AccessKey accessKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(accessKey);
        }

        public static AccessKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AccessKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static AccessKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AccessKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static AccessKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AccessKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static AccessKey parseFrom(InputStream inputStream) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AccessKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AccessKey parseFrom(C4969g gVar) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static AccessKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (AccessKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AccessKeyOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        FullAccessPermission getFullAccess();

        FunctionCallPermission getFunctionCall();

        long getNonce();

        AccessKey.PermissionCase getPermissionCase();

        boolean hasFullAccess();

        boolean hasFunctionCall();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Action extends GeneratedMessageLite<Action, Builder> implements ActionOrBuilder {
        public static final int ADD_KEY_FIELD_NUMBER = 6;
        public static final int CREATE_ACCOUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Action DEFAULT_INSTANCE;
        public static final int DELETE_ACCOUNT_FIELD_NUMBER = 8;
        public static final int DELETE_KEY_FIELD_NUMBER = 7;
        public static final int DEPLOY_CONTRACT_FIELD_NUMBER = 2;
        public static final int FUNCTION_CALL_FIELD_NUMBER = 3;
        private static volatile im4<Action> PARSER = null;
        public static final int STAKE_FIELD_NUMBER = 5;
        public static final int TRANSFER_FIELD_NUMBER = 4;
        private int payloadCase_ = 0;
        private Object payload_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Action, Builder> implements ActionOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearAddKey() {
                copyOnWrite();
                ((Action) this.instance).clearAddKey();
                return this;
            }

            public Builder clearCreateAccount() {
                copyOnWrite();
                ((Action) this.instance).clearCreateAccount();
                return this;
            }

            public Builder clearDeleteAccount() {
                copyOnWrite();
                ((Action) this.instance).clearDeleteAccount();
                return this;
            }

            public Builder clearDeleteKey() {
                copyOnWrite();
                ((Action) this.instance).clearDeleteKey();
                return this;
            }

            public Builder clearDeployContract() {
                copyOnWrite();
                ((Action) this.instance).clearDeployContract();
                return this;
            }

            public Builder clearFunctionCall() {
                copyOnWrite();
                ((Action) this.instance).clearFunctionCall();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((Action) this.instance).clearPayload();
                return this;
            }

            public Builder clearStake() {
                copyOnWrite();
                ((Action) this.instance).clearStake();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((Action) this.instance).clearTransfer();
                return this;
            }

            public AddKey getAddKey() {
                return ((Action) this.instance).getAddKey();
            }

            public CreateAccount getCreateAccount() {
                return ((Action) this.instance).getCreateAccount();
            }

            public DeleteAccount getDeleteAccount() {
                return ((Action) this.instance).getDeleteAccount();
            }

            public DeleteKey getDeleteKey() {
                return ((Action) this.instance).getDeleteKey();
            }

            public DeployContract getDeployContract() {
                return ((Action) this.instance).getDeployContract();
            }

            public FunctionCall getFunctionCall() {
                return ((Action) this.instance).getFunctionCall();
            }

            public PayloadCase getPayloadCase() {
                return ((Action) this.instance).getPayloadCase();
            }

            public Stake getStake() {
                return ((Action) this.instance).getStake();
            }

            public Transfer getTransfer() {
                return ((Action) this.instance).getTransfer();
            }

            public boolean hasAddKey() {
                return ((Action) this.instance).hasAddKey();
            }

            public boolean hasCreateAccount() {
                return ((Action) this.instance).hasCreateAccount();
            }

            public boolean hasDeleteAccount() {
                return ((Action) this.instance).hasDeleteAccount();
            }

            public boolean hasDeleteKey() {
                return ((Action) this.instance).hasDeleteKey();
            }

            public boolean hasDeployContract() {
                return ((Action) this.instance).hasDeployContract();
            }

            public boolean hasFunctionCall() {
                return ((Action) this.instance).hasFunctionCall();
            }

            public boolean hasStake() {
                return ((Action) this.instance).hasStake();
            }

            public boolean hasTransfer() {
                return ((Action) this.instance).hasTransfer();
            }

            public Builder mergeAddKey(AddKey addKey) {
                copyOnWrite();
                ((Action) this.instance).mergeAddKey(addKey);
                return this;
            }

            public Builder mergeCreateAccount(CreateAccount createAccount) {
                copyOnWrite();
                ((Action) this.instance).mergeCreateAccount(createAccount);
                return this;
            }

            public Builder mergeDeleteAccount(DeleteAccount deleteAccount) {
                copyOnWrite();
                ((Action) this.instance).mergeDeleteAccount(deleteAccount);
                return this;
            }

            public Builder mergeDeleteKey(DeleteKey deleteKey) {
                copyOnWrite();
                ((Action) this.instance).mergeDeleteKey(deleteKey);
                return this;
            }

            public Builder mergeDeployContract(DeployContract deployContract) {
                copyOnWrite();
                ((Action) this.instance).mergeDeployContract(deployContract);
                return this;
            }

            public Builder mergeFunctionCall(FunctionCall functionCall) {
                copyOnWrite();
                ((Action) this.instance).mergeFunctionCall(functionCall);
                return this;
            }

            public Builder mergeStake(Stake stake) {
                copyOnWrite();
                ((Action) this.instance).mergeStake(stake);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((Action) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setAddKey(AddKey addKey) {
                copyOnWrite();
                ((Action) this.instance).setAddKey(addKey);
                return this;
            }

            public Builder setCreateAccount(CreateAccount createAccount) {
                copyOnWrite();
                ((Action) this.instance).setCreateAccount(createAccount);
                return this;
            }

            public Builder setDeleteAccount(DeleteAccount deleteAccount) {
                copyOnWrite();
                ((Action) this.instance).setDeleteAccount(deleteAccount);
                return this;
            }

            public Builder setDeleteKey(DeleteKey deleteKey) {
                copyOnWrite();
                ((Action) this.instance).setDeleteKey(deleteKey);
                return this;
            }

            public Builder setDeployContract(DeployContract deployContract) {
                copyOnWrite();
                ((Action) this.instance).setDeployContract(deployContract);
                return this;
            }

            public Builder setFunctionCall(FunctionCall functionCall) {
                copyOnWrite();
                ((Action) this.instance).setFunctionCall(functionCall);
                return this;
            }

            public Builder setStake(Stake stake) {
                copyOnWrite();
                ((Action) this.instance).setStake(stake);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((Action) this.instance).setTransfer(transfer);
                return this;
            }

            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }

            public Builder setAddKey(AddKey.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setAddKey((AddKey) builder.build());
                return this;
            }

            public Builder setCreateAccount(CreateAccount.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setCreateAccount((CreateAccount) builder.build());
                return this;
            }

            public Builder setDeleteAccount(DeleteAccount.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setDeleteAccount((DeleteAccount) builder.build());
                return this;
            }

            public Builder setDeleteKey(DeleteKey.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setDeleteKey((DeleteKey) builder.build());
                return this;
            }

            public Builder setDeployContract(DeployContract.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setDeployContract((DeployContract) builder.build());
                return this;
            }

            public Builder setFunctionCall(FunctionCall.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setFunctionCall((FunctionCall) builder.build());
                return this;
            }

            public Builder setStake(Stake.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setStake((Stake) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        public enum PayloadCase {
            CREATE_ACCOUNT(1),
            DEPLOY_CONTRACT(2),
            FUNCTION_CALL(3),
            TRANSFER(4),
            STAKE(5),
            ADD_KEY(6),
            DELETE_KEY(7),
            DELETE_ACCOUNT(8),
            PAYLOAD_NOT_SET(0);
            
            private final int value;

            private PayloadCase(int i) {
                this.value = i;
            }

            public static PayloadCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return PAYLOAD_NOT_SET;
                    case 1:
                        return CREATE_ACCOUNT;
                    case 2:
                        return DEPLOY_CONTRACT;
                    case 3:
                        return FUNCTION_CALL;
                    case 4:
                        return TRANSFER;
                    case 5:
                        return STAKE;
                    case 6:
                        return ADD_KEY;
                    case 7:
                        return DELETE_KEY;
                    case 8:
                        return DELETE_ACCOUNT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PayloadCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        /* access modifiers changed from: private */
        public void clearAddKey() {
            if (this.payloadCase_ == 6) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCreateAccount() {
            if (this.payloadCase_ == 1) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDeleteAccount() {
            if (this.payloadCase_ == 8) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDeleteKey() {
            if (this.payloadCase_ == 7) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearDeployContract() {
            if (this.payloadCase_ == 2) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearFunctionCall() {
            if (this.payloadCase_ == 3) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearPayload() {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }

        /* access modifiers changed from: private */
        public void clearStake() {
            if (this.payloadCase_ == 5) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.payloadCase_ == 4) {
                this.payloadCase_ = 0;
                this.payload_ = null;
            }
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAddKey(AddKey addKey) {
            addKey.getClass();
            if (this.payloadCase_ != 6 || this.payload_ == AddKey.getDefaultInstance()) {
                this.payload_ = addKey;
            } else {
                this.payload_ = ((AddKey.Builder) AddKey.newBuilder((AddKey) this.payload_).mergeFrom(addKey)).buildPartial();
            }
            this.payloadCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeCreateAccount(CreateAccount createAccount) {
            createAccount.getClass();
            if (this.payloadCase_ != 1 || this.payload_ == CreateAccount.getDefaultInstance()) {
                this.payload_ = createAccount;
            } else {
                this.payload_ = ((CreateAccount.Builder) CreateAccount.newBuilder((CreateAccount) this.payload_).mergeFrom(createAccount)).buildPartial();
            }
            this.payloadCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeDeleteAccount(DeleteAccount deleteAccount) {
            deleteAccount.getClass();
            if (this.payloadCase_ != 8 || this.payload_ == DeleteAccount.getDefaultInstance()) {
                this.payload_ = deleteAccount;
            } else {
                this.payload_ = ((DeleteAccount.Builder) DeleteAccount.newBuilder((DeleteAccount) this.payload_).mergeFrom(deleteAccount)).buildPartial();
            }
            this.payloadCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeDeleteKey(DeleteKey deleteKey) {
            deleteKey.getClass();
            if (this.payloadCase_ != 7 || this.payload_ == DeleteKey.getDefaultInstance()) {
                this.payload_ = deleteKey;
            } else {
                this.payload_ = ((DeleteKey.Builder) DeleteKey.newBuilder((DeleteKey) this.payload_).mergeFrom(deleteKey)).buildPartial();
            }
            this.payloadCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeDeployContract(DeployContract deployContract) {
            deployContract.getClass();
            if (this.payloadCase_ != 2 || this.payload_ == DeployContract.getDefaultInstance()) {
                this.payload_ = deployContract;
            } else {
                this.payload_ = ((DeployContract.Builder) DeployContract.newBuilder((DeployContract) this.payload_).mergeFrom(deployContract)).buildPartial();
            }
            this.payloadCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeFunctionCall(FunctionCall functionCall) {
            functionCall.getClass();
            if (this.payloadCase_ != 3 || this.payload_ == FunctionCall.getDefaultInstance()) {
                this.payload_ = functionCall;
            } else {
                this.payload_ = ((FunctionCall.Builder) FunctionCall.newBuilder((FunctionCall) this.payload_).mergeFrom(functionCall)).buildPartial();
            }
            this.payloadCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeStake(Stake stake) {
            stake.getClass();
            if (this.payloadCase_ != 5 || this.payload_ == Stake.getDefaultInstance()) {
                this.payload_ = stake;
            } else {
                this.payload_ = ((Stake.Builder) Stake.newBuilder((Stake) this.payload_).mergeFrom(stake)).buildPartial();
            }
            this.payloadCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.payloadCase_ != 4 || this.payload_ == Transfer.getDefaultInstance()) {
                this.payload_ = transfer;
            } else {
                this.payload_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.payload_).mergeFrom(transfer)).buildPartial();
            }
            this.payloadCase_ = 4;
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
        public void setAddKey(AddKey addKey) {
            addKey.getClass();
            this.payload_ = addKey;
            this.payloadCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setCreateAccount(CreateAccount createAccount) {
            createAccount.getClass();
            this.payload_ = createAccount;
            this.payloadCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setDeleteAccount(DeleteAccount deleteAccount) {
            deleteAccount.getClass();
            this.payload_ = deleteAccount;
            this.payloadCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setDeleteKey(DeleteKey deleteKey) {
            deleteKey.getClass();
            this.payload_ = deleteKey;
            this.payloadCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setDeployContract(DeployContract deployContract) {
            deployContract.getClass();
            this.payload_ = deployContract;
            this.payloadCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setFunctionCall(FunctionCall functionCall) {
            functionCall.getClass();
            this.payload_ = functionCall;
            this.payloadCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void setStake(Stake stake) {
            stake.getClass();
            this.payload_ = stake;
            this.payloadCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.payload_ = transfer;
            this.payloadCase_ = 4;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"payload_", "payloadCase_", CreateAccount.class, DeployContract.class, FunctionCall.class, Transfer.class, Stake.class, AddKey.class, DeleteKey.class, DeleteAccount.class});
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

        public AddKey getAddKey() {
            if (this.payloadCase_ == 6) {
                return (AddKey) this.payload_;
            }
            return AddKey.getDefaultInstance();
        }

        public CreateAccount getCreateAccount() {
            if (this.payloadCase_ == 1) {
                return (CreateAccount) this.payload_;
            }
            return CreateAccount.getDefaultInstance();
        }

        public DeleteAccount getDeleteAccount() {
            if (this.payloadCase_ == 8) {
                return (DeleteAccount) this.payload_;
            }
            return DeleteAccount.getDefaultInstance();
        }

        public DeleteKey getDeleteKey() {
            if (this.payloadCase_ == 7) {
                return (DeleteKey) this.payload_;
            }
            return DeleteKey.getDefaultInstance();
        }

        public DeployContract getDeployContract() {
            if (this.payloadCase_ == 2) {
                return (DeployContract) this.payload_;
            }
            return DeployContract.getDefaultInstance();
        }

        public FunctionCall getFunctionCall() {
            if (this.payloadCase_ == 3) {
                return (FunctionCall) this.payload_;
            }
            return FunctionCall.getDefaultInstance();
        }

        public PayloadCase getPayloadCase() {
            return PayloadCase.forNumber(this.payloadCase_);
        }

        public Stake getStake() {
            if (this.payloadCase_ == 5) {
                return (Stake) this.payload_;
            }
            return Stake.getDefaultInstance();
        }

        public Transfer getTransfer() {
            if (this.payloadCase_ == 4) {
                return (Transfer) this.payload_;
            }
            return Transfer.getDefaultInstance();
        }

        public boolean hasAddKey() {
            if (this.payloadCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasCreateAccount() {
            if (this.payloadCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasDeleteAccount() {
            if (this.payloadCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasDeleteKey() {
            if (this.payloadCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasDeployContract() {
            if (this.payloadCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasFunctionCall() {
            if (this.payloadCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasStake() {
            if (this.payloadCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.payloadCase_ == 4) {
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
        AddKey getAddKey();

        CreateAccount getCreateAccount();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        DeleteAccount getDeleteAccount();

        DeleteKey getDeleteKey();

        DeployContract getDeployContract();

        FunctionCall getFunctionCall();

        Action.PayloadCase getPayloadCase();

        Stake getStake();

        Transfer getTransfer();

        boolean hasAddKey();

        boolean hasCreateAccount();

        boolean hasDeleteAccount();

        boolean hasDeleteKey();

        boolean hasDeployContract();

        boolean hasFunctionCall();

        boolean hasStake();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class AddKey extends GeneratedMessageLite<AddKey, Builder> implements AddKeyOrBuilder {
        public static final int ACCESS_KEY_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final AddKey DEFAULT_INSTANCE;
        private static volatile im4<AddKey> PARSER = null;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
        private AccessKey accessKey_;
        private PublicKey publicKey_;

        public static final class Builder extends GeneratedMessageLite.C4930a<AddKey, Builder> implements AddKeyOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearAccessKey() {
                copyOnWrite();
                ((AddKey) this.instance).clearAccessKey();
                return this;
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((AddKey) this.instance).clearPublicKey();
                return this;
            }

            public AccessKey getAccessKey() {
                return ((AddKey) this.instance).getAccessKey();
            }

            public PublicKey getPublicKey() {
                return ((AddKey) this.instance).getPublicKey();
            }

            public boolean hasAccessKey() {
                return ((AddKey) this.instance).hasAccessKey();
            }

            public boolean hasPublicKey() {
                return ((AddKey) this.instance).hasPublicKey();
            }

            public Builder mergeAccessKey(AccessKey accessKey) {
                copyOnWrite();
                ((AddKey) this.instance).mergeAccessKey(accessKey);
                return this;
            }

            public Builder mergePublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((AddKey) this.instance).mergePublicKey(publicKey);
                return this;
            }

            public Builder setAccessKey(AccessKey accessKey) {
                copyOnWrite();
                ((AddKey) this.instance).setAccessKey(accessKey);
                return this;
            }

            public Builder setPublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((AddKey) this.instance).setPublicKey(publicKey);
                return this;
            }

            private Builder() {
                super(AddKey.DEFAULT_INSTANCE);
            }

            public Builder setAccessKey(AccessKey.Builder builder) {
                copyOnWrite();
                ((AddKey) this.instance).setAccessKey((AccessKey) builder.build());
                return this;
            }

            public Builder setPublicKey(PublicKey.Builder builder) {
                copyOnWrite();
                ((AddKey) this.instance).setPublicKey((PublicKey) builder.build());
                return this;
            }
        }

        static {
            AddKey addKey = new AddKey();
            DEFAULT_INSTANCE = addKey;
            GeneratedMessageLite.registerDefaultInstance(AddKey.class, addKey);
        }

        private AddKey() {
        }

        /* access modifiers changed from: private */
        public void clearAccessKey() {
            this.accessKey_ = null;
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = null;
        }

        public static AddKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAccessKey(AccessKey accessKey) {
            accessKey.getClass();
            AccessKey accessKey2 = this.accessKey_;
            if (accessKey2 == null || accessKey2 == AccessKey.getDefaultInstance()) {
                this.accessKey_ = accessKey;
            } else {
                this.accessKey_ = (AccessKey) ((AccessKey.Builder) AccessKey.newBuilder(this.accessKey_).mergeFrom(accessKey)).buildPartial();
            }
        }

        /* access modifiers changed from: private */
        public void mergePublicKey(PublicKey publicKey) {
            publicKey.getClass();
            PublicKey publicKey2 = this.publicKey_;
            if (publicKey2 == null || publicKey2 == PublicKey.getDefaultInstance()) {
                this.publicKey_ = publicKey;
            } else {
                this.publicKey_ = (PublicKey) ((PublicKey.Builder) PublicKey.newBuilder(this.publicKey_).mergeFrom(publicKey)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AddKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AddKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<AddKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccessKey(AccessKey accessKey) {
            accessKey.getClass();
            this.accessKey_ = accessKey;
        }

        /* access modifiers changed from: private */
        public void setPublicKey(PublicKey publicKey) {
            publicKey.getClass();
            this.publicKey_ = publicKey;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new AddKey();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"publicKey_", "accessKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<AddKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (AddKey.class) {
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

        public AccessKey getAccessKey() {
            AccessKey accessKey = this.accessKey_;
            if (accessKey == null) {
                return AccessKey.getDefaultInstance();
            }
            return accessKey;
        }

        public PublicKey getPublicKey() {
            PublicKey publicKey = this.publicKey_;
            if (publicKey == null) {
                return PublicKey.getDefaultInstance();
            }
            return publicKey;
        }

        public boolean hasAccessKey() {
            if (this.accessKey_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasPublicKey() {
            if (this.publicKey_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(AddKey addKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(addKey);
        }

        public static AddKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AddKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AddKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static AddKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AddKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static AddKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AddKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static AddKey parseFrom(InputStream inputStream) throws IOException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AddKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static AddKey parseFrom(C4969g gVar) throws IOException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static AddKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (AddKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface AddKeyOrBuilder extends qu3 {
        AccessKey getAccessKey();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        PublicKey getPublicKey();

        boolean hasAccessKey();

        boolean hasPublicKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CreateAccount extends GeneratedMessageLite<CreateAccount, Builder> implements CreateAccountOrBuilder {
        /* access modifiers changed from: private */
        public static final CreateAccount DEFAULT_INSTANCE;
        private static volatile im4<CreateAccount> PARSER;

        public static final class Builder extends GeneratedMessageLite.C4930a<CreateAccount, Builder> implements CreateAccountOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            private Builder() {
                super(CreateAccount.DEFAULT_INSTANCE);
            }
        }

        static {
            CreateAccount createAccount = new CreateAccount();
            DEFAULT_INSTANCE = createAccount;
            GeneratedMessageLite.registerDefaultInstance(CreateAccount.class, createAccount);
        }

        private CreateAccount() {
        }

        public static CreateAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateAccount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAccount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<CreateAccount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new CreateAccount();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<CreateAccount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (CreateAccount.class) {
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

        public static Builder newBuilder(CreateAccount createAccount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(createAccount);
        }

        public static CreateAccount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAccount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static CreateAccount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CreateAccount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static CreateAccount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateAccount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static CreateAccount parseFrom(InputStream inputStream) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateAccount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static CreateAccount parseFrom(C4969g gVar) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static CreateAccount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (CreateAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface CreateAccountOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeleteAccount extends GeneratedMessageLite<DeleteAccount, Builder> implements DeleteAccountOrBuilder {
        public static final int BENEFICIARY_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DeleteAccount DEFAULT_INSTANCE;
        private static volatile im4<DeleteAccount> PARSER;
        private String beneficiaryId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<DeleteAccount, Builder> implements DeleteAccountOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearBeneficiaryId() {
                copyOnWrite();
                ((DeleteAccount) this.instance).clearBeneficiaryId();
                return this;
            }

            public String getBeneficiaryId() {
                return ((DeleteAccount) this.instance).getBeneficiaryId();
            }

            public ByteString getBeneficiaryIdBytes() {
                return ((DeleteAccount) this.instance).getBeneficiaryIdBytes();
            }

            public Builder setBeneficiaryId(String str) {
                copyOnWrite();
                ((DeleteAccount) this.instance).setBeneficiaryId(str);
                return this;
            }

            public Builder setBeneficiaryIdBytes(ByteString byteString) {
                copyOnWrite();
                ((DeleteAccount) this.instance).setBeneficiaryIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(DeleteAccount.DEFAULT_INSTANCE);
            }
        }

        static {
            DeleteAccount deleteAccount = new DeleteAccount();
            DEFAULT_INSTANCE = deleteAccount;
            GeneratedMessageLite.registerDefaultInstance(DeleteAccount.class, deleteAccount);
        }

        private DeleteAccount() {
        }

        /* access modifiers changed from: private */
        public void clearBeneficiaryId() {
            this.beneficiaryId_ = getDefaultInstance().getBeneficiaryId();
        }

        public static DeleteAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeleteAccount parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteAccount parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeleteAccount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBeneficiaryId(String str) {
            str.getClass();
            this.beneficiaryId_ = str;
        }

        /* access modifiers changed from: private */
        public void setBeneficiaryIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.beneficiaryId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeleteAccount();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"beneficiaryId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeleteAccount> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeleteAccount.class) {
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

        public String getBeneficiaryId() {
            return this.beneficiaryId_;
        }

        public ByteString getBeneficiaryIdBytes() {
            return ByteString.copyFromUtf8(this.beneficiaryId_);
        }

        public static Builder newBuilder(DeleteAccount deleteAccount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deleteAccount);
        }

        public static DeleteAccount parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeleteAccount parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeleteAccount parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeleteAccount parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeleteAccount parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteAccount parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeleteAccount parseFrom(InputStream inputStream) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteAccount parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeleteAccount parseFrom(C4969g gVar) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeleteAccount parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeleteAccount) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeleteAccountOrBuilder extends qu3 {
        String getBeneficiaryId();

        ByteString getBeneficiaryIdBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeleteKey extends GeneratedMessageLite<DeleteKey, Builder> implements DeleteKeyOrBuilder {
        /* access modifiers changed from: private */
        public static final DeleteKey DEFAULT_INSTANCE;
        private static volatile im4<DeleteKey> PARSER = null;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
        private PublicKey publicKey_;

        public static final class Builder extends GeneratedMessageLite.C4930a<DeleteKey, Builder> implements DeleteKeyOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((DeleteKey) this.instance).clearPublicKey();
                return this;
            }

            public PublicKey getPublicKey() {
                return ((DeleteKey) this.instance).getPublicKey();
            }

            public boolean hasPublicKey() {
                return ((DeleteKey) this.instance).hasPublicKey();
            }

            public Builder mergePublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((DeleteKey) this.instance).mergePublicKey(publicKey);
                return this;
            }

            public Builder setPublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((DeleteKey) this.instance).setPublicKey(publicKey);
                return this;
            }

            private Builder() {
                super(DeleteKey.DEFAULT_INSTANCE);
            }

            public Builder setPublicKey(PublicKey.Builder builder) {
                copyOnWrite();
                ((DeleteKey) this.instance).setPublicKey((PublicKey) builder.build());
                return this;
            }
        }

        static {
            DeleteKey deleteKey = new DeleteKey();
            DEFAULT_INSTANCE = deleteKey;
            GeneratedMessageLite.registerDefaultInstance(DeleteKey.class, deleteKey);
        }

        private DeleteKey() {
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = null;
        }

        public static DeleteKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePublicKey(PublicKey publicKey) {
            publicKey.getClass();
            PublicKey publicKey2 = this.publicKey_;
            if (publicKey2 == null || publicKey2 == PublicKey.getDefaultInstance()) {
                this.publicKey_ = publicKey;
            } else {
                this.publicKey_ = (PublicKey) ((PublicKey.Builder) PublicKey.newBuilder(this.publicKey_).mergeFrom(publicKey)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeleteKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeleteKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPublicKey(PublicKey publicKey) {
            publicKey.getClass();
            this.publicKey_ = publicKey;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeleteKey();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"publicKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeleteKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeleteKey.class) {
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

        public PublicKey getPublicKey() {
            PublicKey publicKey = this.publicKey_;
            if (publicKey == null) {
                return PublicKey.getDefaultInstance();
            }
            return publicKey;
        }

        public boolean hasPublicKey() {
            if (this.publicKey_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(DeleteKey deleteKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deleteKey);
        }

        public static DeleteKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeleteKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeleteKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeleteKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeleteKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeleteKey parseFrom(InputStream inputStream) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeleteKey parseFrom(C4969g gVar) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeleteKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeleteKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeleteKeyOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        PublicKey getPublicKey();

        boolean hasPublicKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DeployContract extends GeneratedMessageLite<DeployContract, Builder> implements DeployContractOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final DeployContract DEFAULT_INSTANCE;
        private static volatile im4<DeployContract> PARSER;
        private ByteString code_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<DeployContract, Builder> implements DeployContractOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((DeployContract) this.instance).clearCode();
                return this;
            }

            public ByteString getCode() {
                return ((DeployContract) this.instance).getCode();
            }

            public Builder setCode(ByteString byteString) {
                copyOnWrite();
                ((DeployContract) this.instance).setCode(byteString);
                return this;
            }

            private Builder() {
                super(DeployContract.DEFAULT_INSTANCE);
            }
        }

        static {
            DeployContract deployContract = new DeployContract();
            DEFAULT_INSTANCE = deployContract;
            GeneratedMessageLite.registerDefaultInstance(DeployContract.class, deployContract);
        }

        private DeployContract() {
        }

        /* access modifiers changed from: private */
        public void clearCode() {
            this.code_ = getDefaultInstance().getCode();
        }

        public static DeployContract getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeployContract parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeployContract parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<DeployContract> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCode(ByteString byteString) {
            byteString.getClass();
            this.code_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new DeployContract();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"code_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<DeployContract> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (DeployContract.class) {
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

        public ByteString getCode() {
            return this.code_;
        }

        public static Builder newBuilder(DeployContract deployContract) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deployContract);
        }

        public static DeployContract parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeployContract parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static DeployContract parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeployContract parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static DeployContract parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeployContract parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static DeployContract parseFrom(InputStream inputStream) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeployContract parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static DeployContract parseFrom(C4969g gVar) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static DeployContract parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (DeployContract) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface DeployContractOrBuilder extends qu3 {
        ByteString getCode();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FullAccessPermission extends GeneratedMessageLite<FullAccessPermission, Builder> implements FullAccessPermissionOrBuilder {
        /* access modifiers changed from: private */
        public static final FullAccessPermission DEFAULT_INSTANCE;
        private static volatile im4<FullAccessPermission> PARSER;

        public static final class Builder extends GeneratedMessageLite.C4930a<FullAccessPermission, Builder> implements FullAccessPermissionOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            private Builder() {
                super(FullAccessPermission.DEFAULT_INSTANCE);
            }
        }

        static {
            FullAccessPermission fullAccessPermission = new FullAccessPermission();
            DEFAULT_INSTANCE = fullAccessPermission;
            GeneratedMessageLite.registerDefaultInstance(FullAccessPermission.class, fullAccessPermission);
        }

        private FullAccessPermission() {
        }

        public static FullAccessPermission getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FullAccessPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FullAccessPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FullAccessPermission> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FullAccessPermission();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FullAccessPermission> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FullAccessPermission.class) {
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

        public static Builder newBuilder(FullAccessPermission fullAccessPermission) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fullAccessPermission);
        }

        public static FullAccessPermission parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FullAccessPermission parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FullAccessPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FullAccessPermission parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FullAccessPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FullAccessPermission parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FullAccessPermission parseFrom(InputStream inputStream) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FullAccessPermission parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FullAccessPermission parseFrom(C4969g gVar) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FullAccessPermission parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FullAccessPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FullAccessPermissionOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FunctionCall extends GeneratedMessageLite<FunctionCall, Builder> implements FunctionCallOrBuilder {
        public static final int ARGS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final FunctionCall DEFAULT_INSTANCE;
        public static final int DEPOSIT_FIELD_NUMBER = 4;
        public static final int GAS_FIELD_NUMBER = 3;
        public static final int METHOD_NAME_FIELD_NUMBER = 1;
        private static volatile im4<FunctionCall> PARSER;
        private ByteString args_;
        private ByteString deposit_;
        private long gas_;
        private String methodName_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<FunctionCall, Builder> implements FunctionCallOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearArgs() {
                copyOnWrite();
                ((FunctionCall) this.instance).clearArgs();
                return this;
            }

            public Builder clearDeposit() {
                copyOnWrite();
                ((FunctionCall) this.instance).clearDeposit();
                return this;
            }

            public Builder clearGas() {
                copyOnWrite();
                ((FunctionCall) this.instance).clearGas();
                return this;
            }

            public Builder clearMethodName() {
                copyOnWrite();
                ((FunctionCall) this.instance).clearMethodName();
                return this;
            }

            public ByteString getArgs() {
                return ((FunctionCall) this.instance).getArgs();
            }

            public ByteString getDeposit() {
                return ((FunctionCall) this.instance).getDeposit();
            }

            public long getGas() {
                return ((FunctionCall) this.instance).getGas();
            }

            public String getMethodName() {
                return ((FunctionCall) this.instance).getMethodName();
            }

            public ByteString getMethodNameBytes() {
                return ((FunctionCall) this.instance).getMethodNameBytes();
            }

            public Builder setArgs(ByteString byteString) {
                copyOnWrite();
                ((FunctionCall) this.instance).setArgs(byteString);
                return this;
            }

            public Builder setDeposit(ByteString byteString) {
                copyOnWrite();
                ((FunctionCall) this.instance).setDeposit(byteString);
                return this;
            }

            public Builder setGas(long j) {
                copyOnWrite();
                ((FunctionCall) this.instance).setGas(j);
                return this;
            }

            public Builder setMethodName(String str) {
                copyOnWrite();
                ((FunctionCall) this.instance).setMethodName(str);
                return this;
            }

            public Builder setMethodNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FunctionCall) this.instance).setMethodNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(FunctionCall.DEFAULT_INSTANCE);
            }
        }

        static {
            FunctionCall functionCall = new FunctionCall();
            DEFAULT_INSTANCE = functionCall;
            GeneratedMessageLite.registerDefaultInstance(FunctionCall.class, functionCall);
        }

        private FunctionCall() {
            ByteString byteString = ByteString.EMPTY;
            this.args_ = byteString;
            this.deposit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearArgs() {
            this.args_ = getDefaultInstance().getArgs();
        }

        /* access modifiers changed from: private */
        public void clearDeposit() {
            this.deposit_ = getDefaultInstance().getDeposit();
        }

        /* access modifiers changed from: private */
        public void clearGas() {
            this.gas_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMethodName() {
            this.methodName_ = getDefaultInstance().getMethodName();
        }

        public static FunctionCall getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FunctionCall parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FunctionCall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FunctionCall> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setArgs(ByteString byteString) {
            byteString.getClass();
            this.args_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setDeposit(ByteString byteString) {
            byteString.getClass();
            this.deposit_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setGas(long j) {
            this.gas_ = j;
        }

        /* access modifiers changed from: private */
        public void setMethodName(String str) {
            str.getClass();
            this.methodName_ = str;
        }

        /* access modifiers changed from: private */
        public void setMethodNameBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.methodName_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FunctionCall();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0003\u0004\n", new Object[]{"methodName_", "args_", "gas_", "deposit_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FunctionCall> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FunctionCall.class) {
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

        public ByteString getArgs() {
            return this.args_;
        }

        public ByteString getDeposit() {
            return this.deposit_;
        }

        public long getGas() {
            return this.gas_;
        }

        public String getMethodName() {
            return this.methodName_;
        }

        public ByteString getMethodNameBytes() {
            return ByteString.copyFromUtf8(this.methodName_);
        }

        public static Builder newBuilder(FunctionCall functionCall) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(functionCall);
        }

        public static FunctionCall parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FunctionCall parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FunctionCall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FunctionCall parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FunctionCall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FunctionCall parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FunctionCall parseFrom(InputStream inputStream) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FunctionCall parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FunctionCall parseFrom(C4969g gVar) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FunctionCall parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FunctionCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FunctionCallOrBuilder extends qu3 {
        ByteString getArgs();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getDeposit();

        long getGas();

        String getMethodName();

        ByteString getMethodNameBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FunctionCallPermission extends GeneratedMessageLite<FunctionCallPermission, Builder> implements FunctionCallPermissionOrBuilder {
        public static final int ALLOWANCE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FunctionCallPermission DEFAULT_INSTANCE;
        public static final int METHOD_NAMES_FIELD_NUMBER = 3;
        private static volatile im4<FunctionCallPermission> PARSER = null;
        public static final int RECEIVER_ID_FIELD_NUMBER = 2;
        private ByteString allowance_ = ByteString.EMPTY;
        private C5011t.C5020i<String> methodNames_ = GeneratedMessageLite.emptyProtobufList();
        private String receiverId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<FunctionCallPermission, Builder> implements FunctionCallPermissionOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder addAllMethodNames(Iterable<String> iterable) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).addAllMethodNames(iterable);
                return this;
            }

            public Builder addMethodNames(String str) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).addMethodNames(str);
                return this;
            }

            public Builder addMethodNamesBytes(ByteString byteString) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).addMethodNamesBytes(byteString);
                return this;
            }

            public Builder clearAllowance() {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).clearAllowance();
                return this;
            }

            public Builder clearMethodNames() {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).clearMethodNames();
                return this;
            }

            public Builder clearReceiverId() {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).clearReceiverId();
                return this;
            }

            public ByteString getAllowance() {
                return ((FunctionCallPermission) this.instance).getAllowance();
            }

            public String getMethodNames(int i) {
                return ((FunctionCallPermission) this.instance).getMethodNames(i);
            }

            public ByteString getMethodNamesBytes(int i) {
                return ((FunctionCallPermission) this.instance).getMethodNamesBytes(i);
            }

            public int getMethodNamesCount() {
                return ((FunctionCallPermission) this.instance).getMethodNamesCount();
            }

            public List<String> getMethodNamesList() {
                return Collections.unmodifiableList(((FunctionCallPermission) this.instance).getMethodNamesList());
            }

            public String getReceiverId() {
                return ((FunctionCallPermission) this.instance).getReceiverId();
            }

            public ByteString getReceiverIdBytes() {
                return ((FunctionCallPermission) this.instance).getReceiverIdBytes();
            }

            public Builder setAllowance(ByteString byteString) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).setAllowance(byteString);
                return this;
            }

            public Builder setMethodNames(int i, String str) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).setMethodNames(i, str);
                return this;
            }

            public Builder setReceiverId(String str) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).setReceiverId(str);
                return this;
            }

            public Builder setReceiverIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FunctionCallPermission) this.instance).setReceiverIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(FunctionCallPermission.DEFAULT_INSTANCE);
            }
        }

        static {
            FunctionCallPermission functionCallPermission = new FunctionCallPermission();
            DEFAULT_INSTANCE = functionCallPermission;
            GeneratedMessageLite.registerDefaultInstance(FunctionCallPermission.class, functionCallPermission);
        }

        private FunctionCallPermission() {
        }

        /* access modifiers changed from: private */
        public void addAllMethodNames(Iterable<String> iterable) {
            ensureMethodNamesIsMutable();
            C4949a.addAll(iterable, this.methodNames_);
        }

        /* access modifiers changed from: private */
        public void addMethodNames(String str) {
            str.getClass();
            ensureMethodNamesIsMutable();
            this.methodNames_.add(str);
        }

        /* access modifiers changed from: private */
        public void addMethodNamesBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            ensureMethodNamesIsMutable();
            this.methodNames_.add(byteString.toStringUtf8());
        }

        /* access modifiers changed from: private */
        public void clearAllowance() {
            this.allowance_ = getDefaultInstance().getAllowance();
        }

        /* access modifiers changed from: private */
        public void clearMethodNames() {
            this.methodNames_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearReceiverId() {
            this.receiverId_ = getDefaultInstance().getReceiverId();
        }

        private void ensureMethodNamesIsMutable() {
            C5011t.C5020i<String> iVar = this.methodNames_;
            if (!iVar.mo37090v()) {
                this.methodNames_ = GeneratedMessageLite.mutableCopy(iVar);
            }
        }

        public static FunctionCallPermission getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FunctionCallPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FunctionCallPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<FunctionCallPermission> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAllowance(ByteString byteString) {
            byteString.getClass();
            this.allowance_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setMethodNames(int i, String str) {
            str.getClass();
            ensureMethodNamesIsMutable();
            this.methodNames_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setReceiverId(String str) {
            str.getClass();
            this.receiverId_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiverId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FunctionCallPermission();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002Ȉ\u0003Ț", new Object[]{"allowance_", "receiverId_", "methodNames_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<FunctionCallPermission> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (FunctionCallPermission.class) {
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

        public ByteString getAllowance() {
            return this.allowance_;
        }

        public String getMethodNames(int i) {
            return this.methodNames_.get(i);
        }

        public ByteString getMethodNamesBytes(int i) {
            return ByteString.copyFromUtf8(this.methodNames_.get(i));
        }

        public int getMethodNamesCount() {
            return this.methodNames_.size();
        }

        public List<String> getMethodNamesList() {
            return this.methodNames_;
        }

        public String getReceiverId() {
            return this.receiverId_;
        }

        public ByteString getReceiverIdBytes() {
            return ByteString.copyFromUtf8(this.receiverId_);
        }

        public static Builder newBuilder(FunctionCallPermission functionCallPermission) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(functionCallPermission);
        }

        public static FunctionCallPermission parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FunctionCallPermission parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static FunctionCallPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FunctionCallPermission parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static FunctionCallPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FunctionCallPermission parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static FunctionCallPermission parseFrom(InputStream inputStream) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FunctionCallPermission parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static FunctionCallPermission parseFrom(C4969g gVar) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static FunctionCallPermission parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (FunctionCallPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface FunctionCallPermissionOrBuilder extends qu3 {
        ByteString getAllowance();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        String getMethodNames(int i);

        ByteString getMethodNamesBytes(int i);

        int getMethodNamesCount();

        List<String> getMethodNamesList();

        String getReceiverId();

        ByteString getReceiverIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class PublicKey extends GeneratedMessageLite<PublicKey, Builder> implements PublicKeyOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final PublicKey DEFAULT_INSTANCE;
        public static final int KEY_TYPE_FIELD_NUMBER = 1;
        private static volatile im4<PublicKey> PARSER;
        private ByteString data_ = ByteString.EMPTY;
        private int keyType_;

        public static final class Builder extends GeneratedMessageLite.C4930a<PublicKey, Builder> implements PublicKeyOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((PublicKey) this.instance).clearData();
                return this;
            }

            public Builder clearKeyType() {
                copyOnWrite();
                ((PublicKey) this.instance).clearKeyType();
                return this;
            }

            public ByteString getData() {
                return ((PublicKey) this.instance).getData();
            }

            public int getKeyType() {
                return ((PublicKey) this.instance).getKeyType();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((PublicKey) this.instance).setData(byteString);
                return this;
            }

            public Builder setKeyType(int i) {
                copyOnWrite();
                ((PublicKey) this.instance).setKeyType(i);
                return this;
            }

            private Builder() {
                super(PublicKey.DEFAULT_INSTANCE);
            }
        }

        static {
            PublicKey publicKey = new PublicKey();
            DEFAULT_INSTANCE = publicKey;
            GeneratedMessageLite.registerDefaultInstance(PublicKey.class, publicKey);
        }

        private PublicKey() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearKeyType() {
            this.keyType_ = 0;
        }

        public static PublicKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<PublicKey> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setKeyType(int i) {
            this.keyType_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PublicKey();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"keyType_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<PublicKey> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (PublicKey.class) {
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

        public int getKeyType() {
            return this.keyType_;
        }

        public static Builder newBuilder(PublicKey publicKey) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(publicKey);
        }

        public static PublicKey parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PublicKey parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static PublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PublicKey parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static PublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PublicKey parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static PublicKey parseFrom(InputStream inputStream) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PublicKey parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static PublicKey parseFrom(C4969g gVar) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static PublicKey parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface PublicKeyOrBuilder extends qu3 {
        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        int getKeyType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 5;
        public static final int BLOCK_HASH_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int NONCE_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATE_KEY_FIELD_NUMBER = 6;
        public static final int RECEIVER_ID_FIELD_NUMBER = 3;
        public static final int SIGNER_ID_FIELD_NUMBER = 1;
        private C5011t.C5020i<Action> actions_;
        private ByteString blockHash_;
        private long nonce_;
        private ByteString privateKey_;
        private String receiverId_ = "";
        private String signerId_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder addActions(Action action) {
                copyOnWrite();
                ((SigningInput) this.instance).addActions(action);
                return this;
            }

            public Builder addAllActions(Iterable<? extends Action> iterable) {
                copyOnWrite();
                ((SigningInput) this.instance).addAllActions(iterable);
                return this;
            }

            public Builder clearActions() {
                copyOnWrite();
                ((SigningInput) this.instance).clearActions();
                return this;
            }

            public Builder clearBlockHash() {
                copyOnWrite();
                ((SigningInput) this.instance).clearBlockHash();
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

            public Builder clearReceiverId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearReceiverId();
                return this;
            }

            public Builder clearSignerId() {
                copyOnWrite();
                ((SigningInput) this.instance).clearSignerId();
                return this;
            }

            public Action getActions(int i) {
                return ((SigningInput) this.instance).getActions(i);
            }

            public int getActionsCount() {
                return ((SigningInput) this.instance).getActionsCount();
            }

            public List<Action> getActionsList() {
                return Collections.unmodifiableList(((SigningInput) this.instance).getActionsList());
            }

            public ByteString getBlockHash() {
                return ((SigningInput) this.instance).getBlockHash();
            }

            public long getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public String getReceiverId() {
                return ((SigningInput) this.instance).getReceiverId();
            }

            public ByteString getReceiverIdBytes() {
                return ((SigningInput) this.instance).getReceiverIdBytes();
            }

            public String getSignerId() {
                return ((SigningInput) this.instance).getSignerId();
            }

            public ByteString getSignerIdBytes() {
                return ((SigningInput) this.instance).getSignerIdBytes();
            }

            public Builder removeActions(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).removeActions(i);
                return this;
            }

            public Builder setActions(int i, Action action) {
                copyOnWrite();
                ((SigningInput) this.instance).setActions(i, action);
                return this;
            }

            public Builder setBlockHash(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setBlockHash(byteString);
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

            public Builder setReceiverId(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setReceiverId(str);
                return this;
            }

            public Builder setReceiverIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setReceiverIdBytes(byteString);
                return this;
            }

            public Builder setSignerId(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setSignerId(str);
                return this;
            }

            public Builder setSignerIdBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setSignerIdBytes(byteString);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder addActions(int i, Action action) {
                copyOnWrite();
                ((SigningInput) this.instance).addActions(i, action);
                return this;
            }

            public Builder setActions(int i, Action.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setActions(i, (Action) builder.build());
                return this;
            }

            public Builder addActions(Action.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addActions((Action) builder.build());
                return this;
            }

            public Builder addActions(int i, Action.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).addActions(i, (Action) builder.build());
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
            this.blockHash_ = byteString;
            this.actions_ = GeneratedMessageLite.emptyProtobufList();
            this.privateKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void addActions(Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.add(action);
        }

        /* access modifiers changed from: private */
        public void addAllActions(Iterable<? extends Action> iterable) {
            ensureActionsIsMutable();
            C4949a.addAll(iterable, this.actions_);
        }

        /* access modifiers changed from: private */
        public void clearActions() {
            this.actions_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearBlockHash() {
            this.blockHash_ = getDefaultInstance().getBlockHash();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPrivateKey() {
            this.privateKey_ = getDefaultInstance().getPrivateKey();
        }

        /* access modifiers changed from: private */
        public void clearReceiverId() {
            this.receiverId_ = getDefaultInstance().getReceiverId();
        }

        /* access modifiers changed from: private */
        public void clearSignerId() {
            this.signerId_ = getDefaultInstance().getSignerId();
        }

        private void ensureActionsIsMutable() {
            C5011t.C5020i<Action> iVar = this.actions_;
            if (!iVar.mo37090v()) {
                this.actions_ = GeneratedMessageLite.mutableCopy(iVar);
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
        public void removeActions(int i) {
            ensureActionsIsMutable();
            this.actions_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setActions(int i, Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.set(i, action);
        }

        /* access modifiers changed from: private */
        public void setBlockHash(ByteString byteString) {
            byteString.getClass();
            this.blockHash_ = byteString;
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

        /* access modifiers changed from: private */
        public void setReceiverId(String str) {
            str.getClass();
            this.receiverId_ = str;
        }

        /* access modifiers changed from: private */
        public void setReceiverIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.receiverId_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setSignerId(String str) {
            str.getClass();
            this.signerId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSignerIdBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.signerId_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ\u0004\n\u0005\u001b\u0006\n", new Object[]{"signerId_", "nonce_", "receiverId_", "blockHash_", "actions_", Action.class, "privateKey_"});
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

        public Action getActions(int i) {
            return this.actions_.get(i);
        }

        public int getActionsCount() {
            return this.actions_.size();
        }

        public List<Action> getActionsList() {
            return this.actions_;
        }

        public ActionOrBuilder getActionsOrBuilder(int i) {
            return this.actions_.get(i);
        }

        public List<? extends ActionOrBuilder> getActionsOrBuilderList() {
            return this.actions_;
        }

        public ByteString getBlockHash() {
            return this.blockHash_;
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public String getReceiverId() {
            return this.receiverId_;
        }

        public ByteString getReceiverIdBytes() {
            return ByteString.copyFromUtf8(this.receiverId_);
        }

        public String getSignerId() {
            return this.signerId_;
        }

        public ByteString getSignerIdBytes() {
            return ByteString.copyFromUtf8(this.signerId_);
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
        public void addActions(int i, Action action) {
            action.getClass();
            ensureActionsIsMutable();
            this.actions_.add(i, action);
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
        Action getActions(int i);

        int getActionsCount();

        List<Action> getActionsList();

        ByteString getBlockHash();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getNonce();

        ByteString getPrivateKey();

        String getReceiverId();

        ByteString getReceiverIdBytes();

        String getSignerId();

        ByteString getSignerIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int HASH_FIELD_NUMBER = 2;
        private static volatile im4<SigningOutput> PARSER = null;
        public static final int SIGNED_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString hash_;
        private ByteString signedTransaction_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearHash() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearHash();
                return this;
            }

            public Builder clearSignedTransaction() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearSignedTransaction();
                return this;
            }

            public ByteString getHash() {
                return ((SigningOutput) this.instance).getHash();
            }

            public ByteString getSignedTransaction() {
                return ((SigningOutput) this.instance).getSignedTransaction();
            }

            public Builder setHash(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setHash(byteString);
                return this;
            }

            public Builder setSignedTransaction(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setSignedTransaction(byteString);
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
            this.signedTransaction_ = byteString;
            this.hash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
        }

        /* access modifiers changed from: private */
        public void clearSignedTransaction() {
            this.signedTransaction_ = getDefaultInstance().getSignedTransaction();
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
        public void setHash(ByteString byteString) {
            byteString.getClass();
            this.hash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignedTransaction(ByteString byteString) {
            byteString.getClass();
            this.signedTransaction_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"signedTransaction_", "hash_"});
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

        public ByteString getHash() {
            return this.hash_;
        }

        public ByteString getSignedTransaction() {
            return this.signedTransaction_;
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

        ByteString getHash();

        ByteString getSignedTransaction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Stake extends GeneratedMessageLite<Stake, Builder> implements StakeOrBuilder {
        /* access modifiers changed from: private */
        public static final Stake DEFAULT_INSTANCE;
        private static volatile im4<Stake> PARSER = null;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
        public static final int STAKE_FIELD_NUMBER = 1;
        private PublicKey publicKey_;
        private ByteString stake_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<Stake, Builder> implements StakeOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearPublicKey() {
                copyOnWrite();
                ((Stake) this.instance).clearPublicKey();
                return this;
            }

            public Builder clearStake() {
                copyOnWrite();
                ((Stake) this.instance).clearStake();
                return this;
            }

            public PublicKey getPublicKey() {
                return ((Stake) this.instance).getPublicKey();
            }

            public ByteString getStake() {
                return ((Stake) this.instance).getStake();
            }

            public boolean hasPublicKey() {
                return ((Stake) this.instance).hasPublicKey();
            }

            public Builder mergePublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((Stake) this.instance).mergePublicKey(publicKey);
                return this;
            }

            public Builder setPublicKey(PublicKey publicKey) {
                copyOnWrite();
                ((Stake) this.instance).setPublicKey(publicKey);
                return this;
            }

            public Builder setStake(ByteString byteString) {
                copyOnWrite();
                ((Stake) this.instance).setStake(byteString);
                return this;
            }

            private Builder() {
                super(Stake.DEFAULT_INSTANCE);
            }

            public Builder setPublicKey(PublicKey.Builder builder) {
                copyOnWrite();
                ((Stake) this.instance).setPublicKey((PublicKey) builder.build());
                return this;
            }
        }

        static {
            Stake stake = new Stake();
            DEFAULT_INSTANCE = stake;
            GeneratedMessageLite.registerDefaultInstance(Stake.class, stake);
        }

        private Stake() {
        }

        /* access modifiers changed from: private */
        public void clearPublicKey() {
            this.publicKey_ = null;
        }

        /* access modifiers changed from: private */
        public void clearStake() {
            this.stake_ = getDefaultInstance().getStake();
        }

        public static Stake getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePublicKey(PublicKey publicKey) {
            publicKey.getClass();
            PublicKey publicKey2 = this.publicKey_;
            if (publicKey2 == null || publicKey2 == PublicKey.getDefaultInstance()) {
                this.publicKey_ = publicKey;
            } else {
                this.publicKey_ = (PublicKey) ((PublicKey.Builder) PublicKey.newBuilder(this.publicKey_).mergeFrom(publicKey)).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Stake parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Stake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Stake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Stake> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPublicKey(PublicKey publicKey) {
            publicKey.getClass();
            this.publicKey_ = publicKey;
        }

        /* access modifiers changed from: private */
        public void setStake(ByteString byteString) {
            byteString.getClass();
            this.stake_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Stake();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\t", new Object[]{"stake_", "publicKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Stake> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Stake.class) {
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

        public PublicKey getPublicKey() {
            PublicKey publicKey = this.publicKey_;
            if (publicKey == null) {
                return PublicKey.getDefaultInstance();
            }
            return publicKey;
        }

        public ByteString getStake() {
            return this.stake_;
        }

        public boolean hasPublicKey() {
            if (this.publicKey_ != null) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Stake stake) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stake);
        }

        public static Stake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Stake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Stake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Stake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Stake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Stake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Stake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Stake parseFrom(InputStream inputStream) throws IOException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Stake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Stake parseFrom(C4969g gVar) throws IOException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Stake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Stake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StakeOrBuilder extends qu3 {
        /* synthetic */ C4956c0 getDefaultInstanceForType();

        PublicKey getPublicKey();

        ByteString getStake();

        boolean hasPublicKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        public static final int DEPOSIT_FIELD_NUMBER = 1;
        private static volatile im4<Transfer> PARSER;
        private ByteString deposit_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97511 r1) {
                this();
            }

            public Builder clearDeposit() {
                copyOnWrite();
                ((Transfer) this.instance).clearDeposit();
                return this;
            }

            public ByteString getDeposit() {
                return ((Transfer) this.instance).getDeposit();
            }

            public Builder setDeposit(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setDeposit(byteString);
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
        public void clearDeposit() {
            this.deposit_ = getDefaultInstance().getDeposit();
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
        public void setDeposit(ByteString byteString) {
            byteString.getClass();
            this.deposit_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97511.f46567xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97511) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"deposit_"});
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

        public ByteString getDeposit() {
            return this.deposit_;
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

        ByteString getDeposit();

        /* synthetic */ boolean isInitialized();
    }

    private NEAR() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
