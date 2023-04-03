package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CollectibleViewModel$hideCollectionsForever$1", mo48632f = "CollectibleViewModel.kt", mo48633l = {788, 789}, mo48634m = "invokeSuspend")
/* compiled from: CollectibleViewModel.kt */
public final class CollectibleViewModel$hideCollectionsForever$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ RoomCollectionAndNft $roomCollectionAndNft;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CollectibleViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectibleViewModel$hideCollectionsForever$1(CollectibleViewModel collectibleViewModel, RoomCollectionAndNft roomCollectionAndNft, ns0<? super CollectibleViewModel$hideCollectionsForever$1> ns0) {
        super(2, ns0);
        this.this$0 = collectibleViewModel;
        this.$roomCollectionAndNft = roomCollectionAndNft;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CollectibleViewModel$hideCollectionsForever$1(this.this$0, this.$roomCollectionAndNft, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CollectibleViewModel$hideCollectionsForever$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC, Splitter:B:31:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r14.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r4) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dd
        L_0x0014:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001c:
            java.lang.Object r1 = r14.L$1
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r1 = (net.safemoon.androidwallet.viewmodels.CollectibleViewModel) r1
            java.lang.Object r4 = r14.L$0
            net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft r4 = (net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft) r4
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00c8
        L_0x0029:
            p000.hg5.m45199b(r15)
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r15 = r14.this$0
            net.safemoon.androidwallet.model.wallets.Wallet r15 = r15.mo61070y()
            if (r15 == 0) goto L_0x00dd
            net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft r1 = r14.$roomCollectionAndNft
            net.safemoon.androidwallet.viewmodels.CollectibleViewModel r5 = r14.this$0
            net.safemoon.androidwallet.model.collectible.RoomCollection r6 = r1.getCollection()
            java.lang.String r6 = r6.getMarketPlace()
            if (r6 == 0) goto L_0x0082
            int r7 = r6.hashCode()
            r8 = 279271610(0x10a558ba, float:6.521773E-29)
            if (r7 == r8) goto L_0x0071
            r8 = 1957750149(0x74b0e585, float:1.1212152E32)
            if (r7 == r8) goto L_0x005f
            r8 = 2113850942(0x7dfece3e, float:4.2336848E37)
            if (r7 == r8) goto L_0x0056
            goto L_0x0082
        L_0x0056:
            java.lang.String r7 = "MORALIS_SOLANA"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0068
            goto L_0x0082
        L_0x005f:
            java.lang.String r7 = "MORALIS"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0068
            goto L_0x0082
        L_0x0068:
            net.safemoon.androidwallet.model.collectible.RoomCollection r6 = r1.getCollection()
            java.lang.String r6 = r6.getContractAddress()
            goto L_0x0083
        L_0x0071:
            java.lang.String r7 = "OPEN_SEA"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0082
            net.safemoon.androidwallet.model.collectible.RoomCollection r6 = r1.getCollection()
            java.lang.String r6 = r6.getSlug()
            goto L_0x0083
        L_0x0082:
            r6 = r3
        L_0x0083:
            if (r6 == 0) goto L_0x00dd
            net.safemoon.androidwallet.common.TokenType$a r7 = net.safemoon.androidwallet.common.TokenType.Companion     // Catch:{ Exception -> 0x00dd }
            net.safemoon.androidwallet.model.collectible.RoomCollection r8 = r1.getCollection()     // Catch:{ Exception -> 0x00dd }
            int r8 = r8.getChain()     // Catch:{ Exception -> 0x00dd }
            net.safemoon.androidwallet.common.TokenType r7 = r7.mo57099b(r8)     // Catch:{ Exception -> 0x00dd }
            net.safemoon.androidwallet.common.MyCoinType r7 = r7.getCoinType()     // Catch:{ Exception -> 0x00dd }
            int r7 = r7.getValue()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r9 = r15.getAddress(r7)     // Catch:{ Exception -> 0x00dd }
            ho3 r15 = r5.mo61042K()     // Catch:{ Exception -> 0x00dd }
            net.safemoon.androidwallet.model.nft.DeleteNftIdList r7 = new net.safemoon.androidwallet.model.nft.DeleteNftIdList     // Catch:{ Exception -> 0x00dd }
            r10 = 0
            java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00dd }
            r11 = 0
            r8[r11] = r6     // Catch:{ Exception -> 0x00dd }
            java.util.ArrayList r11 = p000.ck0.m33058f(r8)     // Catch:{ Exception -> 0x00dd }
            r12 = 2
            r13 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00dd }
            k90 r15 = r15.mo52283l(r7)     // Catch:{ Exception -> 0x00dd }
            r14.L$0 = r1     // Catch:{ Exception -> 0x00dd }
            r14.L$1 = r5     // Catch:{ Exception -> 0x00dd }
            r14.label = r4     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r15 = retrofit2.KotlinExtensions.m71521c(r15, r14)     // Catch:{ Exception -> 0x00dd }
            if (r15 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            r4 = r1
            r1 = r5
        L_0x00c8:
            net.safemoon.androidwallet.model.collectible.RoomCollection r15 = r4.getCollection()     // Catch:{ Exception -> 0x00dd }
            int r15 = r15.getChain()     // Catch:{ Exception -> 0x00dd }
            r14.L$0 = r3     // Catch:{ Exception -> 0x00dd }
            r14.L$1 = r3     // Catch:{ Exception -> 0x00dd }
            r14.label = r2     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r15 = r1.mo61056g0(r15, r14)     // Catch:{ Exception -> 0x00dd }
            if (r15 != r0) goto L_0x00dd
            return r0
        L_0x00dd:
            r37 r15 = p000.r37.f33317a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.CollectibleViewModel$hideCollectionsForever$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
