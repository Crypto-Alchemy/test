package p000;

import androidx.recyclerview.widget.C1294g;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.model.collectible.RoomCollectionAndNft;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0005*\u0001\u0000\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, mo44877d2 = {"rj0$a", "a", "Lrj0$a;", "DIFF_CALL_BACK", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: rj0 */
/* compiled from: CollectionsAdapter.kt */
public final class rj0 {

    /* renamed from: a */
    public static final C9255a f44380a = new C9255a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"rj0$a", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "oldItem", "newItem", "", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rj0$a */
    /* compiled from: CollectionsAdapter.kt */
    public static final class C9255a extends C1294g.C1300f<RoomCollectionAndNft> {
        /* renamed from: a */
        public boolean areContentsTheSame(RoomCollectionAndNft roomCollectionAndNft, RoomCollectionAndNft roomCollectionAndNft2) {
            String str;
            vx2.m53591g(roomCollectionAndNft, "oldItem");
            vx2.m53591g(roomCollectionAndNft2, "newItem");
            if (vx2.m53586b(roomCollectionAndNft.getCollection().getName(), roomCollectionAndNft2.getCollection().getName()) && vx2.m53586b(roomCollectionAndNft.getCollection().getImageUrl(), roomCollectionAndNft2.getCollection().getImageUrl()) && roomCollectionAndNft.getCollection().getOrder() == roomCollectionAndNft2.getCollection().getOrder() && roomCollectionAndNft.getShowHideIcon() == roomCollectionAndNft2.getShowHideIcon()) {
                RoomNFT roomNFT = (RoomNFT) CollectionsKt___CollectionsKt.m47331b0(roomCollectionAndNft.getNfts());
                String str2 = null;
                if (roomNFT != null) {
                    str = roomNFT.getImage_preview_url();
                } else {
                    str = null;
                }
                RoomNFT roomNFT2 = (RoomNFT) CollectionsKt___CollectionsKt.m47331b0(roomCollectionAndNft2.getNfts());
                if (roomNFT2 != null) {
                    str2 = roomNFT2.getImage_preview_url();
                }
                if (vx2.m53586b(str, str2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean areItemsTheSame(RoomCollectionAndNft roomCollectionAndNft, RoomCollectionAndNft roomCollectionAndNft2) {
            vx2.m53591g(roomCollectionAndNft, "oldItem");
            vx2.m53591g(roomCollectionAndNft2, "newItem");
            return vx2.m53586b(roomCollectionAndNft.getCollection().getId(), roomCollectionAndNft2.getCollection().getId());
        }
    }
}
