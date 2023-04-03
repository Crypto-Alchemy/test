package net.safemoon.androidwallet.fragments.collectibles;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.collectible.AssetTrait;
import net.safemoon.androidwallet.model.nft.NFTData;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/model/nft/NFTData;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NftDetailFragment.kt */
public final class NftDetailFragment$nftData$2 extends Lambda implements pc2<NFTData> {
    public final /* synthetic */ NftDetailFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/collectibles/NftDetailFragment$nftData$2$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lnet/safemoon/androidwallet/model/collectible/AssetTrait;", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$nftData$2$a */
    /* compiled from: NftDetailFragment.kt */
    public static final class C8542a extends TypeToken<List<? extends AssetTrait>> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NftDetailFragment$nftData$2(NftDetailFragment nftDetailFragment) {
        super(0);
        this.this$0 = nftDetailFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r0 == false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.safemoon.androidwallet.model.nft.NFTData invoke() {
        /*
            r11 = this;
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r0 = r11.this$0
            net.safemoon.androidwallet.model.collectible.RoomNFT r0 = r0.mo57997K()
            java.lang.String r1 = r0.getImage_preview_url()
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r0 = r11.this$0
            net.safemoon.androidwallet.model.collectible.RoomCollection r0 = r0.mo57995I()
            java.lang.String r0 = r0.getMarketPlace()
            java.lang.String r7 = "OPEN_SEA"
            boolean r0 = p000.vx2.m53586b(r0, r7)
            r8 = 1
            r9 = 0
            r10 = 0
            if (r0 == 0) goto L_0x0076
            r0 = 2
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r1 == 0) goto L_0x0039
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r3)
            p000.vx2.m53590f(r3, r2)
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "=s120"
            boolean r3 = p000.yb6.m74343x(r3, r4, r10, r0, r9)
            if (r3 != r8) goto L_0x0039
            r3 = r8
            goto L_0x003a
        L_0x0039:
            r3 = r10
        L_0x003a:
            if (r3 != 0) goto L_0x0056
            if (r1 == 0) goto L_0x0053
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r3)
            p000.vx2.m53590f(r3, r2)
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = "=s250"
            boolean r0 = p000.yb6.m74343x(r3, r2, r10, r0, r9)
            if (r0 != r8) goto L_0x0053
            r0 = r8
            goto L_0x0054
        L_0x0053:
            r0 = r10
        L_0x0054:
            if (r0 == 0) goto L_0x0076
        L_0x0056:
            if (r1 == 0) goto L_0x0065
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "=s120"
            java.lang.String r3 = "=s1000"
            java.lang.String r0 = p000.yb6.m74332I(r1, r2, r3, r4, r5, r6)
            r1 = r0
            goto L_0x0066
        L_0x0065:
            r1 = r9
        L_0x0066:
            if (r1 == 0) goto L_0x0075
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "=s250"
            java.lang.String r3 = "=s1000"
            java.lang.String r0 = p000.yb6.m74332I(r1, r2, r3, r4, r5, r6)
            r1 = r0
            goto L_0x0076
        L_0x0075:
            r1 = r9
        L_0x0076:
            net.safemoon.androidwallet.model.nft.NFTData r0 = new net.safemoon.androidwallet.model.nft.NFTData
            r0.<init>()
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment r2 = r11.this$0
            net.safemoon.androidwallet.model.collectible.RoomNFT r3 = r2.mo57997K()
            java.lang.Long r3 = r3.getId()
            r0.setRoomId(r3)
            net.safemoon.androidwallet.model.collectible.RoomNFT r3 = r2.mo57997K()
            java.lang.String r3 = r3.getName()
            r0.setName(r3)
            r0.setImageUrl(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getImage_data()
            r0.setImageData(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getAnimation_url()
            if (r1 == 0) goto L_0x00b1
            java.lang.String r1 = p000.db6.m56794c(r1)
            if (r1 != 0) goto L_0x00b9
        L_0x00b1:
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getImage_preview_url()
        L_0x00b9:
            r0.setAnimationUrl(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getDescription()
            r0.setDescription(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$nftData$2$a r3 = new net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$nftData$2$a     // Catch:{ Exception -> 0x011a }
            r3.<init>()     // Catch:{ Exception -> 0x011a }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x011a }
            com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ Exception -> 0x011a }
            r4.<init>()     // Catch:{ Exception -> 0x011a }
            net.safemoon.androidwallet.model.collectible.RoomNFT r5 = r2.mo57997K()     // Catch:{ Exception -> 0x011a }
            java.lang.String r5 = r5.getAttributes()     // Catch:{ Exception -> 0x011a }
            java.lang.Object r3 = r4.fromJson((java.lang.String) r5, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x011a }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x011a }
            if (r3 == 0) goto L_0x011a
            java.lang.String r4 = "properties"
            p000.vx2.m53590f(r3, r4)     // Catch:{ Exception -> 0x011a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x011a }
        L_0x00f3:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x011a }
            if (r4 == 0) goto L_0x011a
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x011a }
            net.safemoon.androidwallet.model.collectible.AssetTrait r4 = (net.safemoon.androidwallet.model.collectible.AssetTrait) r4     // Catch:{ Exception -> 0x011a }
            if (r4 == 0) goto L_0x00f3
            net.safemoon.androidwallet.model.nft.NFTData$Property r5 = new net.safemoon.androidwallet.model.nft.NFTData$Property     // Catch:{ Exception -> 0x011a }
            java.lang.String r6 = r4.getTrait_type()     // Catch:{ Exception -> 0x011a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x011a }
            if (r4 == 0) goto L_0x0112
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x011a }
            goto L_0x0113
        L_0x0112:
            r4 = r9
        L_0x0113:
            r5.<init>(r6, r4)     // Catch:{ Exception -> 0x011a }
            r1.add(r5)     // Catch:{ Exception -> 0x011a }
            goto L_0x00f3
        L_0x011a:
            r0.setProperties(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            int r1 = r1.getChain()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setChainID(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getPermalink()
            r0.setPermalink(r1)
            net.safemoon.androidwallet.model.collectible.RoomCollection r1 = r2.mo57995I()
            java.lang.String r1 = r1.getSlug()
            r0.setSlug(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getOpenSeaUrl()
            r0.setOpenSeaUrl(r1)
            net.safemoon.androidwallet.model.collectible.AssetContract r1 = new net.safemoon.androidwallet.model.collectible.AssetContract
            r1.<init>()
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getContractAddress()
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0161
            goto L_0x0162
        L_0x0161:
            r8 = r10
        L_0x0162:
            if (r8 == 0) goto L_0x01a5
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getMarketPlace()
            boolean r3 = p000.vx2.m53586b(r3, r7)
            if (r3 == 0) goto L_0x01a5
            net.safemoon.androidwallet.model.collectible.Asset$Companion r3 = net.safemoon.androidwallet.model.collectible.Asset.Companion
            net.safemoon.androidwallet.model.collectible.RoomNFT r4 = r2.mo57997K()
            java.lang.String r4 = r4.getFullData()
            net.safemoon.androidwallet.model.collectible.Asset r3 = r3.fromString(r4)
            if (r3 == 0) goto L_0x01d1
            net.safemoon.androidwallet.model.collectible.AssetContract r3 = r3.getAsset_contract()
            if (r3 == 0) goto L_0x01d1
            java.lang.String r4 = r3.getAddress()
            r1.setAddress(r4)
            java.lang.String r4 = r3.getAsset_contract_type()
            r1.setAsset_contract_type(r4)
            java.lang.String r4 = r3.getSchema_name()
            r1.setSchema_name(r4)
            java.lang.String r3 = r3.getName()
            r1.setName(r3)
            goto L_0x01d1
        L_0x01a5:
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getContractAddress()
            r1.setAddress(r3)
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getContract_type()
            r1.setAsset_contract_type(r3)
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getContract_type()
            r1.setSchema_name(r3)
            net.safemoon.androidwallet.model.collectible.RoomCollection r3 = r2.mo57995I()
            java.lang.String r3 = r3.getName()
            r1.setName(r3)
        L_0x01d1:
            r0.setAssetContract(r1)
            net.safemoon.androidwallet.model.collectible.RoomNFT r1 = r2.mo57997K()
            java.lang.String r1 = r1.getToken_id()
            r0.setTokenId(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.setPosition(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.collectibles.NftDetailFragment$nftData$2.invoke():net.safemoon.androidwallet.model.nft.NFTData");
    }
}
