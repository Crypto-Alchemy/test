package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import com.github.mikephil.charting.utils.Utils;
import com.google.protobuf.ByteString;
import com.google.protobuf.C4956c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.extension.ThreadExtensionKt;
import net.safemoon.androidwallet.model.wallets.Wallet;
import p000.mo2;
import wallet.core.java.AnySigner;
import wallet.core.jni.CoinType;
import wallet.core.jni.SolanaAddress;
import wallet.core.jni.proto.Solana;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 .2\u00020\u0001:\u00013B\u0017\u0012\u0006\u00107\u001a\u000202\u0012\u0006\u0010<\u001a\u000208¢\u0006\u0004\b=\u0010>J%\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J8\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002JK\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J7\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b%\u0010\u001cJ#\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010&2\u0006\u0010'\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001cJ\u0019\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001aJ\u0010\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u0007H\u0016R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\u0002088\u0016X\u0004¢\u0006\f\n\u0004\b \u00109\u001a\u0004\b:\u0010;\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/multiNetwork/Solana;", "Lmo2;", "", "walletAddress", "contractAddress", "q", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "amount", "receiver", "", "decimals", "blockhash", "Ljava/math/BigInteger;", "estimateGas", "Lwallet/core/jni/proto/Solana$SigningOutput;", "A", "(DLjava/lang/String;ILjava/lang/String;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "senderTokenAddress", "recipientTokenAddress", "B", "o", "_receiver", "v", "(DLjava/lang/String;Ljava/lang/String;ILjava/math/BigInteger;Lns0;)Ljava/lang/Object;", "u", "(Lns0;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "n", "estimateGasPrice", "b", "(DLjava/lang/String;Ljava/lang/String;Ljava/math/BigInteger;Ljava/lang/Double;ILns0;)Ljava/lang/Object;", "e", "(DLjava/lang/String;Ljava/lang/String;ILns0;)Ljava/lang/Object;", "unSignMessage", "s", "T", "hash", "j", "_gasPriceInGWEI", "h", "(Ljava/lang/Double;)Ljava/math/BigInteger;", "g", "()Ljava/lang/Double;", "c", "newGasPriceInGWEI", "Lr37;", "i", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lnet/safemoon/androidwallet/common/TokenType;", "w", "()Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "y", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "<init>", "(Lnet/safemoon/androidwallet/common/TokenType;Lnet/safemoon/androidwallet/model/wallets/Wallet;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Solana.kt */
public class Solana implements mo2 {

    /* renamed from: c */
    public static final C8880a f43091c = new C8880a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static long f43092d = 1000;

    /* renamed from: e */
    public static long f43093e;

    /* renamed from: a */
    public final TokenType f43094a;

    /* renamed from: b */
    public final Wallet f43095b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/multiNetwork/Solana$a;", "", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$a */
    /* compiled from: Solana.kt */
    public static final class C8880a {
        public C8880a() {
        }

