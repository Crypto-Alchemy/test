package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.nft.NFTBalance;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$balance$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {313}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$balance$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ k04<NFTBalance> $callBack;
    public final /* synthetic */ no2 $iNFTWeb;
    public final /* synthetic */ String $tokenId;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$balance$1$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {316, 325, 334}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$balance$1$1 */
    /* compiled from: CollectibleViewModel.kt */
    public static final class C86481 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86481(no2, str, k04, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86481) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[Catch:{ Exception -> 0x00ab }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x008d A[Catch:{ Exception -> 0x00ab }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r4) goto L_0x0022
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x00ab }
                goto L_0x0098
            L_0x0016:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001e:
                p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x00ab }
                goto L_0x0075
            L_0x0022:
                p000.hg5.m45199b(r8)     // Catch:{ Exception -> 0x00ab }
                goto L_0x0044
            L_0x0026:
                p000.hg5.m45199b(r8)
                no2 r8 = r3     // Catch:{ Exception -> 0x00ab }
                boolean r1 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721     // Catch:{ Exception -> 0x00ab }
                if (r1 == 0) goto L_0x005a
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721 r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT721) r8     // Catch:{ Exception -> 0x00ab }
                java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x00ab }
                java.lang.String r5 = r4     // Catch:{ Exception -> 0x00ab }
                p000.vx2.m53588d(r5)     // Catch:{ Exception -> 0x00ab }
                r1.<init>(r5)     // Catch:{ Exception -> 0x00ab }
                r7.label = r4     // Catch:{ Exception -> 0x00ab }
                java.lang.Object r8 = r8.mo61850z(r1, r7)     // Catch:{ Exception -> 0x00ab }
                if (r8 != r0) goto L_0x0044
                return r0
            L_0x0044:
                java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x00ab }
                boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x00ab }
                k04<net.safemoon.androidwallet.model.nft.NFTBalance> r1 = r5     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTBalance r5 = new net.safemoon.androidwallet.model.nft.NFTBalance     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTType r6 = net.safemoon.androidwallet.model.nft.NFTType.ERC721     // Catch:{ Exception -> 0x00ab }
                if (r8 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r4 = 0
            L_0x0054:
                r5.<init>(r6, r4)     // Catch:{ Exception -> 0x00ab }
                r1.postValue(r5)     // Catch:{ Exception -> 0x00ab }
            L_0x005a:
                no2 r8 = r3     // Catch:{ Exception -> 0x00ab }
                boolean r1 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155     // Catch:{ Exception -> 0x00ab }
                if (r1 == 0) goto L_0x0087
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155 r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFT1155) r8     // Catch:{ Exception -> 0x00ab }
                java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x00ab }
                java.lang.String r4 = r4     // Catch:{ Exception -> 0x00ab }
                p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x00ab }
                r1.<init>(r4)     // Catch:{ Exception -> 0x00ab }
                r7.label = r3     // Catch:{ Exception -> 0x00ab }
                java.lang.Object r8 = r8.mo61845x(r1, r7)     // Catch:{ Exception -> 0x00ab }
                if (r8 != r0) goto L_0x0075
                return r0
            L_0x0075:
                java.math.BigInteger r8 = (java.math.BigInteger) r8     // Catch:{ Exception -> 0x00ab }
                k04<net.safemoon.androidwallet.model.nft.NFTBalance> r1 = r5     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTBalance r3 = new net.safemoon.androidwallet.model.nft.NFTBalance     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTType r4 = net.safemoon.androidwallet.model.nft.NFTType.ERC1155     // Catch:{ Exception -> 0x00ab }
                int r8 = r8.intValue()     // Catch:{ Exception -> 0x00ab }
                r3.<init>(r4, r8)     // Catch:{ Exception -> 0x00ab }
                r1.postValue(r3)     // Catch:{ Exception -> 0x00ab }
            L_0x0087:
                no2 r8 = r3     // Catch:{ Exception -> 0x00ab }
                boolean r1 = r8 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana     // Catch:{ Exception -> 0x00ab }
                if (r1 == 0) goto L_0x00b1
                net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana r8 = (net.safemoon.androidwallet.viewmodels.blockChainClass.NFTSolana) r8     // Catch:{ Exception -> 0x00ab }
                r7.label = r2     // Catch:{ Exception -> 0x00ab }
                java.lang.Object r8 = r8.mo61851C(r7)     // Catch:{ Exception -> 0x00ab }
                if (r8 != r0) goto L_0x0098
                return r0
            L_0x0098:
                java.math.BigInteger r8 = (java.math.BigInteger) r8     // Catch:{ Exception -> 0x00ab }
                k04<net.safemoon.androidwallet.model.nft.NFTBalance> r0 = r5     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTBalance r1 = new net.safemoon.androidwallet.model.nft.NFTBalance     // Catch:{ Exception -> 0x00ab }
                net.safemoon.androidwallet.model.nft.NFTType r2 = net.safemoon.androidwallet.model.nft.NFTType.SOLANA     // Catch:{ Exception -> 0x00ab }
                int r8 = r8.intValue()     // Catch:{ Exception -> 0x00ab }
                r1.<init>(r2, r8)     // Catch:{ Exception -> 0x00ab }
                r0.postValue(r1)     // Catch:{ Exception -> 0x00ab }
                goto L_0x00b1
            L_0x00ab:
                k04<net.safemoon.androidwallet.model.nft.NFTBalance> r8 = r5
                r0 = 0
                r8.postValue(r0)
            L_0x00b1:
                r37 r8 = p000.r37.f33317a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$balance$1.C86481.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$balance$1(no2 no2, String str, k04<NFTBalance> k04, ns0<? super CollectibleViewModel$balance$1> ns0) {
        super(2, ns0);
        this.$iNFTWeb = no2;
        this.$tokenId = str;
        this.$callBack = k04;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$balance$1(this.$iNFTWeb, this.$tokenId, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$balance$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final no2 no2 = this.$iNFTWeb;
            final String str = this.$tokenId;
            final k04<NFTBalance> k04 = this.$callBack;
            C86481 r1 = new C86481((ns0<? super C86481>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
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
