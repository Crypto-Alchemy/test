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

public final class IoTeX {

    /* renamed from: wallet.core.jni.proto.IoTeX$1 */
    public static /* synthetic */ class C97501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f46566xa1df5c61;

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
                f46566xa1df5c61 = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f46566xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wallet.core.jni.proto.IoTeX.C97501.<clinit>():void");
        }
    }

    public static final class Action extends GeneratedMessageLite<Action, Builder> implements ActionOrBuilder {
        public static final int CORE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Action DEFAULT_INSTANCE;
        private static volatile im4<Action> PARSER = null;
        public static final int SENDERPUBKEY_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 3;
        private ActionCore core_;
        private ByteString senderPubKey_;
        private ByteString signature_;

        public static final class Builder extends GeneratedMessageLite.C4930a<Action, Builder> implements ActionOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearCore() {
                copyOnWrite();
                ((Action) this.instance).clearCore();
                return this;
            }

            public Builder clearSenderPubKey() {
                copyOnWrite();
                ((Action) this.instance).clearSenderPubKey();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((Action) this.instance).clearSignature();
                return this;
            }

            public ActionCore getCore() {
                return ((Action) this.instance).getCore();
            }

            public ByteString getSenderPubKey() {
                return ((Action) this.instance).getSenderPubKey();
            }

            public ByteString getSignature() {
                return ((Action) this.instance).getSignature();
            }

            public boolean hasCore() {
                return ((Action) this.instance).hasCore();
            }

            public Builder mergeCore(ActionCore actionCore) {
                copyOnWrite();
                ((Action) this.instance).mergeCore(actionCore);
                return this;
            }

            public Builder setCore(ActionCore actionCore) {
                copyOnWrite();
                ((Action) this.instance).setCore(actionCore);
                return this;
            }

            public Builder setSenderPubKey(ByteString byteString) {
                copyOnWrite();
                ((Action) this.instance).setSenderPubKey(byteString);
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                copyOnWrite();
                ((Action) this.instance).setSignature(byteString);
                return this;
            }

            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }

            public Builder setCore(ActionCore.Builder builder) {
                copyOnWrite();
                ((Action) this.instance).setCore((ActionCore) builder.build());
                return this;
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            GeneratedMessageLite.registerDefaultInstance(Action.class, action);
        }

        private Action() {
            ByteString byteString = ByteString.EMPTY;
            this.senderPubKey_ = byteString;
            this.signature_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearCore() {
            this.core_ = null;
        }

        /* access modifiers changed from: private */
        public void clearSenderPubKey() {
            this.senderPubKey_ = getDefaultInstance().getSenderPubKey();
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.signature_ = getDefaultInstance().getSignature();
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCore(ActionCore actionCore) {
            actionCore.getClass();
            ActionCore actionCore2 = this.core_;
            if (actionCore2 == null || actionCore2 == ActionCore.getDefaultInstance()) {
                this.core_ = actionCore;
            } else {
                this.core_ = (ActionCore) ((ActionCore.Builder) ActionCore.newBuilder(this.core_).mergeFrom(actionCore)).buildPartial();
            }
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
        public void setCore(ActionCore actionCore) {
            actionCore.getClass();
            this.core_ = actionCore;
        }

        /* access modifiers changed from: private */
        public void setSenderPubKey(ByteString byteString) {
            byteString.getClass();
            this.senderPubKey_ = byteString;
        }

        /* access modifiers changed from: private */
        public void setSignature(ByteString byteString) {
            byteString.getClass();
            this.signature_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Action();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\n\u0003\n", new Object[]{"core_", "senderPubKey_", "signature_"});
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

        public ActionCore getCore() {
            ActionCore actionCore = this.core_;
            if (actionCore == null) {
                return ActionCore.getDefaultInstance();
            }
            return actionCore;
        }

        public ByteString getSenderPubKey() {
            return this.senderPubKey_;
        }

        public ByteString getSignature() {
            return this.signature_;
        }

        public boolean hasCore() {
            if (this.core_ != null) {
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

    public static final class ActionCore extends GeneratedMessageLite<ActionCore, Builder> implements ActionCoreOrBuilder {
        public static final int CANDIDATEREGISTER_FIELD_NUMBER = 47;
        public static final int CANDIDATEUPDATE_FIELD_NUMBER = 48;
        /* access modifiers changed from: private */
        public static final ActionCore DEFAULT_INSTANCE;
        public static final int EXECUTION_FIELD_NUMBER = 12;
        public static final int GASLIMIT_FIELD_NUMBER = 3;
        public static final int GASPRICE_FIELD_NUMBER = 4;
        public static final int NONCE_FIELD_NUMBER = 2;
        private static volatile im4<ActionCore> PARSER = null;
        public static final int STAKEADDDEPOSIT_FIELD_NUMBER = 43;
        public static final int STAKECHANGECANDIDATE_FIELD_NUMBER = 45;
        public static final int STAKECREATE_FIELD_NUMBER = 40;
        public static final int STAKERESTAKE_FIELD_NUMBER = 44;
        public static final int STAKETRANSFEROWNERSHIP_FIELD_NUMBER = 46;
        public static final int STAKEUNSTAKE_FIELD_NUMBER = 41;
        public static final int STAKEWITHDRAW_FIELD_NUMBER = 42;
        public static final int TRANSFER_FIELD_NUMBER = 10;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;
        private long gasLimit_;
        private String gasPrice_ = "";
        private long nonce_;
        private int version_;

        public enum ActionCase {
            TRANSFER(10),
            EXECUTION(12),
            STAKECREATE(40),
            STAKEUNSTAKE(41),
            STAKEWITHDRAW(42),
            STAKEADDDEPOSIT(43),
            STAKERESTAKE(44),
            STAKECHANGECANDIDATE(45),
            STAKETRANSFEROWNERSHIP(46),
            CANDIDATEREGISTER(47),
            CANDIDATEUPDATE(48),
            ACTION_NOT_SET(0);
            
            private final int value;

            private ActionCase(int i) {
                this.value = i;
            }

            public static ActionCase forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 10) {
                    return TRANSFER;
                }
                if (i == 12) {
                    return EXECUTION;
                }
                switch (i) {
                    case 40:
                        return STAKECREATE;
                    case 41:
                        return STAKEUNSTAKE;
                    case 42:
                        return STAKEWITHDRAW;
                    case 43:
                        return STAKEADDDEPOSIT;
                    case 44:
                        return STAKERESTAKE;
                    case 45:
                        return STAKECHANGECANDIDATE;
                    case 46:
                        return STAKETRANSFEROWNERSHIP;
                    case 47:
                        return CANDIDATEREGISTER;
                    case 48:
                        return CANDIDATEUPDATE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<ActionCore, Builder> implements ActionCoreOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ActionCore) this.instance).clearAction();
                return this;
            }

            public Builder clearCandidateRegister() {
                copyOnWrite();
                ((ActionCore) this.instance).clearCandidateRegister();
                return this;
            }

            public Builder clearCandidateUpdate() {
                copyOnWrite();
                ((ActionCore) this.instance).clearCandidateUpdate();
                return this;
            }

            public Builder clearExecution() {
                copyOnWrite();
                ((ActionCore) this.instance).clearExecution();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((ActionCore) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((ActionCore) this.instance).clearGasPrice();
                return this;
            }

            public Builder clearNonce() {
                copyOnWrite();
                ((ActionCore) this.instance).clearNonce();
                return this;
            }

            public Builder clearStakeAddDeposit() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeAddDeposit();
                return this;
            }

            public Builder clearStakeChangeCandidate() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeChangeCandidate();
                return this;
            }

            public Builder clearStakeCreate() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeCreate();
                return this;
            }

            public Builder clearStakeRestake() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeRestake();
                return this;
            }

            public Builder clearStakeTransferOwnership() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeTransferOwnership();
                return this;
            }

            public Builder clearStakeUnstake() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeUnstake();
                return this;
            }

            public Builder clearStakeWithdraw() {
                copyOnWrite();
                ((ActionCore) this.instance).clearStakeWithdraw();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((ActionCore) this.instance).clearTransfer();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ActionCore) this.instance).clearVersion();
                return this;
            }

            public ActionCase getActionCase() {
                return ((ActionCore) this.instance).getActionCase();
            }

            public Staking.CandidateRegister getCandidateRegister() {
                return ((ActionCore) this.instance).getCandidateRegister();
            }

            public Staking.CandidateBasicInfo getCandidateUpdate() {
                return ((ActionCore) this.instance).getCandidateUpdate();
            }

            public ContractCall getExecution() {
                return ((ActionCore) this.instance).getExecution();
            }

            public long getGasLimit() {
                return ((ActionCore) this.instance).getGasLimit();
            }

            public String getGasPrice() {
                return ((ActionCore) this.instance).getGasPrice();
            }

            public ByteString getGasPriceBytes() {
                return ((ActionCore) this.instance).getGasPriceBytes();
            }

            public long getNonce() {
                return ((ActionCore) this.instance).getNonce();
            }

            public Staking.AddDeposit getStakeAddDeposit() {
                return ((ActionCore) this.instance).getStakeAddDeposit();
            }

            public Staking.ChangeCandidate getStakeChangeCandidate() {
                return ((ActionCore) this.instance).getStakeChangeCandidate();
            }

            public Staking.Create getStakeCreate() {
                return ((ActionCore) this.instance).getStakeCreate();
            }

            public Staking.Restake getStakeRestake() {
                return ((ActionCore) this.instance).getStakeRestake();
            }

            public Staking.TransferOwnership getStakeTransferOwnership() {
                return ((ActionCore) this.instance).getStakeTransferOwnership();
            }

            public Staking.Reclaim getStakeUnstake() {
                return ((ActionCore) this.instance).getStakeUnstake();
            }

            public Staking.Reclaim getStakeWithdraw() {
                return ((ActionCore) this.instance).getStakeWithdraw();
            }

            public Transfer getTransfer() {
                return ((ActionCore) this.instance).getTransfer();
            }

            public int getVersion() {
                return ((ActionCore) this.instance).getVersion();
            }

            public boolean hasCandidateRegister() {
                return ((ActionCore) this.instance).hasCandidateRegister();
            }

            public boolean hasCandidateUpdate() {
                return ((ActionCore) this.instance).hasCandidateUpdate();
            }

            public boolean hasExecution() {
                return ((ActionCore) this.instance).hasExecution();
            }

            public boolean hasStakeAddDeposit() {
                return ((ActionCore) this.instance).hasStakeAddDeposit();
            }

            public boolean hasStakeChangeCandidate() {
                return ((ActionCore) this.instance).hasStakeChangeCandidate();
            }

            public boolean hasStakeCreate() {
                return ((ActionCore) this.instance).hasStakeCreate();
            }

            public boolean hasStakeRestake() {
                return ((ActionCore) this.instance).hasStakeRestake();
            }

            public boolean hasStakeTransferOwnership() {
                return ((ActionCore) this.instance).hasStakeTransferOwnership();
            }

            public boolean hasStakeUnstake() {
                return ((ActionCore) this.instance).hasStakeUnstake();
            }

            public boolean hasStakeWithdraw() {
                return ((ActionCore) this.instance).hasStakeWithdraw();
            }

            public boolean hasTransfer() {
                return ((ActionCore) this.instance).hasTransfer();
            }

            public Builder mergeCandidateRegister(Staking.CandidateRegister candidateRegister) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeCandidateRegister(candidateRegister);
                return this;
            }

            public Builder mergeCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder mergeExecution(ContractCall contractCall) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeExecution(contractCall);
                return this;
            }

            public Builder mergeStakeAddDeposit(Staking.AddDeposit addDeposit) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder mergeStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder mergeStakeCreate(Staking.Create create) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeCreate(create);
                return this;
            }

            public Builder mergeStakeRestake(Staking.Restake restake) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeRestake(restake);
                return this;
            }

            public Builder mergeStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder mergeStakeUnstake(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeUnstake(reclaim);
                return this;
            }

            public Builder mergeStakeWithdraw(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeStakeWithdraw(reclaim);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((ActionCore) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setCandidateRegister(Staking.CandidateRegister candidateRegister) {
                copyOnWrite();
                ((ActionCore) this.instance).setCandidateRegister(candidateRegister);
                return this;
            }

            public Builder setCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((ActionCore) this.instance).setCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder setExecution(ContractCall contractCall) {
                copyOnWrite();
                ((ActionCore) this.instance).setExecution(contractCall);
                return this;
            }

            public Builder setGasLimit(long j) {
                copyOnWrite();
                ((ActionCore) this.instance).setGasLimit(j);
                return this;
            }

            public Builder setGasPrice(String str) {
                copyOnWrite();
                ((ActionCore) this.instance).setGasPrice(str);
                return this;
            }

            public Builder setGasPriceBytes(ByteString byteString) {
                copyOnWrite();
                ((ActionCore) this.instance).setGasPriceBytes(byteString);
                return this;
            }

            public Builder setNonce(long j) {
                copyOnWrite();
                ((ActionCore) this.instance).setNonce(j);
                return this;
            }

            public Builder setStakeAddDeposit(Staking.AddDeposit addDeposit) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder setStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder setStakeCreate(Staking.Create create) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeCreate(create);
                return this;
            }

            public Builder setStakeRestake(Staking.Restake restake) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeRestake(restake);
                return this;
            }

            public Builder setStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder setStakeUnstake(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeUnstake(reclaim);
                return this;
            }

            public Builder setStakeWithdraw(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeWithdraw(reclaim);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((ActionCore) this.instance).setTransfer(transfer);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((ActionCore) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(ActionCore.DEFAULT_INSTANCE);
            }

            public Builder setCandidateRegister(Staking.CandidateRegister.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setCandidateRegister((Staking.CandidateRegister) builder.build());
                return this;
            }

            public Builder setCandidateUpdate(Staking.CandidateBasicInfo.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setCandidateUpdate((Staking.CandidateBasicInfo) builder.build());
                return this;
            }

            public Builder setExecution(ContractCall.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setExecution((ContractCall) builder.build());
                return this;
            }

            public Builder setStakeAddDeposit(Staking.AddDeposit.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeAddDeposit((Staking.AddDeposit) builder.build());
                return this;
            }

            public Builder setStakeChangeCandidate(Staking.ChangeCandidate.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeChangeCandidate((Staking.ChangeCandidate) builder.build());
                return this;
            }

            public Builder setStakeCreate(Staking.Create.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeCreate((Staking.Create) builder.build());
                return this;
            }

            public Builder setStakeRestake(Staking.Restake.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeRestake((Staking.Restake) builder.build());
                return this;
            }

            public Builder setStakeTransferOwnership(Staking.TransferOwnership.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeTransferOwnership((Staking.TransferOwnership) builder.build());
                return this;
            }

            public Builder setStakeUnstake(Staking.Reclaim.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeUnstake((Staking.Reclaim) builder.build());
                return this;
            }

            public Builder setStakeWithdraw(Staking.Reclaim.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setStakeWithdraw((Staking.Reclaim) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((ActionCore) this.instance).setTransfer((Transfer) builder.build());
                return this;
            }
        }

        static {
            ActionCore actionCore = new ActionCore();
            DEFAULT_INSTANCE = actionCore;
            GeneratedMessageLite.registerDefaultInstance(ActionCore.class, actionCore);
        }

        private ActionCore() {
        }

        /* access modifiers changed from: private */
        public void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* access modifiers changed from: private */
        public void clearCandidateRegister() {
            if (this.actionCase_ == 47) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCandidateUpdate() {
            if (this.actionCase_ == 48) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearExecution() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
        }

        /* access modifiers changed from: private */
        public void clearNonce() {
            this.nonce_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeCreate() {
            if (this.actionCase_ == 40) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeRestake() {
            if (this.actionCase_ == 44) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeUnstake() {
            if (this.actionCase_ == 41) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeWithdraw() {
            if (this.actionCase_ == 42) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static ActionCore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateRegister(Staking.CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            if (this.actionCase_ != 47 || this.action_ == Staking.CandidateRegister.getDefaultInstance()) {
                this.action_ = candidateRegister;
            } else {
                this.action_ = ((Staking.CandidateRegister.Builder) Staking.CandidateRegister.newBuilder((Staking.CandidateRegister) this.action_).mergeFrom(candidateRegister)).buildPartial();
            }
            this.actionCase_ = 47;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            if (this.actionCase_ != 48 || this.action_ == Staking.CandidateBasicInfo.getDefaultInstance()) {
                this.action_ = candidateBasicInfo;
            } else {
                this.action_ = ((Staking.CandidateBasicInfo.Builder) Staking.CandidateBasicInfo.newBuilder((Staking.CandidateBasicInfo) this.action_).mergeFrom(candidateBasicInfo)).buildPartial();
            }
            this.actionCase_ = 48;
        }

        /* access modifiers changed from: private */
        public void mergeExecution(ContractCall contractCall) {
            contractCall.getClass();
            if (this.actionCase_ != 12 || this.action_ == ContractCall.getDefaultInstance()) {
                this.action_ = contractCall;
            } else {
                this.action_ = ((ContractCall.Builder) ContractCall.newBuilder((ContractCall) this.action_).mergeFrom(contractCall)).buildPartial();
            }
            this.actionCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeStakeAddDeposit(Staking.AddDeposit addDeposit) {
            addDeposit.getClass();
            if (this.actionCase_ != 43 || this.action_ == Staking.AddDeposit.getDefaultInstance()) {
                this.action_ = addDeposit;
            } else {
                this.action_ = ((Staking.AddDeposit.Builder) Staking.AddDeposit.newBuilder((Staking.AddDeposit) this.action_).mergeFrom(addDeposit)).buildPartial();
            }
            this.actionCase_ = 43;
        }

        /* access modifiers changed from: private */
        public void mergeStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            if (this.actionCase_ != 45 || this.action_ == Staking.ChangeCandidate.getDefaultInstance()) {
                this.action_ = changeCandidate;
            } else {
                this.action_ = ((Staking.ChangeCandidate.Builder) Staking.ChangeCandidate.newBuilder((Staking.ChangeCandidate) this.action_).mergeFrom(changeCandidate)).buildPartial();
            }
            this.actionCase_ = 45;
        }

        /* access modifiers changed from: private */
        public void mergeStakeCreate(Staking.Create create) {
            create.getClass();
            if (this.actionCase_ != 40 || this.action_ == Staking.Create.getDefaultInstance()) {
                this.action_ = create;
            } else {
                this.action_ = ((Staking.Create.Builder) Staking.Create.newBuilder((Staking.Create) this.action_).mergeFrom(create)).buildPartial();
            }
            this.actionCase_ = 40;
        }

        /* access modifiers changed from: private */
        public void mergeStakeRestake(Staking.Restake restake) {
            restake.getClass();
            if (this.actionCase_ != 44 || this.action_ == Staking.Restake.getDefaultInstance()) {
                this.action_ = restake;
            } else {
                this.action_ = ((Staking.Restake.Builder) Staking.Restake.newBuilder((Staking.Restake) this.action_).mergeFrom(restake)).buildPartial();
            }
            this.actionCase_ = 44;
        }

        /* access modifiers changed from: private */
        public void mergeStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            if (this.actionCase_ != 46 || this.action_ == Staking.TransferOwnership.getDefaultInstance()) {
                this.action_ = transferOwnership;
            } else {
                this.action_ = ((Staking.TransferOwnership.Builder) Staking.TransferOwnership.newBuilder((Staking.TransferOwnership) this.action_).mergeFrom(transferOwnership)).buildPartial();
            }
            this.actionCase_ = 46;
        }

        /* access modifiers changed from: private */
        public void mergeStakeUnstake(Staking.Reclaim reclaim) {
            reclaim.getClass();
            if (this.actionCase_ != 41 || this.action_ == Staking.Reclaim.getDefaultInstance()) {
                this.action_ = reclaim;
            } else {
                this.action_ = ((Staking.Reclaim.Builder) Staking.Reclaim.newBuilder((Staking.Reclaim) this.action_).mergeFrom(reclaim)).buildPartial();
            }
            this.actionCase_ = 41;
        }

        /* access modifiers changed from: private */
        public void mergeStakeWithdraw(Staking.Reclaim reclaim) {
            reclaim.getClass();
            if (this.actionCase_ != 42 || this.action_ == Staking.Reclaim.getDefaultInstance()) {
                this.action_ = reclaim;
            } else {
                this.action_ = ((Staking.Reclaim.Builder) Staking.Reclaim.newBuilder((Staking.Reclaim) this.action_).mergeFrom(reclaim)).buildPartial();
            }
            this.actionCase_ = 42;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.actionCase_ != 10 || this.action_ == Transfer.getDefaultInstance()) {
                this.action_ = transfer;
            } else {
                this.action_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.action_).mergeFrom(transfer)).buildPartial();
            }
            this.actionCase_ = 10;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ActionCore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionCore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ActionCore> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCandidateRegister(Staking.CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            this.action_ = candidateRegister;
            this.actionCase_ = 47;
        }

        /* access modifiers changed from: private */
        public void setCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            this.action_ = candidateBasicInfo;
            this.actionCase_ = 48;
        }

        /* access modifiers changed from: private */
        public void setExecution(ContractCall contractCall) {
            contractCall.getClass();
            this.action_ = contractCall;
            this.actionCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(long j) {
            this.gasLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(String str) {
            str.getClass();
            this.gasPrice_ = str;
        }

        /* access modifiers changed from: private */
        public void setGasPriceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.gasPrice_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setNonce(long j) {
            this.nonce_ = j;
        }

        /* access modifiers changed from: private */
        public void setStakeAddDeposit(Staking.AddDeposit addDeposit) {
            addDeposit.getClass();
            this.action_ = addDeposit;
            this.actionCase_ = 43;
        }

        /* access modifiers changed from: private */
        public void setStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            this.action_ = changeCandidate;
            this.actionCase_ = 45;
        }

        /* access modifiers changed from: private */
        public void setStakeCreate(Staking.Create create) {
            create.getClass();
            this.action_ = create;
            this.actionCase_ = 40;
        }

        /* access modifiers changed from: private */
        public void setStakeRestake(Staking.Restake restake) {
            restake.getClass();
            this.action_ = restake;
            this.actionCase_ = 44;
        }

        /* access modifiers changed from: private */
        public void setStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            this.action_ = transferOwnership;
            this.actionCase_ = 46;
        }

        /* access modifiers changed from: private */
        public void setStakeUnstake(Staking.Reclaim reclaim) {
            reclaim.getClass();
            this.action_ = reclaim;
            this.actionCase_ = 41;
        }

        /* access modifiers changed from: private */
        public void setStakeWithdraw(Staking.Reclaim reclaim) {
            reclaim.getClass();
            this.action_ = reclaim;
            this.actionCase_ = 42;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.action_ = transfer;
            this.actionCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<Staking.Reclaim> cls = Staking.Reclaim.class;
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ActionCore();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u00010\u000f\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004Ȉ\n<\u0000\f<\u0000(<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u00000<\u0000", new Object[]{"action_", "actionCase_", "version_", "nonce_", "gasLimit_", "gasPrice_", Transfer.class, ContractCall.class, Staking.Create.class, cls, cls, Staking.AddDeposit.class, Staking.Restake.class, Staking.ChangeCandidate.class, Staking.TransferOwnership.class, Staking.CandidateRegister.class, Staking.CandidateBasicInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ActionCore> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ActionCore.class) {
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

        public ActionCase getActionCase() {
            return ActionCase.forNumber(this.actionCase_);
        }

        public Staking.CandidateRegister getCandidateRegister() {
            if (this.actionCase_ == 47) {
                return (Staking.CandidateRegister) this.action_;
            }
            return Staking.CandidateRegister.getDefaultInstance();
        }

        public Staking.CandidateBasicInfo getCandidateUpdate() {
            if (this.actionCase_ == 48) {
                return (Staking.CandidateBasicInfo) this.action_;
            }
            return Staking.CandidateBasicInfo.getDefaultInstance();
        }

        public ContractCall getExecution() {
            if (this.actionCase_ == 12) {
                return (ContractCall) this.action_;
            }
            return ContractCall.getDefaultInstance();
        }

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public String getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getGasPriceBytes() {
            return ByteString.copyFromUtf8(this.gasPrice_);
        }

        public long getNonce() {
            return this.nonce_;
        }

        public Staking.AddDeposit getStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                return (Staking.AddDeposit) this.action_;
            }
            return Staking.AddDeposit.getDefaultInstance();
        }

        public Staking.ChangeCandidate getStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                return (Staking.ChangeCandidate) this.action_;
            }
            return Staking.ChangeCandidate.getDefaultInstance();
        }

        public Staking.Create getStakeCreate() {
            if (this.actionCase_ == 40) {
                return (Staking.Create) this.action_;
            }
            return Staking.Create.getDefaultInstance();
        }

        public Staking.Restake getStakeRestake() {
            if (this.actionCase_ == 44) {
                return (Staking.Restake) this.action_;
            }
            return Staking.Restake.getDefaultInstance();
        }

        public Staking.TransferOwnership getStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                return (Staking.TransferOwnership) this.action_;
            }
            return Staking.TransferOwnership.getDefaultInstance();
        }

        public Staking.Reclaim getStakeUnstake() {
            if (this.actionCase_ == 41) {
                return (Staking.Reclaim) this.action_;
            }
            return Staking.Reclaim.getDefaultInstance();
        }

        public Staking.Reclaim getStakeWithdraw() {
            if (this.actionCase_ == 42) {
                return (Staking.Reclaim) this.action_;
            }
            return Staking.Reclaim.getDefaultInstance();
        }

        public Transfer getTransfer() {
            if (this.actionCase_ == 10) {
                return (Transfer) this.action_;
            }
            return Transfer.getDefaultInstance();
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean hasCandidateRegister() {
            if (this.actionCase_ == 47) {
                return true;
            }
            return false;
        }

        public boolean hasCandidateUpdate() {
            if (this.actionCase_ == 48) {
                return true;
            }
            return false;
        }

        public boolean hasExecution() {
            if (this.actionCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                return true;
            }
            return false;
        }

        public boolean hasStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                return true;
            }
            return false;
        }

        public boolean hasStakeCreate() {
            if (this.actionCase_ == 40) {
                return true;
            }
            return false;
        }

        public boolean hasStakeRestake() {
            if (this.actionCase_ == 44) {
                return true;
            }
            return false;
        }

        public boolean hasStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                return true;
            }
            return false;
        }

        public boolean hasStakeUnstake() {
            if (this.actionCase_ == 41) {
                return true;
            }
            return false;
        }

        public boolean hasStakeWithdraw() {
            if (this.actionCase_ == 42) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.actionCase_ == 10) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(ActionCore actionCore) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(actionCore);
        }

        public static ActionCore parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ActionCore parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ActionCore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ActionCore parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ActionCore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ActionCore parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ActionCore parseFrom(InputStream inputStream) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ActionCore parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ActionCore parseFrom(C4969g gVar) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ActionCore parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ActionCore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ActionCoreOrBuilder extends qu3 {
        ActionCore.ActionCase getActionCase();

        Staking.CandidateRegister getCandidateRegister();

        Staking.CandidateBasicInfo getCandidateUpdate();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ContractCall getExecution();

        long getGasLimit();

        String getGasPrice();

        ByteString getGasPriceBytes();

        long getNonce();

        Staking.AddDeposit getStakeAddDeposit();

        Staking.ChangeCandidate getStakeChangeCandidate();

        Staking.Create getStakeCreate();

        Staking.Restake getStakeRestake();

        Staking.TransferOwnership getStakeTransferOwnership();

        Staking.Reclaim getStakeUnstake();

        Staking.Reclaim getStakeWithdraw();

        Transfer getTransfer();

        int getVersion();

        boolean hasCandidateRegister();

        boolean hasCandidateUpdate();

        boolean hasExecution();

        boolean hasStakeAddDeposit();

        boolean hasStakeChangeCandidate();

        boolean hasStakeCreate();

        boolean hasStakeRestake();

        boolean hasStakeTransferOwnership();

        boolean hasStakeUnstake();

        boolean hasStakeWithdraw();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public interface ActionOrBuilder extends qu3 {
        ActionCore getCore();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getSenderPubKey();

        ByteString getSignature();

        boolean hasCore();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ContractCall extends GeneratedMessageLite<ContractCall, Builder> implements ContractCallOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        public static final int CONTRACT_FIELD_NUMBER = 2;
        public static final int DATA_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final ContractCall DEFAULT_INSTANCE;
        private static volatile im4<ContractCall> PARSER;
        private String amount_ = "";
        private String contract_ = "";
        private ByteString data_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.C4930a<ContractCall, Builder> implements ContractCallOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((ContractCall) this.instance).clearAmount();
                return this;
            }

            public Builder clearContract() {
                copyOnWrite();
                ((ContractCall) this.instance).clearContract();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((ContractCall) this.instance).clearData();
                return this;
            }

            public String getAmount() {
                return ((ContractCall) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((ContractCall) this.instance).getAmountBytes();
            }

            public String getContract() {
                return ((ContractCall) this.instance).getContract();
            }

            public ByteString getContractBytes() {
                return ((ContractCall) this.instance).getContractBytes();
            }

            public ByteString getData() {
                return ((ContractCall) this.instance).getData();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((ContractCall) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((ContractCall) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setContract(String str) {
                copyOnWrite();
                ((ContractCall) this.instance).setContract(str);
                return this;
            }

            public Builder setContractBytes(ByteString byteString) {
                copyOnWrite();
                ((ContractCall) this.instance).setContractBytes(byteString);
                return this;
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((ContractCall) this.instance).setData(byteString);
                return this;
            }

            private Builder() {
                super(ContractCall.DEFAULT_INSTANCE);
            }
        }

        static {
            ContractCall contractCall = new ContractCall();
            DEFAULT_INSTANCE = contractCall;
            GeneratedMessageLite.registerDefaultInstance(ContractCall.class, contractCall);
        }

        private ContractCall() {
        }

        /* access modifiers changed from: private */
        public void clearAmount() {
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearContract() {
            this.contract_ = getDefaultInstance().getContract();
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static ContractCall getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ContractCall parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContractCall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<ContractCall> parser() {
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
        public void setContract(String str) {
            str.getClass();
            this.contract_ = str;
        }

        /* access modifiers changed from: private */
        public void setContractBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.contract_ = byteString.toStringUtf8();
        }

        /* access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ContractCall();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"amount_", "contract_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<ContractCall> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (ContractCall.class) {
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

        public String getContract() {
            return this.contract_;
        }

        public ByteString getContractBytes() {
            return ByteString.copyFromUtf8(this.contract_);
        }

        public ByteString getData() {
            return this.data_;
        }

        public static Builder newBuilder(ContractCall contractCall) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(contractCall);
        }

        public static ContractCall parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ContractCall parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static ContractCall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContractCall parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static ContractCall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContractCall parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static ContractCall parseFrom(InputStream inputStream) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContractCall parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static ContractCall parseFrom(C4969g gVar) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static ContractCall parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (ContractCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface ContractCallOrBuilder extends qu3 {
        String getAmount();

        ByteString getAmountBytes();

        String getContract();

        ByteString getContractBytes();

        ByteString getData();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningInput extends GeneratedMessageLite<SigningInput, Builder> implements SigningInputOrBuilder {
        public static final int CALL_FIELD_NUMBER = 12;
        public static final int CANDIDATEREGISTER_FIELD_NUMBER = 47;
        public static final int CANDIDATEUPDATE_FIELD_NUMBER = 48;
        /* access modifiers changed from: private */
        public static final SigningInput DEFAULT_INSTANCE;
        public static final int GASLIMIT_FIELD_NUMBER = 3;
        public static final int GASPRICE_FIELD_NUMBER = 4;
        public static final int NONCE_FIELD_NUMBER = 2;
        private static volatile im4<SigningInput> PARSER = null;
        public static final int PRIVATEKEY_FIELD_NUMBER = 5;
        public static final int STAKEADDDEPOSIT_FIELD_NUMBER = 43;
        public static final int STAKECHANGECANDIDATE_FIELD_NUMBER = 45;
        public static final int STAKECREATE_FIELD_NUMBER = 40;
        public static final int STAKERESTAKE_FIELD_NUMBER = 44;
        public static final int STAKETRANSFEROWNERSHIP_FIELD_NUMBER = 46;
        public static final int STAKEUNSTAKE_FIELD_NUMBER = 41;
        public static final int STAKEWITHDRAW_FIELD_NUMBER = 42;
        public static final int TRANSFER_FIELD_NUMBER = 10;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;
        private long gasLimit_;
        private String gasPrice_ = "";
        private long nonce_;
        private ByteString privateKey_ = ByteString.EMPTY;
        private int version_;

        public enum ActionCase {
            TRANSFER(10),
            CALL(12),
            STAKECREATE(40),
            STAKEUNSTAKE(41),
            STAKEWITHDRAW(42),
            STAKEADDDEPOSIT(43),
            STAKERESTAKE(44),
            STAKECHANGECANDIDATE(45),
            STAKETRANSFEROWNERSHIP(46),
            CANDIDATEREGISTER(47),
            CANDIDATEUPDATE(48),
            ACTION_NOT_SET(0);
            
            private final int value;

            private ActionCase(int i) {
                this.value = i;
            }

            public static ActionCase forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 10) {
                    return TRANSFER;
                }
                if (i == 12) {
                    return CALL;
                }
                switch (i) {
                    case 40:
                        return STAKECREATE;
                    case 41:
                        return STAKEUNSTAKE;
                    case 42:
                        return STAKEWITHDRAW;
                    case 43:
                        return STAKEADDDEPOSIT;
                    case 44:
                        return STAKERESTAKE;
                    case 45:
                        return STAKECHANGECANDIDATE;
                    case 46:
                        return STAKETRANSFEROWNERSHIP;
                    case 47:
                        return CANDIDATEREGISTER;
                    case 48:
                        return CANDIDATEUPDATE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ActionCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningInput, Builder> implements SigningInputOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((SigningInput) this.instance).clearAction();
                return this;
            }

            public Builder clearCall() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCall();
                return this;
            }

            public Builder clearCandidateRegister() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCandidateRegister();
                return this;
            }

            public Builder clearCandidateUpdate() {
                copyOnWrite();
                ((SigningInput) this.instance).clearCandidateUpdate();
                return this;
            }

            public Builder clearGasLimit() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasLimit();
                return this;
            }

            public Builder clearGasPrice() {
                copyOnWrite();
                ((SigningInput) this.instance).clearGasPrice();
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

            public Builder clearStakeAddDeposit() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeAddDeposit();
                return this;
            }

            public Builder clearStakeChangeCandidate() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeChangeCandidate();
                return this;
            }

            public Builder clearStakeCreate() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeCreate();
                return this;
            }

            public Builder clearStakeRestake() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeRestake();
                return this;
            }

            public Builder clearStakeTransferOwnership() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeTransferOwnership();
                return this;
            }

            public Builder clearStakeUnstake() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeUnstake();
                return this;
            }

            public Builder clearStakeWithdraw() {
                copyOnWrite();
                ((SigningInput) this.instance).clearStakeWithdraw();
                return this;
            }

            public Builder clearTransfer() {
                copyOnWrite();
                ((SigningInput) this.instance).clearTransfer();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((SigningInput) this.instance).clearVersion();
                return this;
            }

            public ActionCase getActionCase() {
                return ((SigningInput) this.instance).getActionCase();
            }

            public ContractCall getCall() {
                return ((SigningInput) this.instance).getCall();
            }

            public Staking.CandidateRegister getCandidateRegister() {
                return ((SigningInput) this.instance).getCandidateRegister();
            }

            public Staking.CandidateBasicInfo getCandidateUpdate() {
                return ((SigningInput) this.instance).getCandidateUpdate();
            }

            public long getGasLimit() {
                return ((SigningInput) this.instance).getGasLimit();
            }

            public String getGasPrice() {
                return ((SigningInput) this.instance).getGasPrice();
            }

            public ByteString getGasPriceBytes() {
                return ((SigningInput) this.instance).getGasPriceBytes();
            }

            public long getNonce() {
                return ((SigningInput) this.instance).getNonce();
            }

            public ByteString getPrivateKey() {
                return ((SigningInput) this.instance).getPrivateKey();
            }

            public Staking.AddDeposit getStakeAddDeposit() {
                return ((SigningInput) this.instance).getStakeAddDeposit();
            }

            public Staking.ChangeCandidate getStakeChangeCandidate() {
                return ((SigningInput) this.instance).getStakeChangeCandidate();
            }

            public Staking.Create getStakeCreate() {
                return ((SigningInput) this.instance).getStakeCreate();
            }

            public Staking.Restake getStakeRestake() {
                return ((SigningInput) this.instance).getStakeRestake();
            }

            public Staking.TransferOwnership getStakeTransferOwnership() {
                return ((SigningInput) this.instance).getStakeTransferOwnership();
            }

            public Staking.Reclaim getStakeUnstake() {
                return ((SigningInput) this.instance).getStakeUnstake();
            }

            public Staking.Reclaim getStakeWithdraw() {
                return ((SigningInput) this.instance).getStakeWithdraw();
            }

            public Transfer getTransfer() {
                return ((SigningInput) this.instance).getTransfer();
            }

            public int getVersion() {
                return ((SigningInput) this.instance).getVersion();
            }

            public boolean hasCall() {
                return ((SigningInput) this.instance).hasCall();
            }

            public boolean hasCandidateRegister() {
                return ((SigningInput) this.instance).hasCandidateRegister();
            }

            public boolean hasCandidateUpdate() {
                return ((SigningInput) this.instance).hasCandidateUpdate();
            }

            public boolean hasStakeAddDeposit() {
                return ((SigningInput) this.instance).hasStakeAddDeposit();
            }

            public boolean hasStakeChangeCandidate() {
                return ((SigningInput) this.instance).hasStakeChangeCandidate();
            }

            public boolean hasStakeCreate() {
                return ((SigningInput) this.instance).hasStakeCreate();
            }

            public boolean hasStakeRestake() {
                return ((SigningInput) this.instance).hasStakeRestake();
            }

            public boolean hasStakeTransferOwnership() {
                return ((SigningInput) this.instance).hasStakeTransferOwnership();
            }

            public boolean hasStakeUnstake() {
                return ((SigningInput) this.instance).hasStakeUnstake();
            }

            public boolean hasStakeWithdraw() {
                return ((SigningInput) this.instance).hasStakeWithdraw();
            }

            public boolean hasTransfer() {
                return ((SigningInput) this.instance).hasTransfer();
            }

            public Builder mergeCall(ContractCall contractCall) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCall(contractCall);
                return this;
            }

            public Builder mergeCandidateRegister(Staking.CandidateRegister candidateRegister) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCandidateRegister(candidateRegister);
                return this;
            }

            public Builder mergeCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder mergeStakeAddDeposit(Staking.AddDeposit addDeposit) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder mergeStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder mergeStakeCreate(Staking.Create create) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeCreate(create);
                return this;
            }

            public Builder mergeStakeRestake(Staking.Restake restake) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeRestake(restake);
                return this;
            }

            public Builder mergeStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder mergeStakeUnstake(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeUnstake(reclaim);
                return this;
            }

            public Builder mergeStakeWithdraw(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeStakeWithdraw(reclaim);
                return this;
            }

            public Builder mergeTransfer(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).mergeTransfer(transfer);
                return this;
            }

            public Builder setCall(ContractCall contractCall) {
                copyOnWrite();
                ((SigningInput) this.instance).setCall(contractCall);
                return this;
            }

            public Builder setCandidateRegister(Staking.CandidateRegister candidateRegister) {
                copyOnWrite();
                ((SigningInput) this.instance).setCandidateRegister(candidateRegister);
                return this;
            }

            public Builder setCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((SigningInput) this.instance).setCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder setGasLimit(long j) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasLimit(j);
                return this;
            }

            public Builder setGasPrice(String str) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPrice(str);
                return this;
            }

            public Builder setGasPriceBytes(ByteString byteString) {
                copyOnWrite();
                ((SigningInput) this.instance).setGasPriceBytes(byteString);
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

            public Builder setStakeAddDeposit(Staking.AddDeposit addDeposit) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder setStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder setStakeCreate(Staking.Create create) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeCreate(create);
                return this;
            }

            public Builder setStakeRestake(Staking.Restake restake) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeRestake(restake);
                return this;
            }

            public Builder setStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder setStakeUnstake(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeUnstake(reclaim);
                return this;
            }

            public Builder setStakeWithdraw(Staking.Reclaim reclaim) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeWithdraw(reclaim);
                return this;
            }

            public Builder setTransfer(Transfer transfer) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer(transfer);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((SigningInput) this.instance).setVersion(i);
                return this;
            }

            private Builder() {
                super(SigningInput.DEFAULT_INSTANCE);
            }

            public Builder setCall(ContractCall.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCall((ContractCall) builder.build());
                return this;
            }

            public Builder setCandidateRegister(Staking.CandidateRegister.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCandidateRegister((Staking.CandidateRegister) builder.build());
                return this;
            }

            public Builder setCandidateUpdate(Staking.CandidateBasicInfo.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setCandidateUpdate((Staking.CandidateBasicInfo) builder.build());
                return this;
            }

            public Builder setStakeAddDeposit(Staking.AddDeposit.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeAddDeposit((Staking.AddDeposit) builder.build());
                return this;
            }

            public Builder setStakeChangeCandidate(Staking.ChangeCandidate.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeChangeCandidate((Staking.ChangeCandidate) builder.build());
                return this;
            }

            public Builder setStakeCreate(Staking.Create.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeCreate((Staking.Create) builder.build());
                return this;
            }

            public Builder setStakeRestake(Staking.Restake.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeRestake((Staking.Restake) builder.build());
                return this;
            }

            public Builder setStakeTransferOwnership(Staking.TransferOwnership.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeTransferOwnership((Staking.TransferOwnership) builder.build());
                return this;
            }

            public Builder setStakeUnstake(Staking.Reclaim.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeUnstake((Staking.Reclaim) builder.build());
                return this;
            }

            public Builder setStakeWithdraw(Staking.Reclaim.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setStakeWithdraw((Staking.Reclaim) builder.build());
                return this;
            }

            public Builder setTransfer(Transfer.Builder builder) {
                copyOnWrite();
                ((SigningInput) this.instance).setTransfer((Transfer) builder.build());
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
            this.actionCase_ = 0;
            this.action_ = null;
        }

        /* access modifiers changed from: private */
        public void clearCall() {
            if (this.actionCase_ == 12) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCandidateRegister() {
            if (this.actionCase_ == 47) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCandidateUpdate() {
            if (this.actionCase_ == 48) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearGasLimit() {
            this.gasLimit_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGasPrice() {
            this.gasPrice_ = getDefaultInstance().getGasPrice();
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
        public void clearStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeCreate() {
            if (this.actionCase_ == 40) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeRestake() {
            if (this.actionCase_ == 44) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeUnstake() {
            if (this.actionCase_ == 41) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeWithdraw() {
            if (this.actionCase_ == 42) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearTransfer() {
            if (this.actionCase_ == 10) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static SigningInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCall(ContractCall contractCall) {
            contractCall.getClass();
            if (this.actionCase_ != 12 || this.action_ == ContractCall.getDefaultInstance()) {
                this.action_ = contractCall;
            } else {
                this.action_ = ((ContractCall.Builder) ContractCall.newBuilder((ContractCall) this.action_).mergeFrom(contractCall)).buildPartial();
            }
            this.actionCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateRegister(Staking.CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            if (this.actionCase_ != 47 || this.action_ == Staking.CandidateRegister.getDefaultInstance()) {
                this.action_ = candidateRegister;
            } else {
                this.action_ = ((Staking.CandidateRegister.Builder) Staking.CandidateRegister.newBuilder((Staking.CandidateRegister) this.action_).mergeFrom(candidateRegister)).buildPartial();
            }
            this.actionCase_ = 47;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            if (this.actionCase_ != 48 || this.action_ == Staking.CandidateBasicInfo.getDefaultInstance()) {
                this.action_ = candidateBasicInfo;
            } else {
                this.action_ = ((Staking.CandidateBasicInfo.Builder) Staking.CandidateBasicInfo.newBuilder((Staking.CandidateBasicInfo) this.action_).mergeFrom(candidateBasicInfo)).buildPartial();
            }
            this.actionCase_ = 48;
        }

        /* access modifiers changed from: private */
        public void mergeStakeAddDeposit(Staking.AddDeposit addDeposit) {
            addDeposit.getClass();
            if (this.actionCase_ != 43 || this.action_ == Staking.AddDeposit.getDefaultInstance()) {
                this.action_ = addDeposit;
            } else {
                this.action_ = ((Staking.AddDeposit.Builder) Staking.AddDeposit.newBuilder((Staking.AddDeposit) this.action_).mergeFrom(addDeposit)).buildPartial();
            }
            this.actionCase_ = 43;
        }

        /* access modifiers changed from: private */
        public void mergeStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            if (this.actionCase_ != 45 || this.action_ == Staking.ChangeCandidate.getDefaultInstance()) {
                this.action_ = changeCandidate;
            } else {
                this.action_ = ((Staking.ChangeCandidate.Builder) Staking.ChangeCandidate.newBuilder((Staking.ChangeCandidate) this.action_).mergeFrom(changeCandidate)).buildPartial();
            }
            this.actionCase_ = 45;
        }

        /* access modifiers changed from: private */
        public void mergeStakeCreate(Staking.Create create) {
            create.getClass();
            if (this.actionCase_ != 40 || this.action_ == Staking.Create.getDefaultInstance()) {
                this.action_ = create;
            } else {
                this.action_ = ((Staking.Create.Builder) Staking.Create.newBuilder((Staking.Create) this.action_).mergeFrom(create)).buildPartial();
            }
            this.actionCase_ = 40;
        }

        /* access modifiers changed from: private */
        public void mergeStakeRestake(Staking.Restake restake) {
            restake.getClass();
            if (this.actionCase_ != 44 || this.action_ == Staking.Restake.getDefaultInstance()) {
                this.action_ = restake;
            } else {
                this.action_ = ((Staking.Restake.Builder) Staking.Restake.newBuilder((Staking.Restake) this.action_).mergeFrom(restake)).buildPartial();
            }
            this.actionCase_ = 44;
        }

        /* access modifiers changed from: private */
        public void mergeStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            if (this.actionCase_ != 46 || this.action_ == Staking.TransferOwnership.getDefaultInstance()) {
                this.action_ = transferOwnership;
            } else {
                this.action_ = ((Staking.TransferOwnership.Builder) Staking.TransferOwnership.newBuilder((Staking.TransferOwnership) this.action_).mergeFrom(transferOwnership)).buildPartial();
            }
            this.actionCase_ = 46;
        }

        /* access modifiers changed from: private */
        public void mergeStakeUnstake(Staking.Reclaim reclaim) {
            reclaim.getClass();
            if (this.actionCase_ != 41 || this.action_ == Staking.Reclaim.getDefaultInstance()) {
                this.action_ = reclaim;
            } else {
                this.action_ = ((Staking.Reclaim.Builder) Staking.Reclaim.newBuilder((Staking.Reclaim) this.action_).mergeFrom(reclaim)).buildPartial();
            }
            this.actionCase_ = 41;
        }

        /* access modifiers changed from: private */
        public void mergeStakeWithdraw(Staking.Reclaim reclaim) {
            reclaim.getClass();
            if (this.actionCase_ != 42 || this.action_ == Staking.Reclaim.getDefaultInstance()) {
                this.action_ = reclaim;
            } else {
                this.action_ = ((Staking.Reclaim.Builder) Staking.Reclaim.newBuilder((Staking.Reclaim) this.action_).mergeFrom(reclaim)).buildPartial();
            }
            this.actionCase_ = 42;
        }

        /* access modifiers changed from: private */
        public void mergeTransfer(Transfer transfer) {
            transfer.getClass();
            if (this.actionCase_ != 10 || this.action_ == Transfer.getDefaultInstance()) {
                this.action_ = transfer;
            } else {
                this.action_ = ((Transfer.Builder) Transfer.newBuilder((Transfer) this.action_).mergeFrom(transfer)).buildPartial();
            }
            this.actionCase_ = 10;
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
        public void setCall(ContractCall contractCall) {
            contractCall.getClass();
            this.action_ = contractCall;
            this.actionCase_ = 12;
        }

        /* access modifiers changed from: private */
        public void setCandidateRegister(Staking.CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            this.action_ = candidateRegister;
            this.actionCase_ = 47;
        }

        /* access modifiers changed from: private */
        public void setCandidateUpdate(Staking.CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            this.action_ = candidateBasicInfo;
            this.actionCase_ = 48;
        }

        /* access modifiers changed from: private */
        public void setGasLimit(long j) {
            this.gasLimit_ = j;
        }

        /* access modifiers changed from: private */
        public void setGasPrice(String str) {
            str.getClass();
            this.gasPrice_ = str;
        }

        /* access modifiers changed from: private */
        public void setGasPriceBytes(ByteString byteString) {
            C4949a.checkByteStringIsUtf8(byteString);
            this.gasPrice_ = byteString.toStringUtf8();
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
        public void setStakeAddDeposit(Staking.AddDeposit addDeposit) {
            addDeposit.getClass();
            this.action_ = addDeposit;
            this.actionCase_ = 43;
        }

        /* access modifiers changed from: private */
        public void setStakeChangeCandidate(Staking.ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            this.action_ = changeCandidate;
            this.actionCase_ = 45;
        }

        /* access modifiers changed from: private */
        public void setStakeCreate(Staking.Create create) {
            create.getClass();
            this.action_ = create;
            this.actionCase_ = 40;
        }

        /* access modifiers changed from: private */
        public void setStakeRestake(Staking.Restake restake) {
            restake.getClass();
            this.action_ = restake;
            this.actionCase_ = 44;
        }

        /* access modifiers changed from: private */
        public void setStakeTransferOwnership(Staking.TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            this.action_ = transferOwnership;
            this.actionCase_ = 46;
        }

        /* access modifiers changed from: private */
        public void setStakeUnstake(Staking.Reclaim reclaim) {
            reclaim.getClass();
            this.action_ = reclaim;
            this.actionCase_ = 41;
        }

        /* access modifiers changed from: private */
        public void setStakeWithdraw(Staking.Reclaim reclaim) {
            reclaim.getClass();
            this.action_ = reclaim;
            this.actionCase_ = 42;
        }

        /* access modifiers changed from: private */
        public void setTransfer(Transfer transfer) {
            transfer.getClass();
            this.action_ = transfer;
            this.actionCase_ = 10;
        }

        /* access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<Staking.Reclaim> cls = Staking.Reclaim.class;
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningInput();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u00010\u0010\u0000\u0000\u0000\u0001\u000b\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\n\n<\u0000\f<\u0000(<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u00000<\u0000", new Object[]{"action_", "actionCase_", "version_", "nonce_", "gasLimit_", "gasPrice_", "privateKey_", Transfer.class, ContractCall.class, Staking.Create.class, cls, cls, Staking.AddDeposit.class, Staking.Restake.class, Staking.ChangeCandidate.class, Staking.TransferOwnership.class, Staking.CandidateRegister.class, Staking.CandidateBasicInfo.class});
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

        public ActionCase getActionCase() {
            return ActionCase.forNumber(this.actionCase_);
        }

        public ContractCall getCall() {
            if (this.actionCase_ == 12) {
                return (ContractCall) this.action_;
            }
            return ContractCall.getDefaultInstance();
        }

        public Staking.CandidateRegister getCandidateRegister() {
            if (this.actionCase_ == 47) {
                return (Staking.CandidateRegister) this.action_;
            }
            return Staking.CandidateRegister.getDefaultInstance();
        }

        public Staking.CandidateBasicInfo getCandidateUpdate() {
            if (this.actionCase_ == 48) {
                return (Staking.CandidateBasicInfo) this.action_;
            }
            return Staking.CandidateBasicInfo.getDefaultInstance();
        }

        public long getGasLimit() {
            return this.gasLimit_;
        }

        public String getGasPrice() {
            return this.gasPrice_;
        }

        public ByteString getGasPriceBytes() {
            return ByteString.copyFromUtf8(this.gasPrice_);
        }

        public long getNonce() {
            return this.nonce_;
        }

        public ByteString getPrivateKey() {
            return this.privateKey_;
        }

        public Staking.AddDeposit getStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                return (Staking.AddDeposit) this.action_;
            }
            return Staking.AddDeposit.getDefaultInstance();
        }

        public Staking.ChangeCandidate getStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                return (Staking.ChangeCandidate) this.action_;
            }
            return Staking.ChangeCandidate.getDefaultInstance();
        }

        public Staking.Create getStakeCreate() {
            if (this.actionCase_ == 40) {
                return (Staking.Create) this.action_;
            }
            return Staking.Create.getDefaultInstance();
        }

        public Staking.Restake getStakeRestake() {
            if (this.actionCase_ == 44) {
                return (Staking.Restake) this.action_;
            }
            return Staking.Restake.getDefaultInstance();
        }

        public Staking.TransferOwnership getStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                return (Staking.TransferOwnership) this.action_;
            }
            return Staking.TransferOwnership.getDefaultInstance();
        }

        public Staking.Reclaim getStakeUnstake() {
            if (this.actionCase_ == 41) {
                return (Staking.Reclaim) this.action_;
            }
            return Staking.Reclaim.getDefaultInstance();
        }

        public Staking.Reclaim getStakeWithdraw() {
            if (this.actionCase_ == 42) {
                return (Staking.Reclaim) this.action_;
            }
            return Staking.Reclaim.getDefaultInstance();
        }

        public Transfer getTransfer() {
            if (this.actionCase_ == 10) {
                return (Transfer) this.action_;
            }
            return Transfer.getDefaultInstance();
        }

        public int getVersion() {
            return this.version_;
        }

        public boolean hasCall() {
            if (this.actionCase_ == 12) {
                return true;
            }
            return false;
        }

        public boolean hasCandidateRegister() {
            if (this.actionCase_ == 47) {
                return true;
            }
            return false;
        }

        public boolean hasCandidateUpdate() {
            if (this.actionCase_ == 48) {
                return true;
            }
            return false;
        }

        public boolean hasStakeAddDeposit() {
            if (this.actionCase_ == 43) {
                return true;
            }
            return false;
        }

        public boolean hasStakeChangeCandidate() {
            if (this.actionCase_ == 45) {
                return true;
            }
            return false;
        }

        public boolean hasStakeCreate() {
            if (this.actionCase_ == 40) {
                return true;
            }
            return false;
        }

        public boolean hasStakeRestake() {
            if (this.actionCase_ == 44) {
                return true;
            }
            return false;
        }

        public boolean hasStakeTransferOwnership() {
            if (this.actionCase_ == 46) {
                return true;
            }
            return false;
        }

        public boolean hasStakeUnstake() {
            if (this.actionCase_ == 41) {
                return true;
            }
            return false;
        }

        public boolean hasStakeWithdraw() {
            if (this.actionCase_ == 42) {
                return true;
            }
            return false;
        }

        public boolean hasTransfer() {
            if (this.actionCase_ == 10) {
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
        SigningInput.ActionCase getActionCase();

        ContractCall getCall();

        Staking.CandidateRegister getCandidateRegister();

        Staking.CandidateBasicInfo getCandidateUpdate();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        long getGasLimit();

        String getGasPrice();

        ByteString getGasPriceBytes();

        long getNonce();

        ByteString getPrivateKey();

        Staking.AddDeposit getStakeAddDeposit();

        Staking.ChangeCandidate getStakeChangeCandidate();

        Staking.Create getStakeCreate();

        Staking.Restake getStakeRestake();

        Staking.TransferOwnership getStakeTransferOwnership();

        Staking.Reclaim getStakeUnstake();

        Staking.Reclaim getStakeWithdraw();

        Transfer getTransfer();

        int getVersion();

        boolean hasCall();

        boolean hasCandidateRegister();

        boolean hasCandidateUpdate();

        boolean hasStakeAddDeposit();

        boolean hasStakeChangeCandidate();

        boolean hasStakeCreate();

        boolean hasStakeRestake();

        boolean hasStakeTransferOwnership();

        boolean hasStakeUnstake();

        boolean hasStakeWithdraw();

        boolean hasTransfer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SigningOutput extends GeneratedMessageLite<SigningOutput, Builder> implements SigningOutputOrBuilder {
        /* access modifiers changed from: private */
        public static final SigningOutput DEFAULT_INSTANCE;
        public static final int ENCODED_FIELD_NUMBER = 1;
        public static final int HASH_FIELD_NUMBER = 2;
        private static volatile im4<SigningOutput> PARSER;
        private ByteString encoded_;
        private ByteString hash_;

        public static final class Builder extends GeneratedMessageLite.C4930a<SigningOutput, Builder> implements SigningOutputOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearEncoded() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearEncoded();
                return this;
            }

            public Builder clearHash() {
                copyOnWrite();
                ((SigningOutput) this.instance).clearHash();
                return this;
            }

            public ByteString getEncoded() {
                return ((SigningOutput) this.instance).getEncoded();
            }

            public ByteString getHash() {
                return ((SigningOutput) this.instance).getHash();
            }

            public Builder setEncoded(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setEncoded(byteString);
                return this;
            }

            public Builder setHash(ByteString byteString) {
                copyOnWrite();
                ((SigningOutput) this.instance).setHash(byteString);
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
            this.hash_ = byteString;
        }

        /* access modifiers changed from: private */
        public void clearEncoded() {
            this.encoded_ = getDefaultInstance().getEncoded();
        }

        /* access modifiers changed from: private */
        public void clearHash() {
            this.hash_ = getDefaultInstance().getHash();
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
        public void setHash(ByteString byteString) {
            byteString.getClass();
            this.hash_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SigningOutput();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"encoded_", "hash_"});
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

        public ByteString getHash() {
            return this.hash_;
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

        ByteString getHash();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Staking extends GeneratedMessageLite<Staking, Builder> implements StakingOrBuilder {
        public static final int CANDIDATEREGISTER_FIELD_NUMBER = 8;
        public static final int CANDIDATEUPDATE_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final Staking DEFAULT_INSTANCE;
        private static volatile im4<Staking> PARSER = null;
        public static final int STAKEADDDEPOSIT_FIELD_NUMBER = 4;
        public static final int STAKECHANGECANDIDATE_FIELD_NUMBER = 6;
        public static final int STAKECREATE_FIELD_NUMBER = 1;
        public static final int STAKERESTAKE_FIELD_NUMBER = 5;
        public static final int STAKETRANSFEROWNERSHIP_FIELD_NUMBER = 7;
        public static final int STAKEUNSTAKE_FIELD_NUMBER = 2;
        public static final int STAKEWITHDRAW_FIELD_NUMBER = 3;
        private int messageCase_ = 0;
        private Object message_;

        public static final class AddDeposit extends GeneratedMessageLite<AddDeposit, Builder> implements AddDepositOrBuilder {
            public static final int AMOUNT_FIELD_NUMBER = 2;
            public static final int BUCKETINDEX_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final AddDeposit DEFAULT_INSTANCE;
            private static volatile im4<AddDeposit> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 3;
            private String amount_ = "";
            private long bucketIndex_;
            private ByteString payload_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<AddDeposit, Builder> implements AddDepositOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearAmount() {
                    copyOnWrite();
                    ((AddDeposit) this.instance).clearAmount();
                    return this;
                }

                public Builder clearBucketIndex() {
                    copyOnWrite();
                    ((AddDeposit) this.instance).clearBucketIndex();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((AddDeposit) this.instance).clearPayload();
                    return this;
                }

                public String getAmount() {
                    return ((AddDeposit) this.instance).getAmount();
                }

                public ByteString getAmountBytes() {
                    return ((AddDeposit) this.instance).getAmountBytes();
                }

                public long getBucketIndex() {
                    return ((AddDeposit) this.instance).getBucketIndex();
                }

                public ByteString getPayload() {
                    return ((AddDeposit) this.instance).getPayload();
                }

                public Builder setAmount(String str) {
                    copyOnWrite();
                    ((AddDeposit) this.instance).setAmount(str);
                    return this;
                }

                public Builder setAmountBytes(ByteString byteString) {
                    copyOnWrite();
                    ((AddDeposit) this.instance).setAmountBytes(byteString);
                    return this;
                }

                public Builder setBucketIndex(long j) {
                    copyOnWrite();
                    ((AddDeposit) this.instance).setBucketIndex(j);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((AddDeposit) this.instance).setPayload(byteString);
                    return this;
                }

                private Builder() {
                    super(AddDeposit.DEFAULT_INSTANCE);
                }
            }

            static {
                AddDeposit addDeposit = new AddDeposit();
                DEFAULT_INSTANCE = addDeposit;
                GeneratedMessageLite.registerDefaultInstance(AddDeposit.class, addDeposit);
            }

            private AddDeposit() {
            }

            /* access modifiers changed from: private */
            public void clearAmount() {
                this.amount_ = getDefaultInstance().getAmount();
            }

            /* access modifiers changed from: private */
            public void clearBucketIndex() {
                this.bucketIndex_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            public static AddDeposit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AddDeposit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AddDeposit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<AddDeposit> parser() {
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
            public void setBucketIndex(long j) {
                this.bucketIndex_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new AddDeposit();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003\n", new Object[]{"bucketIndex_", "amount_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<AddDeposit> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (AddDeposit.class) {
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

            public long getBucketIndex() {
                return this.bucketIndex_;
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public static Builder newBuilder(AddDeposit addDeposit) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(addDeposit);
            }

            public static AddDeposit parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AddDeposit parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static AddDeposit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static AddDeposit parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static AddDeposit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AddDeposit parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static AddDeposit parseFrom(InputStream inputStream) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AddDeposit parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static AddDeposit parseFrom(C4969g gVar) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static AddDeposit parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (AddDeposit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface AddDepositOrBuilder extends qu3 {
            String getAmount();

            ByteString getAmountBytes();

            long getBucketIndex();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends GeneratedMessageLite.C4930a<Staking, Builder> implements StakingOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearCandidateRegister() {
                copyOnWrite();
                ((Staking) this.instance).clearCandidateRegister();
                return this;
            }

            public Builder clearCandidateUpdate() {
                copyOnWrite();
                ((Staking) this.instance).clearCandidateUpdate();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((Staking) this.instance).clearMessage();
                return this;
            }

            public Builder clearStakeAddDeposit() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeAddDeposit();
                return this;
            }

            public Builder clearStakeChangeCandidate() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeChangeCandidate();
                return this;
            }

            public Builder clearStakeCreate() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeCreate();
                return this;
            }

            public Builder clearStakeRestake() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeRestake();
                return this;
            }

            public Builder clearStakeTransferOwnership() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeTransferOwnership();
                return this;
            }

            public Builder clearStakeUnstake() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeUnstake();
                return this;
            }

            public Builder clearStakeWithdraw() {
                copyOnWrite();
                ((Staking) this.instance).clearStakeWithdraw();
                return this;
            }

            public CandidateRegister getCandidateRegister() {
                return ((Staking) this.instance).getCandidateRegister();
            }

            public CandidateBasicInfo getCandidateUpdate() {
                return ((Staking) this.instance).getCandidateUpdate();
            }

            public MessageCase getMessageCase() {
                return ((Staking) this.instance).getMessageCase();
            }

            public AddDeposit getStakeAddDeposit() {
                return ((Staking) this.instance).getStakeAddDeposit();
            }

            public ChangeCandidate getStakeChangeCandidate() {
                return ((Staking) this.instance).getStakeChangeCandidate();
            }

            public Create getStakeCreate() {
                return ((Staking) this.instance).getStakeCreate();
            }

            public Restake getStakeRestake() {
                return ((Staking) this.instance).getStakeRestake();
            }

            public TransferOwnership getStakeTransferOwnership() {
                return ((Staking) this.instance).getStakeTransferOwnership();
            }

            public Reclaim getStakeUnstake() {
                return ((Staking) this.instance).getStakeUnstake();
            }

            public Reclaim getStakeWithdraw() {
                return ((Staking) this.instance).getStakeWithdraw();
            }

            public boolean hasCandidateRegister() {
                return ((Staking) this.instance).hasCandidateRegister();
            }

            public boolean hasCandidateUpdate() {
                return ((Staking) this.instance).hasCandidateUpdate();
            }

            public boolean hasStakeAddDeposit() {
                return ((Staking) this.instance).hasStakeAddDeposit();
            }

            public boolean hasStakeChangeCandidate() {
                return ((Staking) this.instance).hasStakeChangeCandidate();
            }

            public boolean hasStakeCreate() {
                return ((Staking) this.instance).hasStakeCreate();
            }

            public boolean hasStakeRestake() {
                return ((Staking) this.instance).hasStakeRestake();
            }

            public boolean hasStakeTransferOwnership() {
                return ((Staking) this.instance).hasStakeTransferOwnership();
            }

            public boolean hasStakeUnstake() {
                return ((Staking) this.instance).hasStakeUnstake();
            }

            public boolean hasStakeWithdraw() {
                return ((Staking) this.instance).hasStakeWithdraw();
            }

            public Builder mergeCandidateRegister(CandidateRegister candidateRegister) {
                copyOnWrite();
                ((Staking) this.instance).mergeCandidateRegister(candidateRegister);
                return this;
            }

            public Builder mergeCandidateUpdate(CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((Staking) this.instance).mergeCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder mergeStakeAddDeposit(AddDeposit addDeposit) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder mergeStakeChangeCandidate(ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder mergeStakeCreate(Create create) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeCreate(create);
                return this;
            }

            public Builder mergeStakeRestake(Restake restake) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeRestake(restake);
                return this;
            }

            public Builder mergeStakeTransferOwnership(TransferOwnership transferOwnership) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder mergeStakeUnstake(Reclaim reclaim) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeUnstake(reclaim);
                return this;
            }

            public Builder mergeStakeWithdraw(Reclaim reclaim) {
                copyOnWrite();
                ((Staking) this.instance).mergeStakeWithdraw(reclaim);
                return this;
            }

            public Builder setCandidateRegister(CandidateRegister candidateRegister) {
                copyOnWrite();
                ((Staking) this.instance).setCandidateRegister(candidateRegister);
                return this;
            }

            public Builder setCandidateUpdate(CandidateBasicInfo candidateBasicInfo) {
                copyOnWrite();
                ((Staking) this.instance).setCandidateUpdate(candidateBasicInfo);
                return this;
            }

            public Builder setStakeAddDeposit(AddDeposit addDeposit) {
                copyOnWrite();
                ((Staking) this.instance).setStakeAddDeposit(addDeposit);
                return this;
            }

            public Builder setStakeChangeCandidate(ChangeCandidate changeCandidate) {
                copyOnWrite();
                ((Staking) this.instance).setStakeChangeCandidate(changeCandidate);
                return this;
            }

            public Builder setStakeCreate(Create create) {
                copyOnWrite();
                ((Staking) this.instance).setStakeCreate(create);
                return this;
            }

            public Builder setStakeRestake(Restake restake) {
                copyOnWrite();
                ((Staking) this.instance).setStakeRestake(restake);
                return this;
            }

            public Builder setStakeTransferOwnership(TransferOwnership transferOwnership) {
                copyOnWrite();
                ((Staking) this.instance).setStakeTransferOwnership(transferOwnership);
                return this;
            }

            public Builder setStakeUnstake(Reclaim reclaim) {
                copyOnWrite();
                ((Staking) this.instance).setStakeUnstake(reclaim);
                return this;
            }

            public Builder setStakeWithdraw(Reclaim reclaim) {
                copyOnWrite();
                ((Staking) this.instance).setStakeWithdraw(reclaim);
                return this;
            }

            private Builder() {
                super(Staking.DEFAULT_INSTANCE);
            }

            public Builder setCandidateRegister(CandidateRegister.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setCandidateRegister((CandidateRegister) builder.build());
                return this;
            }

            public Builder setCandidateUpdate(CandidateBasicInfo.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setCandidateUpdate((CandidateBasicInfo) builder.build());
                return this;
            }

            public Builder setStakeAddDeposit(AddDeposit.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeAddDeposit((AddDeposit) builder.build());
                return this;
            }

            public Builder setStakeChangeCandidate(ChangeCandidate.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeChangeCandidate((ChangeCandidate) builder.build());
                return this;
            }

            public Builder setStakeCreate(Create.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeCreate((Create) builder.build());
                return this;
            }

            public Builder setStakeRestake(Restake.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeRestake((Restake) builder.build());
                return this;
            }

            public Builder setStakeTransferOwnership(TransferOwnership.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeTransferOwnership((TransferOwnership) builder.build());
                return this;
            }

            public Builder setStakeUnstake(Reclaim.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeUnstake((Reclaim) builder.build());
                return this;
            }

            public Builder setStakeWithdraw(Reclaim.Builder builder) {
                copyOnWrite();
                ((Staking) this.instance).setStakeWithdraw((Reclaim) builder.build());
                return this;
            }
        }

        public static final class CandidateBasicInfo extends GeneratedMessageLite<CandidateBasicInfo, Builder> implements CandidateBasicInfoOrBuilder {
            /* access modifiers changed from: private */
            public static final CandidateBasicInfo DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            public static final int OPERATORADDRESS_FIELD_NUMBER = 2;
            private static volatile im4<CandidateBasicInfo> PARSER = null;
            public static final int REWARDADDRESS_FIELD_NUMBER = 3;
            private String name_ = "";
            private String operatorAddress_ = "";
            private String rewardAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<CandidateBasicInfo, Builder> implements CandidateBasicInfoOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).clearName();
                    return this;
                }

                public Builder clearOperatorAddress() {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).clearOperatorAddress();
                    return this;
                }

                public Builder clearRewardAddress() {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).clearRewardAddress();
                    return this;
                }

                public String getName() {
                    return ((CandidateBasicInfo) this.instance).getName();
                }

                public ByteString getNameBytes() {
                    return ((CandidateBasicInfo) this.instance).getNameBytes();
                }

                public String getOperatorAddress() {
                    return ((CandidateBasicInfo) this.instance).getOperatorAddress();
                }

                public ByteString getOperatorAddressBytes() {
                    return ((CandidateBasicInfo) this.instance).getOperatorAddressBytes();
                }

                public String getRewardAddress() {
                    return ((CandidateBasicInfo) this.instance).getRewardAddress();
                }

                public ByteString getRewardAddressBytes() {
                    return ((CandidateBasicInfo) this.instance).getRewardAddressBytes();
                }

                public Builder setName(String str) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setName(str);
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setNameBytes(byteString);
                    return this;
                }

                public Builder setOperatorAddress(String str) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setOperatorAddress(str);
                    return this;
                }

                public Builder setOperatorAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setOperatorAddressBytes(byteString);
                    return this;
                }

                public Builder setRewardAddress(String str) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setRewardAddress(str);
                    return this;
                }

                public Builder setRewardAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateBasicInfo) this.instance).setRewardAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(CandidateBasicInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                CandidateBasicInfo candidateBasicInfo = new CandidateBasicInfo();
                DEFAULT_INSTANCE = candidateBasicInfo;
                GeneratedMessageLite.registerDefaultInstance(CandidateBasicInfo.class, candidateBasicInfo);
            }

            private CandidateBasicInfo() {
            }

            /* access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* access modifiers changed from: private */
            public void clearOperatorAddress() {
                this.operatorAddress_ = getDefaultInstance().getOperatorAddress();
            }

            /* access modifiers changed from: private */
            public void clearRewardAddress() {
                this.rewardAddress_ = getDefaultInstance().getRewardAddress();
            }

            public static CandidateBasicInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static CandidateBasicInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CandidateBasicInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<CandidateBasicInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
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
            public void setOperatorAddress(String str) {
                str.getClass();
                this.operatorAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setOperatorAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.operatorAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setRewardAddress(String str) {
                str.getClass();
                this.rewardAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setRewardAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.rewardAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CandidateBasicInfo();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "operatorAddress_", "rewardAddress_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<CandidateBasicInfo> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (CandidateBasicInfo.class) {
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

            public String getName() {
                return this.name_;
            }

            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            public String getOperatorAddress() {
                return this.operatorAddress_;
            }

            public ByteString getOperatorAddressBytes() {
                return ByteString.copyFromUtf8(this.operatorAddress_);
            }

            public String getRewardAddress() {
                return this.rewardAddress_;
            }

            public ByteString getRewardAddressBytes() {
                return ByteString.copyFromUtf8(this.rewardAddress_);
            }

            public static Builder newBuilder(CandidateBasicInfo candidateBasicInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(candidateBasicInfo);
            }

            public static CandidateBasicInfo parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static CandidateBasicInfo parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static CandidateBasicInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CandidateBasicInfo parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static CandidateBasicInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CandidateBasicInfo parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static CandidateBasicInfo parseFrom(InputStream inputStream) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CandidateBasicInfo parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static CandidateBasicInfo parseFrom(C4969g gVar) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static CandidateBasicInfo parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (CandidateBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface CandidateBasicInfoOrBuilder extends qu3 {
            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getName();

            ByteString getNameBytes();

            String getOperatorAddress();

            ByteString getOperatorAddressBytes();

            String getRewardAddress();

            ByteString getRewardAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        public static final class CandidateRegister extends GeneratedMessageLite<CandidateRegister, Builder> implements CandidateRegisterOrBuilder {
            public static final int AUTOSTAKE_FIELD_NUMBER = 4;
            public static final int CANDIDATE_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final CandidateRegister DEFAULT_INSTANCE;
            public static final int OWNERADDRESS_FIELD_NUMBER = 5;
            private static volatile im4<CandidateRegister> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 6;
            public static final int STAKEDAMOUNT_FIELD_NUMBER = 2;
            public static final int STAKEDDURATION_FIELD_NUMBER = 3;
            private boolean autoStake_;
            private CandidateBasicInfo candidate_;
            private String ownerAddress_ = "";
            private ByteString payload_ = ByteString.EMPTY;
            private String stakedAmount_ = "";
            private int stakedDuration_;

            public static final class Builder extends GeneratedMessageLite.C4930a<CandidateRegister, Builder> implements CandidateRegisterOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearAutoStake() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearAutoStake();
                    return this;
                }

                public Builder clearCandidate() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearCandidate();
                    return this;
                }

                public Builder clearOwnerAddress() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearOwnerAddress();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearPayload();
                    return this;
                }

                public Builder clearStakedAmount() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearStakedAmount();
                    return this;
                }

                public Builder clearStakedDuration() {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).clearStakedDuration();
                    return this;
                }

                public boolean getAutoStake() {
                    return ((CandidateRegister) this.instance).getAutoStake();
                }

                public CandidateBasicInfo getCandidate() {
                    return ((CandidateRegister) this.instance).getCandidate();
                }

                public String getOwnerAddress() {
                    return ((CandidateRegister) this.instance).getOwnerAddress();
                }

                public ByteString getOwnerAddressBytes() {
                    return ((CandidateRegister) this.instance).getOwnerAddressBytes();
                }

                public ByteString getPayload() {
                    return ((CandidateRegister) this.instance).getPayload();
                }

                public String getStakedAmount() {
                    return ((CandidateRegister) this.instance).getStakedAmount();
                }

                public ByteString getStakedAmountBytes() {
                    return ((CandidateRegister) this.instance).getStakedAmountBytes();
                }

                public int getStakedDuration() {
                    return ((CandidateRegister) this.instance).getStakedDuration();
                }

                public boolean hasCandidate() {
                    return ((CandidateRegister) this.instance).hasCandidate();
                }

                public Builder mergeCandidate(CandidateBasicInfo candidateBasicInfo) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).mergeCandidate(candidateBasicInfo);
                    return this;
                }

                public Builder setAutoStake(boolean z) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setAutoStake(z);
                    return this;
                }

                public Builder setCandidate(CandidateBasicInfo candidateBasicInfo) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setCandidate(candidateBasicInfo);
                    return this;
                }

                public Builder setOwnerAddress(String str) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setOwnerAddress(str);
                    return this;
                }

                public Builder setOwnerAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setOwnerAddressBytes(byteString);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setPayload(byteString);
                    return this;
                }

                public Builder setStakedAmount(String str) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setStakedAmount(str);
                    return this;
                }

                public Builder setStakedAmountBytes(ByteString byteString) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setStakedAmountBytes(byteString);
                    return this;
                }

                public Builder setStakedDuration(int i) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setStakedDuration(i);
                    return this;
                }

                private Builder() {
                    super(CandidateRegister.DEFAULT_INSTANCE);
                }

                public Builder setCandidate(CandidateBasicInfo.Builder builder) {
                    copyOnWrite();
                    ((CandidateRegister) this.instance).setCandidate((CandidateBasicInfo) builder.build());
                    return this;
                }
            }

            static {
                CandidateRegister candidateRegister = new CandidateRegister();
                DEFAULT_INSTANCE = candidateRegister;
                GeneratedMessageLite.registerDefaultInstance(CandidateRegister.class, candidateRegister);
            }

            private CandidateRegister() {
            }

            /* access modifiers changed from: private */
            public void clearAutoStake() {
                this.autoStake_ = false;
            }

            /* access modifiers changed from: private */
            public void clearCandidate() {
                this.candidate_ = null;
            }

            /* access modifiers changed from: private */
            public void clearOwnerAddress() {
                this.ownerAddress_ = getDefaultInstance().getOwnerAddress();
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            /* access modifiers changed from: private */
            public void clearStakedAmount() {
                this.stakedAmount_ = getDefaultInstance().getStakedAmount();
            }

            /* access modifiers changed from: private */
            public void clearStakedDuration() {
                this.stakedDuration_ = 0;
            }

            public static CandidateRegister getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeCandidate(CandidateBasicInfo candidateBasicInfo) {
                candidateBasicInfo.getClass();
                CandidateBasicInfo candidateBasicInfo2 = this.candidate_;
                if (candidateBasicInfo2 == null || candidateBasicInfo2 == CandidateBasicInfo.getDefaultInstance()) {
                    this.candidate_ = candidateBasicInfo;
                } else {
                    this.candidate_ = (CandidateBasicInfo) ((CandidateBasicInfo.Builder) CandidateBasicInfo.newBuilder(this.candidate_).mergeFrom(candidateBasicInfo)).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static CandidateRegister parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CandidateRegister parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<CandidateRegister> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAutoStake(boolean z) {
                this.autoStake_ = z;
            }

            /* access modifiers changed from: private */
            public void setCandidate(CandidateBasicInfo candidateBasicInfo) {
                candidateBasicInfo.getClass();
                this.candidate_ = candidateBasicInfo;
            }

            /* access modifiers changed from: private */
            public void setOwnerAddress(String str) {
                str.getClass();
                this.ownerAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setOwnerAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.ownerAddress_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setStakedAmount(String str) {
                str.getClass();
                this.stakedAmount_ = str;
            }

            /* access modifiers changed from: private */
            public void setStakedAmountBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.stakedAmount_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setStakedDuration(int i) {
                this.stakedDuration_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new CandidateRegister();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ\u0006\n", new Object[]{"candidate_", "stakedAmount_", "stakedDuration_", "autoStake_", "ownerAddress_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<CandidateRegister> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (CandidateRegister.class) {
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

            public boolean getAutoStake() {
                return this.autoStake_;
            }

            public CandidateBasicInfo getCandidate() {
                CandidateBasicInfo candidateBasicInfo = this.candidate_;
                if (candidateBasicInfo == null) {
                    return CandidateBasicInfo.getDefaultInstance();
                }
                return candidateBasicInfo;
            }

            public String getOwnerAddress() {
                return this.ownerAddress_;
            }

            public ByteString getOwnerAddressBytes() {
                return ByteString.copyFromUtf8(this.ownerAddress_);
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public String getStakedAmount() {
                return this.stakedAmount_;
            }

            public ByteString getStakedAmountBytes() {
                return ByteString.copyFromUtf8(this.stakedAmount_);
            }

            public int getStakedDuration() {
                return this.stakedDuration_;
            }

            public boolean hasCandidate() {
                if (this.candidate_ != null) {
                    return true;
                }
                return false;
            }

            public static Builder newBuilder(CandidateRegister candidateRegister) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(candidateRegister);
            }

            public static CandidateRegister parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static CandidateRegister parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static CandidateRegister parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static CandidateRegister parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static CandidateRegister parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static CandidateRegister parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static CandidateRegister parseFrom(InputStream inputStream) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static CandidateRegister parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static CandidateRegister parseFrom(C4969g gVar) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static CandidateRegister parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (CandidateRegister) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface CandidateRegisterOrBuilder extends qu3 {
            boolean getAutoStake();

            CandidateBasicInfo getCandidate();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            String getOwnerAddress();

            ByteString getOwnerAddressBytes();

            ByteString getPayload();

            String getStakedAmount();

            ByteString getStakedAmountBytes();

            int getStakedDuration();

            boolean hasCandidate();

            /* synthetic */ boolean isInitialized();
        }

        public static final class ChangeCandidate extends GeneratedMessageLite<ChangeCandidate, Builder> implements ChangeCandidateOrBuilder {
            public static final int BUCKETINDEX_FIELD_NUMBER = 1;
            public static final int CANDIDATENAME_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final ChangeCandidate DEFAULT_INSTANCE;
            private static volatile im4<ChangeCandidate> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 3;
            private long bucketIndex_;
            private String candidateName_ = "";
            private ByteString payload_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<ChangeCandidate, Builder> implements ChangeCandidateOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearBucketIndex() {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).clearBucketIndex();
                    return this;
                }

                public Builder clearCandidateName() {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).clearCandidateName();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).clearPayload();
                    return this;
                }

                public long getBucketIndex() {
                    return ((ChangeCandidate) this.instance).getBucketIndex();
                }

                public String getCandidateName() {
                    return ((ChangeCandidate) this.instance).getCandidateName();
                }

                public ByteString getCandidateNameBytes() {
                    return ((ChangeCandidate) this.instance).getCandidateNameBytes();
                }

                public ByteString getPayload() {
                    return ((ChangeCandidate) this.instance).getPayload();
                }

                public Builder setBucketIndex(long j) {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).setBucketIndex(j);
                    return this;
                }

                public Builder setCandidateName(String str) {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).setCandidateName(str);
                    return this;
                }

                public Builder setCandidateNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).setCandidateNameBytes(byteString);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((ChangeCandidate) this.instance).setPayload(byteString);
                    return this;
                }

                private Builder() {
                    super(ChangeCandidate.DEFAULT_INSTANCE);
                }
            }

            static {
                ChangeCandidate changeCandidate = new ChangeCandidate();
                DEFAULT_INSTANCE = changeCandidate;
                GeneratedMessageLite.registerDefaultInstance(ChangeCandidate.class, changeCandidate);
            }

            private ChangeCandidate() {
            }

            /* access modifiers changed from: private */
            public void clearBucketIndex() {
                this.bucketIndex_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearCandidateName() {
                this.candidateName_ = getDefaultInstance().getCandidateName();
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            public static ChangeCandidate getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ChangeCandidate parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChangeCandidate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<ChangeCandidate> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBucketIndex(long j) {
                this.bucketIndex_ = j;
            }

            /* access modifiers changed from: private */
            public void setCandidateName(String str) {
                str.getClass();
                this.candidateName_ = str;
            }

            /* access modifiers changed from: private */
            public void setCandidateNameBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.candidateName_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ChangeCandidate();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003\n", new Object[]{"bucketIndex_", "candidateName_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<ChangeCandidate> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (ChangeCandidate.class) {
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

            public long getBucketIndex() {
                return this.bucketIndex_;
            }

            public String getCandidateName() {
                return this.candidateName_;
            }

            public ByteString getCandidateNameBytes() {
                return ByteString.copyFromUtf8(this.candidateName_);
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public static Builder newBuilder(ChangeCandidate changeCandidate) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(changeCandidate);
            }

            public static ChangeCandidate parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ChangeCandidate parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static ChangeCandidate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ChangeCandidate parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static ChangeCandidate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ChangeCandidate parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static ChangeCandidate parseFrom(InputStream inputStream) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ChangeCandidate parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static ChangeCandidate parseFrom(C4969g gVar) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static ChangeCandidate parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (ChangeCandidate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ChangeCandidateOrBuilder extends qu3 {
            long getBucketIndex();

            String getCandidateName();

            ByteString getCandidateNameBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Create extends GeneratedMessageLite<Create, Builder> implements CreateOrBuilder {
            public static final int AUTOSTAKE_FIELD_NUMBER = 4;
            public static final int CANDIDATENAME_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Create DEFAULT_INSTANCE;
            private static volatile im4<Create> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 5;
            public static final int STAKEDAMOUNT_FIELD_NUMBER = 2;
            public static final int STAKEDDURATION_FIELD_NUMBER = 3;
            private boolean autoStake_;
            private String candidateName_ = "";
            private ByteString payload_ = ByteString.EMPTY;
            private String stakedAmount_ = "";
            private int stakedDuration_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Create, Builder> implements CreateOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearAutoStake() {
                    copyOnWrite();
                    ((Create) this.instance).clearAutoStake();
                    return this;
                }

                public Builder clearCandidateName() {
                    copyOnWrite();
                    ((Create) this.instance).clearCandidateName();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((Create) this.instance).clearPayload();
                    return this;
                }

                public Builder clearStakedAmount() {
                    copyOnWrite();
                    ((Create) this.instance).clearStakedAmount();
                    return this;
                }

                public Builder clearStakedDuration() {
                    copyOnWrite();
                    ((Create) this.instance).clearStakedDuration();
                    return this;
                }

                public boolean getAutoStake() {
                    return ((Create) this.instance).getAutoStake();
                }

                public String getCandidateName() {
                    return ((Create) this.instance).getCandidateName();
                }

                public ByteString getCandidateNameBytes() {
                    return ((Create) this.instance).getCandidateNameBytes();
                }

                public ByteString getPayload() {
                    return ((Create) this.instance).getPayload();
                }

                public String getStakedAmount() {
                    return ((Create) this.instance).getStakedAmount();
                }

                public ByteString getStakedAmountBytes() {
                    return ((Create) this.instance).getStakedAmountBytes();
                }

                public int getStakedDuration() {
                    return ((Create) this.instance).getStakedDuration();
                }

                public Builder setAutoStake(boolean z) {
                    copyOnWrite();
                    ((Create) this.instance).setAutoStake(z);
                    return this;
                }

                public Builder setCandidateName(String str) {
                    copyOnWrite();
                    ((Create) this.instance).setCandidateName(str);
                    return this;
                }

                public Builder setCandidateNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Create) this.instance).setCandidateNameBytes(byteString);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((Create) this.instance).setPayload(byteString);
                    return this;
                }

                public Builder setStakedAmount(String str) {
                    copyOnWrite();
                    ((Create) this.instance).setStakedAmount(str);
                    return this;
                }

                public Builder setStakedAmountBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Create) this.instance).setStakedAmountBytes(byteString);
                    return this;
                }

                public Builder setStakedDuration(int i) {
                    copyOnWrite();
                    ((Create) this.instance).setStakedDuration(i);
                    return this;
                }

                private Builder() {
                    super(Create.DEFAULT_INSTANCE);
                }
            }

            static {
                Create create = new Create();
                DEFAULT_INSTANCE = create;
                GeneratedMessageLite.registerDefaultInstance(Create.class, create);
            }

            private Create() {
            }

            /* access modifiers changed from: private */
            public void clearAutoStake() {
                this.autoStake_ = false;
            }

            /* access modifiers changed from: private */
            public void clearCandidateName() {
                this.candidateName_ = getDefaultInstance().getCandidateName();
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            /* access modifiers changed from: private */
            public void clearStakedAmount() {
                this.stakedAmount_ = getDefaultInstance().getStakedAmount();
            }

            /* access modifiers changed from: private */
            public void clearStakedDuration() {
                this.stakedDuration_ = 0;
            }

            public static Create getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Create parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Create) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Create parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Create> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAutoStake(boolean z) {
                this.autoStake_ = z;
            }

            /* access modifiers changed from: private */
            public void setCandidateName(String str) {
                str.getClass();
                this.candidateName_ = str;
            }

            /* access modifiers changed from: private */
            public void setCandidateNameBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.candidateName_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setStakedAmount(String str) {
                str.getClass();
                this.stakedAmount_ = str;
            }

            /* access modifiers changed from: private */
            public void setStakedAmountBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.stakedAmount_ = byteString.toStringUtf8();
            }

            /* access modifiers changed from: private */
            public void setStakedDuration(int i) {
                this.stakedDuration_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Create();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005\n", new Object[]{"candidateName_", "stakedAmount_", "stakedDuration_", "autoStake_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Create> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Create.class) {
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

            public boolean getAutoStake() {
                return this.autoStake_;
            }

            public String getCandidateName() {
                return this.candidateName_;
            }

            public ByteString getCandidateNameBytes() {
                return ByteString.copyFromUtf8(this.candidateName_);
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public String getStakedAmount() {
                return this.stakedAmount_;
            }

            public ByteString getStakedAmountBytes() {
                return ByteString.copyFromUtf8(this.stakedAmount_);
            }

            public int getStakedDuration() {
                return this.stakedDuration_;
            }

            public static Builder newBuilder(Create create) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(create);
            }

            public static Create parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Create) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Create parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Create parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Create parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Create parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Create parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Create parseFrom(InputStream inputStream) throws IOException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Create parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Create parseFrom(C4969g gVar) throws IOException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Create parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Create) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface CreateOrBuilder extends qu3 {
            boolean getAutoStake();

            String getCandidateName();

            ByteString getCandidateNameBytes();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            String getStakedAmount();

            ByteString getStakedAmountBytes();

            int getStakedDuration();

            /* synthetic */ boolean isInitialized();
        }

        public enum MessageCase {
            STAKECREATE(1),
            STAKEUNSTAKE(2),
            STAKEWITHDRAW(3),
            STAKEADDDEPOSIT(4),
            STAKERESTAKE(5),
            STAKECHANGECANDIDATE(6),
            STAKETRANSFEROWNERSHIP(7),
            CANDIDATEREGISTER(8),
            CANDIDATEUPDATE(9),
            MESSAGE_NOT_SET(0);
            
            private final int value;

            private MessageCase(int i) {
                this.value = i;
            }

            public static MessageCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return MESSAGE_NOT_SET;
                    case 1:
                        return STAKECREATE;
                    case 2:
                        return STAKEUNSTAKE;
                    case 3:
                        return STAKEWITHDRAW;
                    case 4:
                        return STAKEADDDEPOSIT;
                    case 5:
                        return STAKERESTAKE;
                    case 6:
                        return STAKECHANGECANDIDATE;
                    case 7:
                        return STAKETRANSFEROWNERSHIP;
                    case 8:
                        return CANDIDATEREGISTER;
                    case 9:
                        return CANDIDATEUPDATE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Reclaim extends GeneratedMessageLite<Reclaim, Builder> implements ReclaimOrBuilder {
            public static final int BUCKETINDEX_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Reclaim DEFAULT_INSTANCE;
            private static volatile im4<Reclaim> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 2;
            private long bucketIndex_;
            private ByteString payload_ = ByteString.EMPTY;

            public static final class Builder extends GeneratedMessageLite.C4930a<Reclaim, Builder> implements ReclaimOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearBucketIndex() {
                    copyOnWrite();
                    ((Reclaim) this.instance).clearBucketIndex();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((Reclaim) this.instance).clearPayload();
                    return this;
                }

                public long getBucketIndex() {
                    return ((Reclaim) this.instance).getBucketIndex();
                }

                public ByteString getPayload() {
                    return ((Reclaim) this.instance).getPayload();
                }

                public Builder setBucketIndex(long j) {
                    copyOnWrite();
                    ((Reclaim) this.instance).setBucketIndex(j);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((Reclaim) this.instance).setPayload(byteString);
                    return this;
                }

                private Builder() {
                    super(Reclaim.DEFAULT_INSTANCE);
                }
            }

            static {
                Reclaim reclaim = new Reclaim();
                DEFAULT_INSTANCE = reclaim;
                GeneratedMessageLite.registerDefaultInstance(Reclaim.class, reclaim);
            }

            private Reclaim() {
            }

            /* access modifiers changed from: private */
            public void clearBucketIndex() {
                this.bucketIndex_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            public static Reclaim getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Reclaim parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Reclaim parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Reclaim> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBucketIndex(long j) {
                this.bucketIndex_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Reclaim();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\n", new Object[]{"bucketIndex_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Reclaim> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Reclaim.class) {
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

            public long getBucketIndex() {
                return this.bucketIndex_;
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public static Builder newBuilder(Reclaim reclaim) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(reclaim);
            }

            public static Reclaim parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Reclaim parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Reclaim parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Reclaim parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Reclaim parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Reclaim parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Reclaim parseFrom(InputStream inputStream) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Reclaim parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Reclaim parseFrom(C4969g gVar) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Reclaim parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Reclaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface ReclaimOrBuilder extends qu3 {
            long getBucketIndex();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Restake extends GeneratedMessageLite<Restake, Builder> implements RestakeOrBuilder {
            public static final int AUTOSTAKE_FIELD_NUMBER = 3;
            public static final int BUCKETINDEX_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Restake DEFAULT_INSTANCE;
            private static volatile im4<Restake> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 4;
            public static final int STAKEDDURATION_FIELD_NUMBER = 2;
            private boolean autoStake_;
            private long bucketIndex_;
            private ByteString payload_ = ByteString.EMPTY;
            private int stakedDuration_;

            public static final class Builder extends GeneratedMessageLite.C4930a<Restake, Builder> implements RestakeOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearAutoStake() {
                    copyOnWrite();
                    ((Restake) this.instance).clearAutoStake();
                    return this;
                }

                public Builder clearBucketIndex() {
                    copyOnWrite();
                    ((Restake) this.instance).clearBucketIndex();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((Restake) this.instance).clearPayload();
                    return this;
                }

                public Builder clearStakedDuration() {
                    copyOnWrite();
                    ((Restake) this.instance).clearStakedDuration();
                    return this;
                }

                public boolean getAutoStake() {
                    return ((Restake) this.instance).getAutoStake();
                }

                public long getBucketIndex() {
                    return ((Restake) this.instance).getBucketIndex();
                }

                public ByteString getPayload() {
                    return ((Restake) this.instance).getPayload();
                }

                public int getStakedDuration() {
                    return ((Restake) this.instance).getStakedDuration();
                }

                public Builder setAutoStake(boolean z) {
                    copyOnWrite();
                    ((Restake) this.instance).setAutoStake(z);
                    return this;
                }

                public Builder setBucketIndex(long j) {
                    copyOnWrite();
                    ((Restake) this.instance).setBucketIndex(j);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((Restake) this.instance).setPayload(byteString);
                    return this;
                }

                public Builder setStakedDuration(int i) {
                    copyOnWrite();
                    ((Restake) this.instance).setStakedDuration(i);
                    return this;
                }

                private Builder() {
                    super(Restake.DEFAULT_INSTANCE);
                }
            }

            static {
                Restake restake = new Restake();
                DEFAULT_INSTANCE = restake;
                GeneratedMessageLite.registerDefaultInstance(Restake.class, restake);
            }

            private Restake() {
            }

            /* access modifiers changed from: private */
            public void clearAutoStake() {
                this.autoStake_ = false;
            }

            /* access modifiers changed from: private */
            public void clearBucketIndex() {
                this.bucketIndex_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            /* access modifiers changed from: private */
            public void clearStakedDuration() {
                this.stakedDuration_ = 0;
            }

            public static Restake getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Restake parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Restake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Restake parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<Restake> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setAutoStake(boolean z) {
                this.autoStake_ = z;
            }

            /* access modifiers changed from: private */
            public void setBucketIndex(long j) {
                this.bucketIndex_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setStakedDuration(int i) {
                this.stakedDuration_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Restake();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0003\u0007\u0004\n", new Object[]{"bucketIndex_", "stakedDuration_", "autoStake_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<Restake> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (Restake.class) {
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

            public boolean getAutoStake() {
                return this.autoStake_;
            }

            public long getBucketIndex() {
                return this.bucketIndex_;
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public int getStakedDuration() {
                return this.stakedDuration_;
            }

            public static Builder newBuilder(Restake restake) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(restake);
            }

            public static Restake parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Restake) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Restake parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static Restake parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Restake parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static Restake parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Restake parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static Restake parseFrom(InputStream inputStream) throws IOException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Restake parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static Restake parseFrom(C4969g gVar) throws IOException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static Restake parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (Restake) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface RestakeOrBuilder extends qu3 {
            boolean getAutoStake();

            long getBucketIndex();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            int getStakedDuration();

            /* synthetic */ boolean isInitialized();
        }

        public static final class TransferOwnership extends GeneratedMessageLite<TransferOwnership, Builder> implements TransferOwnershipOrBuilder {
            public static final int BUCKETINDEX_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final TransferOwnership DEFAULT_INSTANCE;
            private static volatile im4<TransferOwnership> PARSER = null;
            public static final int PAYLOAD_FIELD_NUMBER = 3;
            public static final int VOTERADDRESS_FIELD_NUMBER = 2;
            private long bucketIndex_;
            private ByteString payload_ = ByteString.EMPTY;
            private String voterAddress_ = "";

            public static final class Builder extends GeneratedMessageLite.C4930a<TransferOwnership, Builder> implements TransferOwnershipOrBuilder {
                public /* synthetic */ Builder(C97501 r1) {
                    this();
                }

                public Builder clearBucketIndex() {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).clearBucketIndex();
                    return this;
                }

                public Builder clearPayload() {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).clearPayload();
                    return this;
                }

                public Builder clearVoterAddress() {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).clearVoterAddress();
                    return this;
                }

                public long getBucketIndex() {
                    return ((TransferOwnership) this.instance).getBucketIndex();
                }

                public ByteString getPayload() {
                    return ((TransferOwnership) this.instance).getPayload();
                }

                public String getVoterAddress() {
                    return ((TransferOwnership) this.instance).getVoterAddress();
                }

                public ByteString getVoterAddressBytes() {
                    return ((TransferOwnership) this.instance).getVoterAddressBytes();
                }

                public Builder setBucketIndex(long j) {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).setBucketIndex(j);
                    return this;
                }

                public Builder setPayload(ByteString byteString) {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).setPayload(byteString);
                    return this;
                }

                public Builder setVoterAddress(String str) {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).setVoterAddress(str);
                    return this;
                }

                public Builder setVoterAddressBytes(ByteString byteString) {
                    copyOnWrite();
                    ((TransferOwnership) this.instance).setVoterAddressBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(TransferOwnership.DEFAULT_INSTANCE);
                }
            }

            static {
                TransferOwnership transferOwnership = new TransferOwnership();
                DEFAULT_INSTANCE = transferOwnership;
                GeneratedMessageLite.registerDefaultInstance(TransferOwnership.class, transferOwnership);
            }

            private TransferOwnership() {
            }

            /* access modifiers changed from: private */
            public void clearBucketIndex() {
                this.bucketIndex_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPayload() {
                this.payload_ = getDefaultInstance().getPayload();
            }

            /* access modifiers changed from: private */
            public void clearVoterAddress() {
                this.voterAddress_ = getDefaultInstance().getVoterAddress();
            }

            public static TransferOwnership getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static TransferOwnership parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransferOwnership parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static im4<TransferOwnership> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBucketIndex(long j) {
                this.bucketIndex_ = j;
            }

            /* access modifiers changed from: private */
            public void setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
            }

            /* access modifiers changed from: private */
            public void setVoterAddress(String str) {
                str.getClass();
                this.voterAddress_ = str;
            }

            /* access modifiers changed from: private */
            public void setVoterAddressBytes(ByteString byteString) {
                C4949a.checkByteStringIsUtf8(byteString);
                this.voterAddress_ = byteString.toStringUtf8();
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TransferOwnership();
                    case 2:
                        return new Builder((C97501) null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003\n", new Object[]{"bucketIndex_", "voterAddress_", "payload_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        im4<TransferOwnership> im4 = PARSER;
                        if (im4 == null) {
                            synchronized (TransferOwnership.class) {
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

            public long getBucketIndex() {
                return this.bucketIndex_;
            }

            public ByteString getPayload() {
                return this.payload_;
            }

            public String getVoterAddress() {
                return this.voterAddress_;
            }

            public ByteString getVoterAddressBytes() {
                return ByteString.copyFromUtf8(this.voterAddress_);
            }

            public static Builder newBuilder(TransferOwnership transferOwnership) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(transferOwnership);
            }

            public static TransferOwnership parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static TransferOwnership parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
            }

            public static TransferOwnership parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TransferOwnership parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
            }

            public static TransferOwnership parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TransferOwnership parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
            }

            public static TransferOwnership parseFrom(InputStream inputStream) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransferOwnership parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
            }

            public static TransferOwnership parseFrom(C4969g gVar) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
            }

            public static TransferOwnership parseFrom(C4969g gVar, C4987l lVar) throws IOException {
                return (TransferOwnership) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
            }
        }

        public interface TransferOwnershipOrBuilder extends qu3 {
            long getBucketIndex();

            /* synthetic */ C4956c0 getDefaultInstanceForType();

            ByteString getPayload();

            String getVoterAddress();

            ByteString getVoterAddressBytes();

            /* synthetic */ boolean isInitialized();
        }

        static {
            Staking staking = new Staking();
            DEFAULT_INSTANCE = staking;
            GeneratedMessageLite.registerDefaultInstance(Staking.class, staking);
        }

        private Staking() {
        }

        /* access modifiers changed from: private */
        public void clearCandidateRegister() {
            if (this.messageCase_ == 8) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearCandidateUpdate() {
            if (this.messageCase_ == 9) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearMessage() {
            this.messageCase_ = 0;
            this.message_ = null;
        }

        /* access modifiers changed from: private */
        public void clearStakeAddDeposit() {
            if (this.messageCase_ == 4) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeChangeCandidate() {
            if (this.messageCase_ == 6) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeCreate() {
            if (this.messageCase_ == 1) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeRestake() {
            if (this.messageCase_ == 5) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeTransferOwnership() {
            if (this.messageCase_ == 7) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeUnstake() {
            if (this.messageCase_ == 2) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStakeWithdraw() {
            if (this.messageCase_ == 3) {
                this.messageCase_ = 0;
                this.message_ = null;
            }
        }

        public static Staking getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateRegister(CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            if (this.messageCase_ != 8 || this.message_ == CandidateRegister.getDefaultInstance()) {
                this.message_ = candidateRegister;
            } else {
                this.message_ = ((CandidateRegister.Builder) CandidateRegister.newBuilder((CandidateRegister) this.message_).mergeFrom(candidateRegister)).buildPartial();
            }
            this.messageCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeCandidateUpdate(CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            if (this.messageCase_ != 9 || this.message_ == CandidateBasicInfo.getDefaultInstance()) {
                this.message_ = candidateBasicInfo;
            } else {
                this.message_ = ((CandidateBasicInfo.Builder) CandidateBasicInfo.newBuilder((CandidateBasicInfo) this.message_).mergeFrom(candidateBasicInfo)).buildPartial();
            }
            this.messageCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeStakeAddDeposit(AddDeposit addDeposit) {
            addDeposit.getClass();
            if (this.messageCase_ != 4 || this.message_ == AddDeposit.getDefaultInstance()) {
                this.message_ = addDeposit;
            } else {
                this.message_ = ((AddDeposit.Builder) AddDeposit.newBuilder((AddDeposit) this.message_).mergeFrom(addDeposit)).buildPartial();
            }
            this.messageCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeStakeChangeCandidate(ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            if (this.messageCase_ != 6 || this.message_ == ChangeCandidate.getDefaultInstance()) {
                this.message_ = changeCandidate;
            } else {
                this.message_ = ((ChangeCandidate.Builder) ChangeCandidate.newBuilder((ChangeCandidate) this.message_).mergeFrom(changeCandidate)).buildPartial();
            }
            this.messageCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeStakeCreate(Create create) {
            create.getClass();
            if (this.messageCase_ != 1 || this.message_ == Create.getDefaultInstance()) {
                this.message_ = create;
            } else {
                this.message_ = ((Create.Builder) Create.newBuilder((Create) this.message_).mergeFrom(create)).buildPartial();
            }
            this.messageCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void mergeStakeRestake(Restake restake) {
            restake.getClass();
            if (this.messageCase_ != 5 || this.message_ == Restake.getDefaultInstance()) {
                this.message_ = restake;
            } else {
                this.message_ = ((Restake.Builder) Restake.newBuilder((Restake) this.message_).mergeFrom(restake)).buildPartial();
            }
            this.messageCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeStakeTransferOwnership(TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            if (this.messageCase_ != 7 || this.message_ == TransferOwnership.getDefaultInstance()) {
                this.message_ = transferOwnership;
            } else {
                this.message_ = ((TransferOwnership.Builder) TransferOwnership.newBuilder((TransferOwnership) this.message_).mergeFrom(transferOwnership)).buildPartial();
            }
            this.messageCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeStakeUnstake(Reclaim reclaim) {
            reclaim.getClass();
            if (this.messageCase_ != 2 || this.message_ == Reclaim.getDefaultInstance()) {
                this.message_ = reclaim;
            } else {
                this.message_ = ((Reclaim.Builder) Reclaim.newBuilder((Reclaim) this.message_).mergeFrom(reclaim)).buildPartial();
            }
            this.messageCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void mergeStakeWithdraw(Reclaim reclaim) {
            reclaim.getClass();
            if (this.messageCase_ != 3 || this.message_ == Reclaim.getDefaultInstance()) {
                this.message_ = reclaim;
            } else {
                this.message_ = ((Reclaim.Builder) Reclaim.newBuilder((Reclaim) this.message_).mergeFrom(reclaim)).buildPartial();
            }
            this.messageCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Staking parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Staking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Staking parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static im4<Staking> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCandidateRegister(CandidateRegister candidateRegister) {
            candidateRegister.getClass();
            this.message_ = candidateRegister;
            this.messageCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setCandidateUpdate(CandidateBasicInfo candidateBasicInfo) {
            candidateBasicInfo.getClass();
            this.message_ = candidateBasicInfo;
            this.messageCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setStakeAddDeposit(AddDeposit addDeposit) {
            addDeposit.getClass();
            this.message_ = addDeposit;
            this.messageCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setStakeChangeCandidate(ChangeCandidate changeCandidate) {
            changeCandidate.getClass();
            this.message_ = changeCandidate;
            this.messageCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setStakeCreate(Create create) {
            create.getClass();
            this.message_ = create;
            this.messageCase_ = 1;
        }

        /* access modifiers changed from: private */
        public void setStakeRestake(Restake restake) {
            restake.getClass();
            this.message_ = restake;
            this.messageCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setStakeTransferOwnership(TransferOwnership transferOwnership) {
            transferOwnership.getClass();
            this.message_ = transferOwnership;
            this.messageCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setStakeUnstake(Reclaim reclaim) {
            reclaim.getClass();
            this.message_ = reclaim;
            this.messageCase_ = 2;
        }

        /* access modifiers changed from: private */
        public void setStakeWithdraw(Reclaim reclaim) {
            reclaim.getClass();
            this.message_ = reclaim;
            this.messageCase_ = 3;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Class<Reclaim> cls = Reclaim.class;
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Staking();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"message_", "messageCase_", Create.class, cls, cls, AddDeposit.class, Restake.class, ChangeCandidate.class, TransferOwnership.class, CandidateRegister.class, CandidateBasicInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    im4<Staking> im4 = PARSER;
                    if (im4 == null) {
                        synchronized (Staking.class) {
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

        public CandidateRegister getCandidateRegister() {
            if (this.messageCase_ == 8) {
                return (CandidateRegister) this.message_;
            }
            return CandidateRegister.getDefaultInstance();
        }

        public CandidateBasicInfo getCandidateUpdate() {
            if (this.messageCase_ == 9) {
                return (CandidateBasicInfo) this.message_;
            }
            return CandidateBasicInfo.getDefaultInstance();
        }

        public MessageCase getMessageCase() {
            return MessageCase.forNumber(this.messageCase_);
        }

        public AddDeposit getStakeAddDeposit() {
            if (this.messageCase_ == 4) {
                return (AddDeposit) this.message_;
            }
            return AddDeposit.getDefaultInstance();
        }

        public ChangeCandidate getStakeChangeCandidate() {
            if (this.messageCase_ == 6) {
                return (ChangeCandidate) this.message_;
            }
            return ChangeCandidate.getDefaultInstance();
        }

        public Create getStakeCreate() {
            if (this.messageCase_ == 1) {
                return (Create) this.message_;
            }
            return Create.getDefaultInstance();
        }

        public Restake getStakeRestake() {
            if (this.messageCase_ == 5) {
                return (Restake) this.message_;
            }
            return Restake.getDefaultInstance();
        }

        public TransferOwnership getStakeTransferOwnership() {
            if (this.messageCase_ == 7) {
                return (TransferOwnership) this.message_;
            }
            return TransferOwnership.getDefaultInstance();
        }

        public Reclaim getStakeUnstake() {
            if (this.messageCase_ == 2) {
                return (Reclaim) this.message_;
            }
            return Reclaim.getDefaultInstance();
        }

        public Reclaim getStakeWithdraw() {
            if (this.messageCase_ == 3) {
                return (Reclaim) this.message_;
            }
            return Reclaim.getDefaultInstance();
        }

        public boolean hasCandidateRegister() {
            if (this.messageCase_ == 8) {
                return true;
            }
            return false;
        }

        public boolean hasCandidateUpdate() {
            if (this.messageCase_ == 9) {
                return true;
            }
            return false;
        }

        public boolean hasStakeAddDeposit() {
            if (this.messageCase_ == 4) {
                return true;
            }
            return false;
        }

        public boolean hasStakeChangeCandidate() {
            if (this.messageCase_ == 6) {
                return true;
            }
            return false;
        }

        public boolean hasStakeCreate() {
            if (this.messageCase_ == 1) {
                return true;
            }
            return false;
        }

        public boolean hasStakeRestake() {
            if (this.messageCase_ == 5) {
                return true;
            }
            return false;
        }

        public boolean hasStakeTransferOwnership() {
            if (this.messageCase_ == 7) {
                return true;
            }
            return false;
        }

        public boolean hasStakeUnstake() {
            if (this.messageCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasStakeWithdraw() {
            if (this.messageCase_ == 3) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Staking staking) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(staking);
        }

        public static Staking parseDelimitedFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Staking parseFrom(ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, lVar);
        }

        public static Staking parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Staking parseFrom(ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, lVar);
        }

        public static Staking parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Staking parseFrom(byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, lVar);
        }

        public static Staking parseFrom(InputStream inputStream) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Staking parseFrom(InputStream inputStream, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, lVar);
        }

        public static Staking parseFrom(C4969g gVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar);
        }

        public static Staking parseFrom(C4969g gVar, C4987l lVar) throws IOException {
            return (Staking) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, gVar, lVar);
        }
    }

    public interface StakingOrBuilder extends qu3 {
        Staking.CandidateRegister getCandidateRegister();

        Staking.CandidateBasicInfo getCandidateUpdate();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        Staking.MessageCase getMessageCase();

        Staking.AddDeposit getStakeAddDeposit();

        Staking.ChangeCandidate getStakeChangeCandidate();

        Staking.Create getStakeCreate();

        Staking.Restake getStakeRestake();

        Staking.TransferOwnership getStakeTransferOwnership();

        Staking.Reclaim getStakeUnstake();

        Staking.Reclaim getStakeWithdraw();

        boolean hasCandidateRegister();

        boolean hasCandidateUpdate();

        boolean hasStakeAddDeposit();

        boolean hasStakeChangeCandidate();

        boolean hasStakeCreate();

        boolean hasStakeRestake();

        boolean hasStakeTransferOwnership();

        boolean hasStakeUnstake();

        boolean hasStakeWithdraw();

        /* synthetic */ boolean isInitialized();
    }

    public static final class Transfer extends GeneratedMessageLite<Transfer, Builder> implements TransferOrBuilder {
        public static final int AMOUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Transfer DEFAULT_INSTANCE;
        private static volatile im4<Transfer> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        public static final int RECIPIENT_FIELD_NUMBER = 2;
        private String amount_ = "";
        private ByteString payload_ = ByteString.EMPTY;
        private String recipient_ = "";

        public static final class Builder extends GeneratedMessageLite.C4930a<Transfer, Builder> implements TransferOrBuilder {
            public /* synthetic */ Builder(C97501 r1) {
                this();
            }

            public Builder clearAmount() {
                copyOnWrite();
                ((Transfer) this.instance).clearAmount();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((Transfer) this.instance).clearPayload();
                return this;
            }

            public Builder clearRecipient() {
                copyOnWrite();
                ((Transfer) this.instance).clearRecipient();
                return this;
            }

            public String getAmount() {
                return ((Transfer) this.instance).getAmount();
            }

            public ByteString getAmountBytes() {
                return ((Transfer) this.instance).getAmountBytes();
            }

            public ByteString getPayload() {
                return ((Transfer) this.instance).getPayload();
            }

            public String getRecipient() {
                return ((Transfer) this.instance).getRecipient();
            }

            public ByteString getRecipientBytes() {
                return ((Transfer) this.instance).getRecipientBytes();
            }

            public Builder setAmount(String str) {
                copyOnWrite();
                ((Transfer) this.instance).setAmount(str);
                return this;
            }

            public Builder setAmountBytes(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setAmountBytes(byteString);
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((Transfer) this.instance).setPayload(byteString);
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
            this.amount_ = getDefaultInstance().getAmount();
        }

        /* access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* access modifiers changed from: private */
        public void clearRecipient() {
            this.recipient_ = getDefaultInstance().getRecipient();
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
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
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

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C97501.f46566xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Transfer();
                case 2:
                    return new Builder((C97501) null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"amount_", "recipient_", "payload_"});
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

        public String getAmount() {
            return this.amount_;
        }

        public ByteString getAmountBytes() {
            return ByteString.copyFromUtf8(this.amount_);
        }

        public ByteString getPayload() {
            return this.payload_;
        }

        public String getRecipient() {
            return this.recipient_;
        }

        public ByteString getRecipientBytes() {
            return ByteString.copyFromUtf8(this.recipient_);
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
        String getAmount();

        ByteString getAmountBytes();

        /* synthetic */ C4956c0 getDefaultInstanceForType();

        ByteString getPayload();

        String getRecipient();

        ByteString getRecipientBytes();

        /* synthetic */ boolean isInitialized();
    }

    private IoTeX() {
    }

    public static void registerAllExtensions(C4987l lVar) {
    }
}
