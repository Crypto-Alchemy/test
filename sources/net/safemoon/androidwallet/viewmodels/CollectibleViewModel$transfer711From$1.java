package net.safemoon.androidwallet.viewmodels;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.nft.NFTTransferResponse;
import net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {115}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$transfer711From$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ k04<NFTTransferResponse> $callBack;
    public final /* synthetic */ pc2<r37> $errorCallBack;
    public final /* synthetic */ NFT721 $nft721;
    public final /* synthetic */ String $toAddress;
    public final /* synthetic */ BigInteger $tokenId;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {117, 120}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1$1 */
    /* compiled from: CollectibleViewModel.kt */
    public static final class C86521 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86521(nft721, bigInteger, str, k04, collectibleViewModel, pc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86521) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[Catch:{ Exception -> 0x0022, all -> 0x001f }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ Exception -> 0x0022, all -> 0x001f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p000.hg5.m45199b(r13)     // Catch:{ Exception -> 0x0022 }
                goto L_0x0050
            L_0x0013:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001b:
                p000.hg5.m45199b(r13)     // Catch:{ Exception -> 0x0022 }
                goto L_0x0035
            L_0x001f:
                r13 = move-exception
                goto L_0x00df
            L_0x0022:
                r13 = move-exception
                goto L_0x00b9
            L_0x0025:
                p000.hg5.m45199b(r13)
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r13 = r4     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r1 = r5     // Catch:{ Exception -> 0x0022 }
                r12.label = r3     // Catch:{ Exception -> 0x0022 }
                java.lang.Object r13 = r13.mo61850z(r1, r12)     // Catch:{ Exception -> 0x0022 }
                if (r13 != r0) goto L_0x0035
                return r0
            L_0x0035:
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Exception -> 0x0022 }
                boolean r13 = r13.booleanValue()     // Catch:{ Exception -> 0x0022 }
                if (r13 == 0) goto L_0x009d
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r5 = r4     // Catch:{ Exception -> 0x0022 }
                java.lang.String r6 = r6     // Catch:{ Exception -> 0x0022 }
                java.math.BigInteger r7 = r5     // Catch:{ Exception -> 0x0022 }
                r8 = 0
                r10 = 4
                r11 = 0
                r12.label = r2     // Catch:{ Exception -> 0x0022 }
                r9 = r12
                java.lang.Object r13 = p000.no2.C8998a.m69888b(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0022 }
                if (r13 != r0) goto L_0x0050
                return r0
            L_0x0050:
                ss1 r13 = (p000.ss1) r13     // Catch:{ Exception -> 0x0022 }
                if (r13 == 0) goto L_0x007e
                ag5$a r0 = r13.getError()     // Catch:{ Exception -> 0x0022 }
                if (r0 != 0) goto L_0x006b
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r7     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTType r2 = net.safemoon.androidwallet.model.nft.NFTType.ERC721     // Catch:{ Exception -> 0x0022 }
                java.lang.String r13 = r13.getTransactionHash()     // Catch:{ Exception -> 0x0022 }
                r1.<init>(r2, r13, r4)     // Catch:{ Exception -> 0x0022 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x006b:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r7     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                ag5$a r13 = r13.getError()     // Catch:{ Exception -> 0x0022 }
                java.lang.String r13 = r13.getMessage()     // Catch:{ Exception -> 0x0022 }
                r1.<init>(r4, r4, r13)     // Catch:{ Exception -> 0x0022 }
                r0.postValue(r1)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x007e:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r13 = r7     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r0 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                r0.<init>(r4, r4, r4)     // Catch:{ Exception -> 0x0022 }
                r13.postValue(r0)     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r13 = r8     // Catch:{ Exception -> 0x0022 }
                hu0 r5 = p000.cd7.m11843a(r13)     // Catch:{ Exception -> 0x0022 }
                r6 = 0
                r7 = 0
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1$1$1 r8 = new net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1$1$1     // Catch:{ Exception -> 0x0022 }
                pc2<r37> r13 = r9     // Catch:{ Exception -> 0x0022 }
                r8.<init>(r13, r4)     // Catch:{ Exception -> 0x0022 }
                r9 = 3
                r10 = 0
                p000.y23 unused = p000.d50.m56748b(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x009d:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r13 = r7     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r0 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ Exception -> 0x0022 }
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r1 = r8     // Catch:{ Exception -> 0x0022 }
                android.app.Application r1 = r1.mo27549b()     // Catch:{ Exception -> 0x0022 }
                android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0022 }
                r2 = 2131952379(0x7f1302fb, float:1.95412E38)
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0022 }
                r0.<init>(r4, r4, r1)     // Catch:{ Exception -> 0x0022 }
                r13.postValue(r0)     // Catch:{ Exception -> 0x0022 }
                goto L_0x00d1
            L_0x00b9:
                k04<net.safemoon.androidwallet.model.nft.NFTTransferResponse> r0 = r7     // Catch:{ all -> 0x001f }
                net.safemoon.androidwallet.model.nft.NFTTransferResponse r1 = new net.safemoon.androidwallet.model.nft.NFTTransferResponse     // Catch:{ all -> 0x001f }
                java.lang.String r2 = r13.getLocalizedMessage()     // Catch:{ all -> 0x001f }
                if (r2 != 0) goto L_0x00cb
                java.lang.String r2 = r13.getMessage()     // Catch:{ all -> 0x001f }
                if (r2 != 0) goto L_0x00cb
                java.lang.String r2 = "Error"
            L_0x00cb:
                r1.<init>(r4, r4, r2)     // Catch:{ all -> 0x001f }
                r0.postValue(r1)     // Catch:{ all -> 0x001f }
            L_0x00d1:
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r13 = r8
                k04 r13 = r13.mo61037F()
                net.safemoon.androidwallet.model.common.LoadingState r0 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r13.postValue(r0)
                r37 r13 = p000.r37.f33317a
                return r13
            L_0x00df:
                net.safemoon.androidwallet.viewmodels.CollectibleViewModel r0 = r8
                k04 r0 = r0.mo61037F()
                net.safemoon.androidwallet.model.common.LoadingState r1 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r0.postValue(r1)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$transfer711From$1.C86521.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$transfer711From$1(NFT721 nft721, BigInteger bigInteger, String str, k04<NFTTransferResponse> k04, CollectibleViewModel collectibleViewModel, pc2<r37> pc2, ns0<? super CollectibleViewModel$transfer711From$1> ns0) {
        super(2, ns0);
        this.$nft721 = nft721;
        this.$tokenId = bigInteger;
        this.$toAddress = str;
        this.$callBack = k04;
        this.this$0 = collectibleViewModel;
        this.$errorCallBack = pc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$transfer711From$1(this.$nft721, this.$tokenId, this.$toAddress, this.$callBack, this.this$0, this.$errorCallBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$transfer711From$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final NFT721 nft721 = this.$nft721;
            final BigInteger bigInteger = this.$tokenId;
            final String str = this.$toAddress;
            final k04<NFTTransferResponse> k04 = this.$callBack;
            final CollectibleViewModel collectibleViewModel = this.this$0;
            final pc2<r37> pc2 = this.$errorCallBack;
            C86521 r3 = new C86521((ns0<? super C86521>) null);
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
