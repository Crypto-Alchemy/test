package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$hideCollections$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {752, 759, 761}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$hideCollections$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ boolean $isHide;
    public final /* synthetic */ RoomCollectionAndNft $roomCollectionAndNft;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$hideCollections$1(CollectibleViewModel collectibleViewModel, RoomCollectionAndNft roomCollectionAndNft, boolean z, ns0<? super CollectibleViewModel$hideCollections$1> ns0) {
        super(2, ns0);
        this.this$0 = collectibleViewModel;
        this.$roomCollectionAndNft = roomCollectionAndNft;
        this.$isHide = z;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$hideCollections$1(this.this$0, this.$roomCollectionAndNft, this.$isHide, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$hideCollections$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x002e
            if (r2 == r6) goto L_0x0021
            if (r2 == r4) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            p000.hg5.m45199b(r19)     // Catch:{ Exception -> 0x0111 }
            goto L_0x0111
        L_0x0019:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0021:
            java.lang.Object r2 = r0.L$1
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r2 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r2
            java.lang.Object r4 = r0.L$0
            net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft r4 = (net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft) r4
            p000.hg5.m45199b(r19)     // Catch:{ Exception -> 0x0111 }
            goto L_0x00fc
        L_0x002e:
            p000.hg5.m45199b(r19)
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r2 = r0.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r2 = r2.mo61070y()
            if (r2 == 0) goto L_0x0111
            net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft r7 = r0.$roomCollectionAndNft
            boolean r8 = r0.$isHide
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r9 = r0.this$0
            net.safemoon.androidwallet.model.collectible.RoomCollection r10 = r7.getCollection()
            java.lang.String r10 = r10.getMarketPlace()
            if (r10 == 0) goto L_0x0089
            int r11 = r10.hashCode()
            r12 = 279271610(0x10a558ba, float:6.521773E-29)
            if (r11 == r12) goto L_0x0078
            r12 = 1957750149(0x74b0e585, float:1.1212152E32)
            if (r11 == r12) goto L_0x0066
            r12 = 2113850942(0x7dfece3e, float:4.2336848E37)
            if (r11 == r12) goto L_0x005d
            goto L_0x0089
        L_0x005d:
            java.lang.String r11 = "MORALIS_SOLANA"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x006f
            goto L_0x0089
        L_0x0066:
            java.lang.String r11 = "MORALIS"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            net.safemoon.androidwallet.model.collectible.RoomCollection r10 = r7.getCollection()
            java.lang.String r10 = r10.getContractAddress()
            goto L_0x008a
        L_0x0078:
            java.lang.String r11 = "OPEN_SEA"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0089
            net.safemoon.androidwallet.model.collectible.RoomCollection r10 = r7.getCollection()
            java.lang.String r10 = r10.getSlug()
            goto L_0x008a
        L_0x0089:
            r10 = r5
        L_0x008a:
            net.safemoon.androidwallet.common.TokenType$a r11 = net.safemoon.androidwallet.common.TokenType.Companion
            net.safemoon.androidwallet.model.collectible.RoomCollection r12 = r7.getCollection()
            int r12 = r12.getChain()
            net.safemoon.androidwallet.common.TokenType r11 = r11.mo57099b(r12)
            net.safemoon.androidwallet.common.MyCoinType r11 = r11.getCoinType()
            int r11 = r11.getValue()
            java.lang.String r13 = r2.getAddress(r11)
            if (r10 == 0) goto L_0x0111
            r2 = 0
            if (r8 == 0) goto L_0x00d4
            ho3 r4 = r9.mo61042K()     // Catch:{ Exception -> 0x0111 }
            net.safemoon.androidwallet.model.nft.DeleteNftIdList r8 = new net.safemoon.androidwallet.model.nft.DeleteNftIdList     // Catch:{ Exception -> 0x0111 }
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0111 }
            r11[r2] = r10     // Catch:{ Exception -> 0x0111 }
            java.util.ArrayList r14 = p000.ck0.m33058f(r11)     // Catch:{ Exception -> 0x0111 }
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r8
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0111 }
            k90 r2 = r4.mo52283l(r8)     // Catch:{ Exception -> 0x0111 }
            r0.L$0 = r7     // Catch:{ Exception -> 0x0111 }
            r0.L$1 = r9     // Catch:{ Exception -> 0x0111 }
            r0.label = r6     // Catch:{ Exception -> 0x0111 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r0)     // Catch:{ Exception -> 0x0111 }
            if (r2 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r4 = r7
            r2 = r9
            goto L_0x00fc
        L_0x00d4:
            ho3 r8 = r9.mo61042K()     // Catch:{ Exception -> 0x0111 }
            net.safemoon.androidwallet.model.nft.DeleteNftIdList r11 = new net.safemoon.androidwallet.model.nft.DeleteNftIdList     // Catch:{ Exception -> 0x0111 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x0111 }
            r6[r2] = r10     // Catch:{ Exception -> 0x0111 }
            java.util.ArrayList r14 = p000.ck0.m33058f(r6)     // Catch:{ Exception -> 0x0111 }
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0111 }
            k90 r2 = r8.mo52286o(r11)     // Catch:{ Exception -> 0x0111 }
            r0.L$0 = r7     // Catch:{ Exception -> 0x0111 }
            r0.L$1 = r9     // Catch:{ Exception -> 0x0111 }
            r0.label = r4     // Catch:{ Exception -> 0x0111 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r0)     // Catch:{ Exception -> 0x0111 }
            if (r2 != r1) goto L_0x00d1
            return r1
        L_0x00fc:
            net.safemoon.androidwallet.model.collectible.RoomCollection r4 = r4.getCollection()     // Catch:{ Exception -> 0x0111 }
            int r4 = r4.getChain()     // Catch:{ Exception -> 0x0111 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x0111 }
            r0.L$1 = r5     // Catch:{ Exception -> 0x0111 }
            r0.label = r3     // Catch:{ Exception -> 0x0111 }
            java.lang.Object r2 = r2.mo61056g0(r4, r0)     // Catch:{ Exception -> 0x0111 }
            if (r2 != r1) goto L_0x0111
            return r1
        L_0x0111:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$hideCollections$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
