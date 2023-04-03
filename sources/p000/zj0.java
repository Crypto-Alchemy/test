package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.RoomCollection;
import net.safemoon.androidwallet.model.collectible.RoomNFT;

/* renamed from: zj0 */
/* compiled from: CollectionsFragmentDirections */
public class zj0 {

    /* renamed from: zj0$a */
    /* compiled from: CollectionsFragmentDirections */
    public static class C9678a implements j44 {

        /* renamed from: a */
        public final HashMap f46399a;

        public C9678a(RoomCollection roomCollection, RoomNFT roomNFT) {
            HashMap hashMap = new HashMap();
            this.f46399a = hashMap;
            if (roomCollection != null) {
                hashMap.put("collection", roomCollection);
                if (roomNFT != null) {
                    hashMap.put("nftData", roomNFT);
                    return;
                }
                throw new IllegalArgumentException("Argument \"nftData\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"collection\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_collectibles_to_nftDetailFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f46399a.containsKey("collection")) {
                RoomCollection roomCollection = (RoomCollection) this.f46399a.get("collection");
                if (Parcelable.class.isAssignableFrom(RoomCollection.class) || roomCollection == null) {
                    bundle.putParcelable("collection", Parcelable.class.cast(roomCollection));
                } else if (Serializable.class.isAssignableFrom(RoomCollection.class)) {
                    bundle.putSerializable("collection", Serializable.class.cast(roomCollection));
                } else {
                    throw new UnsupportedOperationException(RoomCollection.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            if (this.f46399a.containsKey("nftData")) {
                RoomNFT roomNFT = (RoomNFT) this.f46399a.get("nftData");
                if (Parcelable.class.isAssignableFrom(RoomNFT.class) || roomNFT == null) {
                    bundle.putParcelable("nftData", Parcelable.class.cast(roomNFT));
                } else if (Serializable.class.isAssignableFrom(RoomNFT.class)) {
                    bundle.putSerializable("nftData", Serializable.class.cast(roomNFT));
                } else {
                    throw new UnsupportedOperationException(RoomNFT.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public RoomCollection mo67319c() {
            return (RoomCollection) this.f46399a.get("collection");
        }

        /* renamed from: d */
        public RoomNFT mo67320d() {
            return (RoomNFT) this.f46399a.get("nftData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9678a aVar = (C9678a) obj;
            if (this.f46399a.containsKey("collection") != aVar.f46399a.containsKey("collection")) {
                return false;
            }
            if (mo67319c() == null ? aVar.mo67319c() != null : !mo67319c().equals(aVar.mo67319c())) {
                return false;
            }
            if (this.f46399a.containsKey("nftData") != aVar.f46399a.containsKey("nftData")) {
                return false;
            }
            if (mo67320d() == null ? aVar.mo67320d() != null : !mo67320d().equals(aVar.mo67320d())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            if (mo67319c() != null) {
                i = mo67319c().hashCode();
            } else {
                i = 0;
            }
            int i3 = (i + 31) * 31;
            if (mo67320d() != null) {
                i2 = mo67320d().hashCode();
            }
            return ((i3 + i2) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationCollectiblesToNftDetailFragment(actionId=" + mo21068a() + "){collection=" + mo67319c() + ", nftData=" + mo67320d() + "}";
        }
    }

    /* renamed from: a */
    public static C9678a m75001a(RoomCollection roomCollection, RoomNFT roomNFT) {
        return new C9678a(roomCollection, roomNFT);
    }
}
