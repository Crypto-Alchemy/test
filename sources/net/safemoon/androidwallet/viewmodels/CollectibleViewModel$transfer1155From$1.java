package net.safemoon.androidwallet.viewmodels;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;
import net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {182}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$transfer1155From$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ BigInteger $amount;
    public final /* synthetic */ k04<NFTTransferResponse> $callBack;
    public final /* synthetic */ pc2<r37> $errorCallBack;
    public final /* synthetic */ NFT1155 $nft1155;
    public final /* synthetic */ String $toAddress;
    public final /* synthetic */ BigInteger $tokenId;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {184, 185}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1$1 */
    /* compiled from: CollectibleViewModel.kt */
    public static final class C86501 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86501(nft1155, bigInteger, bigInteger2, str, k04, collectibleViewModel, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86501) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0022, all -> 0x001f }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ Exception -> 0x0022, all -> 0x001f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x0022 }
                goto L_0x0050
            L_0x0013:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001b:
                p000.hg5.m45199b(r12)     // Catch:{ Exception -> 0x0022 }
                goto L_0x0035
            L_0x001f:
                r12 = move-exception
                goto L_0x00df
            L_0x0022:
                r12 = move-exception
                goto L_0x00b9
            L_0x0025:
                p000.hg5.m45199b(r12)
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r12 = r4     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r1 = r5     // Catch:{ Exception -> 0x0022 }
                r11.label = r3     // Catch:{ Exception -> 0x0022 }
                java.lang.Object r12 = r12.mo61845x(r1, r11)     // Catch:{ Exception -> 0x0022 }
                if (r12 != r0) goto L_0x0035
                return r0
            L_0x0035:
                java.math.BigInteger r12 = (java.math.BigInteger) r12     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r1 = r6     // Catch:{ Exception -> 0x0022 }
                int r12 = r12.compareTo(r1)     // Catch:{ Exception -> 0x0022 }
                if (r12 < 0) goto L_0x009d
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r12 = r4     // Catch:{ Exception -> 0x0022 }
                java.lang.String r1 = r7     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r3 = r5     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r5 = r6     // Catch:{ Exception -> 0x0022 }
                r11.label = r2     // Catch:{ Exception -> 0x0022 }
                java.lang.Object r12 = r12.mo61843k(r1, r3, r5, r11)     // Catch:{ Exception -> 0x0022 }
                if (r12 != r0) goto L_0x0050
                return r0
            L_0x0050:
                ss1 r12 = (p000.ss1) r12     // Catch:{ Exception -> 0x0022 }
                if (r12 == 0) goto L_0x007e
                ag5$a r0 = r12.getError()     // Catch:{ Exception -> 0x0022 }
                if (r0 != 0) goto L_0x006b
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r8     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTType r2 = net.safemoon.androidwallet.model.nft.NFTType.ERC1155     // Catch:{ Exception -> 0x0022 }
                java.lang.String r12 = r12.getTransactionHash()     // Catch:{ Exception -> 0x0022 }
                r1.<init>(r2, r12, r4)     // Catch:{ Exception -> 0x0022 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x006b:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r8     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                ag5$a r12 = r12.getError()     // Catch:{ Exception -> 0x0022 }
                java.lang.String r12 = r12.getMessage()     // Catch:{ Exception -> 0x0022 }
                r1.<init>(r4, r4, r12)     // Catch:{ Exception -> 0x0022 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x007e:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r12 = r8     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r0 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                r0.<init>(r4, r4, r4)     // Catch:{ Exception -> 0x0022 }
                r12.postValue(r0)     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r12 = r9     // Catch:{ Exception -> 0x0022 }
                hu0 r5 = p000.cd7.m11843a(r12)     // Catch:{ Exception -> 0x0022 }
                r6 = 0
                r7 = 0
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1$1$1 r8 = new net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1$1$1     // Catch:{ Exception -> 0x0022 }
                pc2<r37> r12 = r10     // Catch:{ Exception -> 0x0022 }
                r8.<init>(r12, r4)     // Catch:{ Exception -> 0x0022 }
                r9 = 3
                r10 = 0
                p000.y23 unused = p000.d50.m56748b(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x009d:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r12 = r8     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r0 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r1 = r9     // Catch:{ Exception -> 0x0022 }
                android.app.Application r1 = r1.mo27549b()     // Catch:{ Exception -> 0x0022 }
                android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0022 }
                r2 = 2131952378(0x7f1302fa, float:1.9541197E38)
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0022 }
                r0.<init>(r4, r4, r1)     // Catch:{ Exception -> 0x0022 }
                r12.postValue(r0)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x00b9:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r8     // Catch:{ all -> 0x001f }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ all -> 0x001f }
                java.lang.String r2 = r12.getLocalizedMessage()     // Catch:{ all -> 0x001f }
                if (r2 != 0) goto L_0x00cb
                java.lang.String r2 = r12.getMessage()     // Catch:{ all -> 0x001f }
                if (r2 != 0) goto L_0x00cb
                java.lang.String r2 = "Error"
            L_0x00cb:
                r1.<init>(r4, r4, r2)     // Catch:{ all -> 0x001f }
                r0.postValue(r1)     // Catch:{ all -> 0x001f }
            L_0x00d1:
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r12 = r9
                k04 r12 = r12.mo61037F()
                net.safemoon.androidwallet.model.common.LoadingState r0 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r12.postValue(r0)
                r37 r12 = p000.r37.f33317a
                return r12
            L_0x00df:
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r9
                k04 r0 = r0.mo61037F()
                net.safemoon.androidwallet.model.common.LoadingState r1 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r0.postValue(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer1155From$1.C86501.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$transfer1155From$1(NFT1155 nft1155, BigInteger bigInteger, BigInteger bigInteger2, String str, k04<NFTTransferResponse> k04, CollectibleViewModel collectibleViewModel, pc2<r37> pc2, ns0<? super CollectibleViewModel$transfer1155From$1> ns0) {
        super(2, ns0);
        this.$nft1155 = nft1155;
        this.$tokenId = bigInteger;
        this.$amount = bigInteger2;
        this.$toAddress = str;
        this.$callBack = k04;
        this.this$0 = collectibleViewModel;
        this.$errorCallBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$transfer1155From$1(this.$nft1155, this.$tokenId, this.$amount, this.$toAddress, this.$callBack, this.this$0, this.$errorCallBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$transfer1155From$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final NFT1155 nft1155 = this.$nft1155;
            final BigInteger bigInteger = this.$tokenId;
            final BigInteger bigInteger2 = this.$amount;
            final String str = this.$toAddress;
            final k04<NFTTransferResponse> k04 = this.$callBack;
            final CollectibleViewModel collectibleViewModel = this.this$0;
            final pc2<r37> pc2 = this.$errorCallBack;
            C86501 r3 = new C86501((ns0<? super C86501>) null);
            this.label = 1;
            if (b50.m55768e(b, r3, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
