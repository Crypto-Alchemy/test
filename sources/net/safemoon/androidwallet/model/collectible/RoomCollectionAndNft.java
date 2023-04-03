package net.safemoon.androidwallet.model.collectible;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/RoomCollectionAndNft;", "", "collection", "Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "nfts", "", "Lnet/safemoon/androidwallet/model/collectible/RoomNFT;", "(Lnet/safemoon/androidwallet/model/collectible/RoomCollection;Ljava/util/List;)V", "getCollection", "()Lnet/safemoon/androidwallet/model/collectible/RoomCollection;", "getNfts", "()Ljava/util/List;", "showHideIcon", "", "getShowHideIcon", "()Z", "setShowHideIcon", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: RoomCollectionAndNft.kt */
public final class RoomCollectionAndNft {
    private final RoomCollection collection;
    private final List<RoomNFT> nfts;
    private boolean showHideIcon;

    public RoomCollectionAndNft(RoomCollection roomCollection, List<RoomNFT> list) {
        vx2.m53591g(roomCollection, "collection");
        vx2.m53591g(list, "nfts");
        this.collection = roomCollection;
        this.nfts = list;
    }

    public static /* synthetic */ RoomCollectionAndNft copy$default(RoomCollectionAndNft roomCollectionAndNft, RoomCollection roomCollection, List<RoomNFT> list, int i, Object obj) {
        if ((i & 1) != 0) {
            roomCollection = roomCollectionAndNft.collection;
        }
        if ((i & 2) != 0) {
            list = roomCollectionAndNft.nfts;
        }
        return roomCollectionAndNft.copy(roomCollection, list);
    }

    public final RoomCollection component1() {
        return this.collection;
    }

    public final List<RoomNFT> component2() {
        return this.nfts;
    }

    public final RoomCollectionAndNft copy(RoomCollection roomCollection, List<RoomNFT> list) {
        vx2.m53591g(roomCollection, "collection");
        vx2.m53591g(list, "nfts");
        return new RoomCollectionAndNft(roomCollection, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomCollectionAndNft)) {
            return false;
        }
        RoomCollectionAndNft roomCollectionAndNft = (RoomCollectionAndNft) obj;
        return vx2.m53586b(this.collection, roomCollectionAndNft.collection) && vx2.m53586b(this.nfts, roomCollectionAndNft.nfts);
    }

    public final RoomCollection getCollection() {
        return this.collection;
    }

    public final List<RoomNFT> getNfts() {
        return this.nfts;
    }

    public final boolean getShowHideIcon() {
        return this.showHideIcon;
    }

    public int hashCode() {
        return (this.collection.hashCode() * 31) + this.nfts.hashCode();
    }

    public final void setShowHideIcon(boolean z) {
        this.showHideIcon = z;
    }

    public String toString() {
        RoomCollection roomCollection = this.collection;
        List<RoomNFT> list = this.nfts;
        return "RoomCollectionAndNft(collection=" + roomCollection + ", nfts=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomCollectionAndNft(RoomCollection roomCollection, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(roomCollection, (i & 2) != 0 ? ck0.m33062j() : list);
    }
}