        public /* synthetic */ C8880a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Solana(TokenType tokenType, Wallet wallet2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(wallet2, "wallet");
        this.f43094a = tokenType;
        this.f43095b = wallet2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m69293r(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r13, java.lang.String r14, p000.ns0<? super java.math.BigInteger> r15) throws java.lang.Exception {
        /*
            boolean r0 = r15 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$1
            r0.<init>(r13, r15)
        L_0x0018:
            r9 = r0
            java.lang.Object r15 = r9.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            p000.hg5.m45199b(r15)
            goto L_0x009f
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            java.lang.Object r13 = r9.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r9.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r14 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r14
            p000.hg5.m45199b(r15)
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x0072
        L_0x0045:
            p000.hg5.m45199b(r15)
            long r4 = f43093e
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0072
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = f43093e
            long r4 = r4 - r6
            long r6 = f43092d
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x0072
            long r4 = java.lang.System.currentTimeMillis()
            long r10 = f43093e
            long r4 = r4 - r10
            long r6 = r6 - r4
            r9.L$0 = r13
            r9.L$1 = r14
            r9.label = r3
            java.lang.Object r15 = p000.jb1.m59336a(r6, r9)
            if (r15 != r0) goto L_0x0072
            return r0
        L_0x0072:
            net.safemoon.androidwallet.common.TokenType r15 = r13.f43094a
            net.safemoon.androidwallet.model.wallets.Wallet r1 = r13.mo61853y()
            java.lang.String r15 = r13.mo56291a(r15, r1)
            r1 = 1
            r3 = 0
            r5 = 0
            r7 = 0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$balance$1 r10 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$balance$1
            r11 = 0
            r10.<init>(r14, r13, r15, r11)
            r13 = 14
            r14 = 0
            r9.L$0 = r11
            r9.L$1 = r11
            r9.label = r2
            r2 = r3
            r4 = r5
            r6 = r7
            r8 = r10
            r10 = r13
            r11 = r14
            java.lang.Object r15 = net.safemoon.androidwallet.extension.ThreadExtensionKt.m66348b(r1, r2, r4, r6, r8, r9, r10, r11)
            if (r15 != r0) goto L_0x009f
            return r0
        L_0x009f:
            java.math.BigInteger r15 = (java.math.BigInteger) r15
            long r13 = java.lang.System.currentTimeMillis()
            f43093e = r13
            if (r15 == 0) goto L_0x00aa
            return r15
        L_0x00aa:
            java.lang.Exception r13 = new java.lang.Exception
            java.lang.String r14 = "Retry"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.m69293r(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m69294t(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r14, double r15, java.lang.String r17, java.lang.String r18, int r19, p000.ns0<? super java.math.BigInteger> r20) throws java.lang.Exception {
        /*
            r8 = r14
            r0 = r20
            boolean r1 = r0 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$1 r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001b
        L_0x0016:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$1 r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$1
            r1.<init>(r14, r0)
        L_0x001b:
            r10 = r1
            java.lang.Object r0 = r10.result
            java.lang.Object r13 = p000.wx2.m54101d()
            int r1 = r10.label
            r2 = 1
            r9 = 2
            if (r1 == 0) goto L_0x0040
            if (r1 == r2) goto L_0x0038
            if (r1 != r9) goto L_0x0030
            p000.hg5.m45199b(r0)
            goto L_0x0085
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.Object r1 = r10.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r1
            p000.hg5.m45199b(r0)
            goto L_0x0059
        L_0x0040:
            p000.hg5.m45199b(r0)
            r6 = 0
            r10.L$0 = r8
            r10.label = r2
            r0 = r14
            r1 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r10
            java.lang.Object r0 = r0.mo61908v(r1, r3, r4, r5, r6, r7)
            if (r0 != r13) goto L_0x0058
            return r13
        L_0x0058:
            r1 = r8
        L_0x0059:
            wallet.core.jni.proto.Solana$SigningOutput r0 = (wallet.core.jni.proto.Solana.SigningOutput) r0
            java.lang.String r0 = r0.getUnsignedTx()
            byte[] r0 = wallet.core.jni.Base58.decodeNoCheck(r0)
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)
            r2 = 5
            r3 = 0
            r5 = 0
            r7 = 0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$feeForMessage$1 r11 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$feeForMessage$1
            r12 = 0
            r11.<init>(r1, r0, r12)
            r0 = 14
            r1 = 0
            r10.L$0 = r12
            r10.label = r9
            r9 = r11
            r11 = r0
            r12 = r1
            java.lang.Object r0 = net.safemoon.androidwallet.extension.ThreadExtensionKt.m66348b(r2, r3, r5, r7, r9, r10, r11, r12)
            if (r0 != r13) goto L_0x0085
            return r13
        L_0x0085:
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.m69294t(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana, double, java.lang.String, java.lang.String, int, ns0):java.lang.Object");
    }

    /* renamed from: x */
    public static /* synthetic */ <T> Object m69295x(Solana solana, String str, ns0<? super T> ns0) throws Exception {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v6 java.lang.Object), (r0v1 java.lang.Object) binds: [B:18:0x0079, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m69296z(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r15, double r16, java.lang.String r18, java.lang.String r19, java.math.BigInteger r20, java.lang.Double r21, int r22, p000.ns0<? super java.lang.String> r23) throws java.lang.Exception {
        /*
            r8 = r15
            r0 = r23
            boolean r1 = r0 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$1 r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001b
        L_0x0016:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$1 r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$1
            r1.<init>(r15, r0)
        L_0x001b:
            r10 = r1
            java.lang.Object r0 = r10.result
            java.lang.Object r13 = p000.wx2.m54101d()
            int r1 = r10.label
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0041
            if (r1 == r2) goto L_0x0038
            if (r1 != r9) goto L_0x0030
            p000.hg5.m45199b(r0)
            goto L_0x007c
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            java.lang.Object r1 = r10.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r1 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r1
            p000.hg5.m45199b(r0)
            r8 = r1
            goto L_0x005b
        L_0x0041:
            p000.hg5.m45199b(r0)
            r10.L$0 = r8
            r10.label = r2
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r20
            r7 = r10
            java.lang.Object r0 = r0.mo61908v(r1, r3, r4, r5, r6, r7)
            if (r0 != r13) goto L_0x005b
            return r13
        L_0x005b:
            wallet.core.jni.proto.Solana$SigningOutput r0 = (wallet.core.jni.proto.Solana.SigningOutput) r0
            r2 = 5
            r3 = 0
            r5 = 0
            r11 = 0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$2 r1 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signAndSendTransaction$2
            r7 = 0
            r1.<init>(r8, r0, r7)
            r0 = 14
            r14 = 0
            r10.L$0 = r7
            r10.label = r9
            r7 = r11
            r9 = r1
            r11 = r0
            r12 = r14
            java.lang.Object r0 = net.safemoon.androidwallet.extension.ThreadExtensionKt.m66348b(r2, r3, r5, r7, r9, r10, r11, r12)
            if (r0 != r13) goto L_0x007c
            return r13
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.m69296z(net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana, double, java.lang.String, java.lang.String, java.math.BigInteger, java.lang.Double, int, ns0):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.math.BigInteger} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61901A(double r7, java.lang.String r9, int r10, java.lang.String r11, java.math.BigInteger r12, p000.ns0<? super wallet.core.jni.proto.Solana.SigningOutput> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signTransaction$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signTransaction$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signTransaction$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$signTransaction$1
            r0.<init>(r6, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            java.lang.String r3 = "amountInWEI"
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 != r4) goto L_0x0045
            java.lang.Object r7 = r0.L$5
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.lang.Object r8 = r0.L$4
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r0.L$3
            r12 = r9
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            java.lang.Object r9 = r0.L$2
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r10 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r10
            p000.hg5.m45199b(r13)
            goto L_0x008f
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004d:
            p000.hg5.m45199b(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r2.<init>(r7)
            java.math.BigInteger r7 = p000.ol0.m70362h0(r2, r10)
            r13.element = r7
            if (r12 == 0) goto L_0x00ab
            p000.vx2.m53590f(r7, r3)
            r8 = r7
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            java.math.BigInteger r7 = r7.add(r12)
            java.lang.String r8 = "this.add(other)"
            p000.vx2.m53590f(r7, r8)
            r8 = 0
            r0.L$0 = r6
            r0.L$1 = r9
            r0.L$2 = r11
            r0.L$3 = r12
            r0.L$4 = r13
            r0.L$5 = r7
            r0.label = r4
            java.lang.Object r8 = r6.mo56295f(r8, r0)
            if (r8 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r10 = r6
            r5 = r13
            r13 = r8
            r8 = r5
        L_0x008f:
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            int r7 = r7.compareTo(r13)
            if (r7 < 0) goto L_0x00a9
            T r7 = r8.element
            p000.vx2.m53590f(r7, r3)
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.math.BigInteger r7 = r7.subtract(r12)
            java.lang.String r12 = "this.subtract(other)"
            p000.vx2.m53590f(r7, r12)
            r8.element = r7
        L_0x00a9:
            r13 = r8
            goto L_0x00ac
        L_0x00ab:
            r10 = r6
        L_0x00ac:
            net.safemoon.androidwallet.model.wallets.Wallet r7 = r10.mo61853y()
            wallet.core.jni.CoinType r8 = wallet.core.jni.CoinType.SOLANA
            int r10 = r8.value()
            byte[] r7 = r7.getPrivateKeyAsBytes(r10)
            wallet.core.jni.proto.Solana$Transfer$Builder r10 = wallet.core.jni.proto.Solana.Transfer.newBuilder()
            wallet.core.jni.AnyAddress r12 = new wallet.core.jni.AnyAddress
            r12.<init>((java.lang.String) r9, (wallet.core.jni.CoinType) r8)
            java.lang.String r9 = r12.description()
            r10.setRecipient(r9)
            T r9 = r13.element
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            long r12 = r9.longValue()
            r10.setValue(r12)
            com.google.protobuf.GeneratedMessageLite r9 = r10.build()
            wallet.core.jni.proto.Solana$Transfer r9 = (wallet.core.jni.proto.Solana.Transfer) r9
            wallet.core.jni.proto.Solana$SigningInput$Builder r10 = wallet.core.jni.proto.Solana.SigningInput.newBuilder()
            com.google.protobuf.ByteString r7 = com.google.protobuf.ByteString.copyFrom((byte[]) r7)
            r10.setPrivateKey(r7)
            r10.setTransferTransaction((wallet.core.jni.proto.Solana.Transfer) r9)
            r10.setRecentBlockhash(r11)
            com.google.protobuf.GeneratedMessageLite r7 = r10.build()
            wallet.core.jni.proto.Solana$SigningInput r7 = (wallet.core.jni.proto.Solana.SigningInput) r7
            im4 r9 = wallet.core.jni.proto.Solana.SigningOutput.parser()
            com.google.protobuf.c0 r7 = wallet.core.java.AnySigner.sign(r7, r8, r9)
            wallet.core.jni.proto.Solana$SigningOutput r7 = (wallet.core.jni.proto.Solana.SigningOutput) r7
            java.lang.String r8 = "output"
            p000.vx2.m53590f(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.mo61901A(double, java.lang.String, int, java.lang.String, java.math.BigInteger, ns0):java.lang.Object");
    }

    /* renamed from: B */
    public final Solana.SigningOutput mo61902B(double d, String str, String str2, String str3, int i, String str4) {
        Wallet y = mo61853y();
        CoinType coinType = CoinType.SOLANA;
        byte[] privateKeyAsBytes = y.getPrivateKeyAsBytes(coinType.value());
        Solana.TokenTransfer.Builder newBuilder = Solana.TokenTransfer.newBuilder();
        newBuilder.setTokenMintAddress(str);
        newBuilder.setSenderTokenAddress(str2);
        newBuilder.setRecipientTokenAddress(str3);
        newBuilder.setAmount(ol0.m70362h0(new BigDecimal(String.valueOf(d)), i).longValue());
        newBuilder.setDecimals(i);
        Solana.SigningInput.Builder newBuilder2 = Solana.SigningInput.newBuilder();
        newBuilder2.setPrivateKey(ByteString.copyFrom(privateKeyAsBytes));
        newBuilder2.setTokenTransferTransaction((Solana.TokenTransfer) newBuilder.build());
        newBuilder2.setRecentBlockhash(str4);
        Solana.SigningOutput signingOutput = (Solana.SigningOutput) AnySigner.sign((Solana.SigningInput) newBuilder2.build(), coinType, Solana.SigningOutput.parser());
        vx2.m53590f(signingOutput, "output");
        return signingOutput;
    }

    /* renamed from: a */
    public String mo56291a(TokenType tokenType, Wallet wallet2) {
        return mo2.C7906a.m64364a(this, tokenType, wallet2);
    }

    /* renamed from: b */
    public Object mo56292b(double d, String str, String str2, BigInteger bigInteger, Double d2, int i, ns0<? super String> ns0) throws Exception {
        return m69296z(this, d, str, str2, bigInteger, d2, i, ns0);
    }

    /* renamed from: c */
    public Object mo56293c(ns0<? super Double> ns0) {
        return a40.m31671b(1.0d);
    }

    /* renamed from: e */
    public Object mo56294e(double d, String str, String str2, int i, ns0<? super BigInteger> ns0) throws Exception {
        return m69294t(this, d, str, str2, i, ns0);
    }

    /* renamed from: f */
    public Object mo56295f(String str, ns0<? super BigInteger> ns0) throws Exception {
        return m69293r(this, str, ns0);
    }

    /* renamed from: g */
    public Double mo56296g() {
        return Double.valueOf(1.0d);
    }

    /* renamed from: h */
    public BigInteger mo56297h(Double d) throws Exception {
        BigInteger bigInteger = new BigDecimal(1.0d).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        vx2.m53590f(bigInteger, "BigDecimal(1.0).multiply…EN.pow(9)).toBigInteger()");
        return bigInteger;
    }

    /* renamed from: i */
    public void mo56298i(double d) {
    }

    /* renamed from: j */
    public <T> Object mo56299j(String str, ns0<? super T> ns0) throws Exception {
        return m69295x(this, str, ns0);
    }

    /* renamed from: n */
    public final String mo61903n(String str, String str2) {
        vx2.m53591g(str, "walletAddress");
        vx2.m53591g(str2, "contractAddress");
        return new SolanaAddress(str).defaultTokenAddress(str2);
    }

    /* renamed from: o */
    public final Solana.SigningOutput mo61904o(double d, String str, String str2, String str3, int i, String str4) {
        Wallet y = mo61853y();
        CoinType coinType = CoinType.SOLANA;
        byte[] privateKeyAsBytes = y.getPrivateKeyAsBytes(coinType.value());
        Solana.CreateAndTransferToken.Builder newBuilder = Solana.CreateAndTransferToken.newBuilder();
        newBuilder.setRecipientMainAddress(str3);
        newBuilder.setTokenMintAddress(str);
        newBuilder.setSenderTokenAddress(str2);
        newBuilder.setRecipientTokenAddress(mo61903n(str3, str));
        newBuilder.setAmount(ol0.m70362h0(new BigDecimal(String.valueOf(d)), i).longValue());
        newBuilder.setDecimals(i);
        Solana.SigningInput.Builder newBuilder2 = Solana.SigningInput.newBuilder();
        newBuilder2.setPrivateKey(ByteString.copyFrom(privateKeyAsBytes));
        newBuilder2.setCreateAndTransferTokenTransaction((Solana.CreateAndTransferToken) newBuilder.build());
        newBuilder2.setRecentBlockhash(str4);
        C4956c0 sign = AnySigner.sign((Solana.SigningInput) newBuilder2.build(), coinType, Solana.SigningOutput.parser());
        vx2.m53590f(sign, "sign(signingInput, CoinT…a.SigningOutput.parser())");
        return (Solana.SigningOutput) sign;
    }

    /* renamed from: q */
    public final Object mo61905q(String str, String str2, ns0<? super String> ns0) {
        return ThreadExtensionKt.m66348b(2, 0, 0, Utils.DOUBLE_EPSILON, new Solana$getAssociatedAddress$2(this, str, str2, (ns0<? super Solana$getAssociatedAddress$2>) null), ns0, 14, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61906s(java.lang.String r13, p000.ns0<? super java.math.BigInteger> r14) throws java.lang.Exception {
        /*
            r12 = this;
            boolean r0 = r14 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$2
            if (r0 == 0) goto L_0x0013
            r0 = r14
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$2 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$2 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$2
            r0.<init>(r12, r14)
        L_0x0018:
            r9 = r0
            java.lang.Object r14 = r9.result
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p000.hg5.m45199b(r14)
            goto L_0x0053
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            p000.hg5.m45199b(r14)
            r1 = 10
            r3 = 0
            r5 = 0
            r7 = 0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$feeForMessage$2 r14 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getEstimateGas$feeForMessage$2
            r10 = 0
            r14.<init>(r12, r13, r10)
            r10 = 14
            r11 = 0
            r9.label = r2
            r2 = r3
            r4 = r5
            r6 = r7
            r8 = r14
            java.lang.Object r14 = net.safemoon.androidwallet.extension.ThreadExtensionKt.m66348b(r1, r2, r4, r6, r8, r9, r10, r11)
            if (r14 != r0) goto L_0x0053
            return r0
        L_0x0053:
            java.math.BigInteger r14 = (java.math.BigInteger) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.mo61906s(java.lang.String, ns0):java.lang.Object");
    }

    /* renamed from: u */
    public final Object mo61907u(ns0<? super String> ns0) {
        return ThreadExtensionKt.m66348b(5, 0, 0, Utils.DOUBLE_EPSILON, new Solana$getLatestBlockHash$2(this, (ns0<? super Solana$getLatestBlockHash$2>) null), ns0, 14, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x010e, code lost:
        p000.vx2.m53588d(r7);
        r7 = (java.lang.String) r7;
        p000.vx2.m53590f(r5, "receiver");
        r14.L$0 = r9;
        r14.L$1 = r3;
        r14.L$2 = r5;
        r14.L$3 = r7;
        r14.D$0 = r1;
        r14.I$0 = r4;
        r14.label = 2;
        r10 = r9.mo61905q(r5, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0129, code lost:
        if (r10 != r6) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x012b, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x012c, code lost:
        r19 = r9;
        r9 = r3;
        r2 = r1;
        r1 = r4;
        r4 = r5;
        r5 = r10;
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0135, code lost:
        r5 = (java.lang.String) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0137, code lost:
        if (r5 != null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0139, code lost:
        p000.vx2.m53590f(r4, "receiver");
        r14.L$0 = r10;
        r14.L$1 = r9;
        r14.L$2 = r7;
        r14.L$3 = r4;
        r14.D$0 = r2;
        r14.I$0 = r1;
        r14.label = 3;
        r5 = r10.mo61907u(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x014f, code lost:
        if (r5 != r6) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0151, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0152, code lost:
        r17 = r1;
        r12 = r2;
        r16 = r4;
        r15 = r7;
        r14 = r9;
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015a, code lost:
        p000.vx2.m53588d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0166, code lost:
        r14.L$0 = r10;
        r14.L$1 = r9;
        r14.L$2 = r7;
        r14.L$3 = r5;
        r14.D$0 = r2;
        r14.I$0 = r1;
        r14.label = 4;
        r4 = r10.mo61907u(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0179, code lost:
        if (r4 != r6) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x017b, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017c, code lost:
        r17 = r1;
        r12 = r2;
        r16 = r5;
        r15 = r7;
        r14 = r9;
        r11 = r10;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0185, code lost:
        p000.vx2.m53588d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b0, code lost:
        p000.vx2.m53588d(r5);
        r14.L$0 = null;
        r14.L$1 = null;
        r14.L$2 = null;
        r14.label = 6;
        r5 = r7.mo61901A(r8, r10, r11, (java.lang.String) r5, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c4, code lost:
        if (r5 != r6) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01c6, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c7, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return r11.mo61902B(r12, r14, r15, r16, r17, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return r11.mo61904o(r12, r14, r15, r16, r17, (java.lang.String) r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61908v(double r21, java.lang.String r23, java.lang.String r24, int r25, java.math.BigInteger r26, p000.ns0<? super wallet.core.jni.proto.Solana.SigningOutput> r27) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r4 = r25
            r5 = r27
            boolean r6 = r5 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getSign$1
            if (r6 == 0) goto L_0x001d
            r6 = r5
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getSign$1 r6 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getSign$1) r6
            int r7 = r6.label
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001d
            int r7 = r7 - r8
            r6.label = r7
            goto L_0x0022
        L_0x001d:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getSign$1 r6 = new net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getSign$1
            r6.<init>(r0, r5)
        L_0x0022:
            r14 = r6
            java.lang.Object r5 = r14.result
            java.lang.Object r6 = p000.wx2.m54101d()
            int r7 = r14.label
            java.lang.String r8 = "receiver"
            switch(r7) {
                case 0: goto L_0x00d2;
                case 1: goto L_0x00b6;
                case 2: goto L_0x0098;
                case 3: goto L_0x0077;
                case 4: goto L_0x0056;
                case 5: goto L_0x003d;
                case 6: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            p000.hg5.m45199b(r5)
            goto L_0x01c7
        L_0x003d:
            int r1 = r14.I$0
            double r2 = r14.D$0
            java.lang.Object r4 = r14.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r14.L$1
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r7 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r7
            java.lang.Object r8 = r14.L$0
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            p000.hg5.m45199b(r5)
            r11 = r1
            r10 = r4
            r13 = r8
            r8 = r2
            goto L_0x01b0
        L_0x0056:
            int r1 = r14.I$0
            double r2 = r14.D$0
            java.lang.Object r4 = r14.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r14.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r14.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r8
            p000.hg5.m45199b(r5)
            r17 = r1
            r12 = r2
            r16 = r4
            r15 = r6
            r14 = r7
            r11 = r8
            goto L_0x0185
        L_0x0077:
            int r1 = r14.I$0
            double r2 = r14.D$0
            java.lang.Object r4 = r14.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r14.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r14.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r14.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r8
            p000.hg5.m45199b(r5)
            r17 = r1
            r12 = r2
            r16 = r4
            r15 = r6
            r14 = r7
            r11 = r8
            goto L_0x015a
        L_0x0098:
            int r1 = r14.I$0
            double r2 = r14.D$0
            java.lang.Object r4 = r14.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r14.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r14.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r14.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r10 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r10
            p000.hg5.m45199b(r5)
            r19 = r7
            r7 = r4
            r4 = r19
            goto L_0x0135
        L_0x00b6:
            int r1 = r14.I$0
            double r2 = r14.D$0
            java.lang.Object r4 = r14.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r14.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r14.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r9 = (net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana) r9
            p000.hg5.m45199b(r5)
            r19 = r4
            r4 = r1
            r1 = r2
            r3 = r7
            r7 = r5
            r5 = r19
            goto L_0x010e
        L_0x00d2:
            p000.hg5.m45199b(r5)
            wallet.core.jni.AnyAddress r5 = new wallet.core.jni.AnyAddress
            net.safemoon.androidwallet.common.TokenType r7 = r0.f43094a
            net.safemoon.androidwallet.common.MyCoinType r7 = r7.getCoinType()
            wallet.core.jni.CoinType r7 = r7.getCoinType()
            r9 = r24
            r5.<init>((java.lang.String) r9, (wallet.core.jni.CoinType) r7)
            java.lang.String r5 = r5.description()
            if (r3 == 0) goto L_0x0191
            net.safemoon.androidwallet.common.TokenType r7 = r0.f43094a
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r20.mo61853y()
            java.lang.String r7 = r0.mo56291a(r7, r9)
            p000.vx2.m53588d(r7)
            r14.L$0 = r0
            r14.L$1 = r3
            r14.L$2 = r5
            r14.D$0 = r1
            r14.I$0 = r4
            r9 = 1
            r14.label = r9
            java.lang.Object r7 = r0.mo61905q(r7, r3, r14)
            if (r7 != r6) goto L_0x010d
            return r6
        L_0x010d:
            r9 = r0
        L_0x010e:
            p000.vx2.m53588d(r7)
            java.lang.String r7 = (java.lang.String) r7
            p000.vx2.m53590f(r5, r8)
            r14.L$0 = r9
            r14.L$1 = r3
            r14.L$2 = r5
            r14.L$3 = r7
            r14.D$0 = r1
            r14.I$0 = r4
            r10 = 2
            r14.label = r10
            java.lang.Object r10 = r9.mo61905q(r5, r3, r14)
            if (r10 != r6) goto L_0x012c
            return r6
        L_0x012c:
            r19 = r9
            r9 = r3
            r2 = r1
            r1 = r4
            r4 = r5
            r5 = r10
            r10 = r19
        L_0x0135:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0166
            p000.vx2.m53590f(r4, r8)
            r14.L$0 = r10
            r14.L$1 = r9
            r14.L$2 = r7
            r14.L$3 = r4
            r14.D$0 = r2
            r14.I$0 = r1
            r5 = 3
            r14.label = r5
            java.lang.Object r5 = r10.mo61907u(r14)
            if (r5 != r6) goto L_0x0152
            return r6
        L_0x0152:
            r17 = r1
            r12 = r2
            r16 = r4
            r15 = r7
            r14 = r9
            r11 = r10
        L_0x015a:
            p000.vx2.m53588d(r5)
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            wallet.core.jni.proto.Solana$SigningOutput r1 = r11.mo61904o(r12, r14, r15, r16, r17, r18)
            goto L_0x0190
        L_0x0166:
            r14.L$0 = r10
            r14.L$1 = r9
            r14.L$2 = r7
            r14.L$3 = r5
            r14.D$0 = r2
            r14.I$0 = r1
            r4 = 4
            r14.label = r4
            java.lang.Object r4 = r10.mo61907u(r14)
            if (r4 != r6) goto L_0x017c
            return r6
        L_0x017c:
            r17 = r1
            r12 = r2
            r16 = r5
            r15 = r7
            r14 = r9
            r11 = r10
            r5 = r4
        L_0x0185:
            p000.vx2.m53588d(r5)
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            wallet.core.jni.proto.Solana$SigningOutput r1 = r11.mo61902B(r12, r14, r15, r16, r17, r18)
        L_0x0190:
            return r1
        L_0x0191:
            p000.vx2.m53590f(r5, r8)
            r3 = r26
            r14.L$0 = r3
            r14.L$1 = r0
            r14.L$2 = r5
            r14.D$0 = r1
            r14.I$0 = r4
            r7 = 5
            r14.label = r7
            java.lang.Object r7 = r0.mo61907u(r14)
            if (r7 != r6) goto L_0x01aa
            return r6
        L_0x01aa:
            r8 = r1
            r13 = r3
            r11 = r4
            r10 = r5
            r5 = r7
            r7 = r0
        L_0x01b0:
            p000.vx2.m53588d(r5)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r1 = 0
            r14.L$0 = r1
            r14.L$1 = r1
            r14.L$2 = r1
            r1 = 6
            r14.label = r1
            java.lang.Object r5 = r7.mo61901A(r8, r10, r11, r12, r13, r14)
            if (r5 != r6) goto L_0x01c7
            return r6
        L_0x01c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana.mo61908v(double, java.lang.String, java.lang.String, int, java.math.BigInteger, ns0):java.lang.Object");
    }

    /* renamed from: w */
    public final TokenType mo61909w() {
        return this.f43094a;
    }

    /* renamed from: y */
    public Wallet mo61853y() {
        return this.f43095b;
    }
}
