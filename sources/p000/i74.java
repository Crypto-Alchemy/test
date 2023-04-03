package p000;

import androidx.recyclerview.widget.C1294g;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0007\n\u0002\b\u0005*\u0001\u0000\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, mo44877d2 = {"i74$a", "a", "Li74$a;", "DIFF_CALL_BACK", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: i74 */
/* compiled from: NftsAdapter.kt */
public final class i74 {

    /* renamed from: a */
    public static final C7209a f38337a = new C7209a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo44877d2 = {"i74$a", "Landroidx/recyclerview/widget/g$f;", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "oldItem", "newItem", "", "b", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: i74$a */
    /* compiled from: NftsAdapter.kt */
    public static final class C7209a extends C1294g.C1300f<RoomNFT> {
        /* renamed from: a */
        public boolean areContentsTheSame(RoomNFT roomNFT, RoomNFT roomNFT2) {
            vx2.m53591g(roomNFT, "oldItem");
            vx2.m53591g(roomNFT2, "newItem");
            if (!vx2.m53586b(roomNFT.getName(), roomNFT2.getName()) || !vx2.m53586b(roomNFT.getImage_preview_url(), roomNFT2.getImage_preview_url()) || roomNFT.getOrder() != roomNFT2.getOrder()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public boolean areItemsTheSame(RoomNFT roomNFT, RoomNFT roomNFT2) {
            vx2.m53591g(roomNFT, "oldItem");
            vx2.m53591g(roomNFT2, "newItem");
            return vx2.m53586b(roomNFT.getToken_id(), roomNFT2.getToken_id());
        }
    }
}
