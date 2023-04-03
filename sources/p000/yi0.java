package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.collectible.RoomCollection;

/* renamed from: yi0 */
/* compiled from: CollectibleFragmentDirections */
public class yi0 {

    /* renamed from: yi0$a */
    /* compiled from: CollectibleFragmentDirections */
    public static class C9640a implements j44 {

        /* renamed from: a */
        public final HashMap f46212a;

        public C9640a(RoomCollection roomCollection) {
            HashMap hashMap = new HashMap();
            this.f46212a = hashMap;
            if (roomCollection != null) {
                hashMap.put("collection", roomCollection);
                return;
            }
            throw new IllegalArgumentException("Argument \"collection\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_collectibles_to_collectionFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f46212a.containsKey("collection")) {
                RoomCollection roomCollection = (RoomCollection) this.f46212a.get("collection");
                if (Parcelable.class.isAssignableFrom(RoomCollection.class) || roomCollection == null) {
                    bundle.putParcelable("collection", Parcelable.class.cast(roomCollection));
                } else if (Serializable.class.isAssignableFrom(RoomCollection.class)) {
                    bundle.putSerializable("collection", Serializable.class.cast(roomCollection));
                } else {
                    throw new UnsupportedOperationException(RoomCollection.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public RoomCollection mo67120c() {
            return (RoomCollection) this.f46212a.get("collection");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9640a aVar = (C9640a) obj;
            if (this.f46212a.containsKey("collection") != aVar.f46212a.containsKey("collection")) {
                return false;
            }
            if (mo67120c() == null ? aVar.mo67120c() != null : !mo67120c().equals(aVar.mo67120c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo67120c() != null) {
                i = mo67120c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationCollectiblesToCollectionFragment(actionId=" + mo21068a() + "){collection=" + mo67120c() + "}";
        }
    }

    /* renamed from: a */
    public static C9640a m74449a(RoomCollection roomCollection) {
        return new C9640a(roomCollection);
    }
}
