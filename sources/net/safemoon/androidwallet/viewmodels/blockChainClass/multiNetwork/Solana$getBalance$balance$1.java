package net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Ljava/math/BigInteger;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$balance$1", mo48632f = "Solana.kt", mo48633l = {40, 46}, mo48634m = "invokeSuspend")
/* compiled from: Solana.kt */
public final class Solana$getBalance$balance$1 extends SuspendLambda implements fd2<Integer, ns0<? super BigInteger>, Object> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ String $contractAddress;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ Solana this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Solana$getBalance$balance$1(String str, Solana solana, String str2, ns0<? super Solana$getBalance$balance$1> ns0) {
        super(2, ns0);
        this.$contractAddress = str;
        this.this$0 = solana;
        this.$address = str2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Solana$getBalance$balance$1 solana$getBalance$balance$1 = new Solana$getBalance$balance$1(this.$contractAddress, this.this$0, this.$address, ns0);
        solana$getBalance$balance$1.I$0 = ((Number) obj).intValue();
        return solana$getBalance$balance$1;
    }

    public final Object invoke(int i, ns0<? super BigInteger> ns0) {
        return ((Solana$getBalance$balance$1) create(Integer.valueOf(i), ns0)).invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (ns0<? super BigInteger>) (ns0) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r6.label
            java.lang.String r2 = "Retry"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            p000.hg5.m45199b(r7)
            goto L_0x005c
        L_0x0014:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001c:
            p000.hg5.m45199b(r7)
            goto L_0x00cb
        L_0x0021:
            p000.hg5.m45199b(r7)
            int r7 = r6.I$0
            if (r7 < 0) goto L_0x00f7
            java.lang.String r7 = r6.$contractAddress
            if (r7 == 0) goto L_0x00aa
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0034
            r7 = r4
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            if (r7 == 0) goto L_0x0039
            goto L_0x00aa
        L_0x0039:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r7 = r6.this$0
            net.safemoon.androidwallet.common.TokenType r7 = r7.mo61909w()
            n65 r7 = p000.C9384u3.m72573n(r7)
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenRequest r1 = new net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenRequest
            java.lang.String r4 = r6.$address
            p000.vx2.m53588d(r4)
            java.lang.String r5 = r6.$contractAddress
            r1.<init>(r4, r5)
            k90 r7 = r7.mo56378d(r1)
            r6.label = r3
            java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r7, r6)
            if (r7 != r0) goto L_0x005c
            return r0
        L_0x005c:
            bg5 r7 = (p000.bg5) r7
            java.lang.Object r7 = r7.mo50578a()
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse r7 = (net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse) r7
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Result r7 = r7.getResult()
            if (r7 == 0) goto L_0x00a4
            java.util.ArrayList r7 = r7.getValue()
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r7)
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Value r7 = (net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse.Value) r7
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Account r7 = r7.getAccount()
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Data r7 = r7.getData()
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Parsed r7 = r7.getParsed()
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$Info r7 = r7.getInfo()
            if (r7 == 0) goto L_0x00a4
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceTokenResponse$TokenAmount r7 = r7.getTokenAmount()
            if (r7 == 0) goto L_0x00a4
            java.lang.String r7 = r7.getAmount()
            if (r7 == 0) goto L_0x00a4
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r7)
            goto L_0x00f8
        L_0x00a4:
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>(r2)
            throw r7
        L_0x00aa:
            net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana r7 = r6.this$0
            net.safemoon.androidwallet.common.TokenType r7 = r7.mo61909w()
            n65 r7 = p000.C9384u3.m72573n(r7)
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceRequest r1 = new net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceRequest
            java.lang.String r3 = r6.$address
            p000.vx2.m53588d(r3)
            r1.<init>(r3)
            k90 r7 = r7.mo56379e(r1)
            r6.label = r4
            java.lang.Object r7 = retrofit2.KotlinExtensions.m71521c(r7, r6)
            if (r7 != r0) goto L_0x00cb
            return r0
        L_0x00cb:
            bg5 r7 = (p000.bg5) r7
            java.lang.Object r7 = r7.mo50578a()
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceResponse r7 = (net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceResponse) r7
            if (r7 == 0) goto L_0x00f1
            net.safemoon.androidwallet.model.rpc2.solana.SolanaBalanceResponse$Result r7 = r7.getResult()
            if (r7 == 0) goto L_0x00f1
            java.lang.Long r7 = r7.getValue()
            if (r7 == 0) goto L_0x00f1
            long r0 = r7.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r7 = "valueOf(this)"
            p000.vx2.m53590f(r0, r7)
            if (r0 == 0) goto L_0x00f1
            goto L_0x00f8
        L_0x00f1:
            java.lang.Exception r7 = new java.lang.Exception
            r7.<init>(r2)
            throw r7
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.multiNetwork.Solana$getBalance$balance$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
