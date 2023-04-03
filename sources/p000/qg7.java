package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.walletConnect.RoomConnectedInfo;

/* renamed from: qg7 */
/* compiled from: WalletConnectFragmentDirections */
public class qg7 {

    /* renamed from: qg7$a */
    /* compiled from: WalletConnectFragmentDirections */
    public static class C9214a implements j44 {

        /* renamed from: a */
        public final HashMap f44190a;

        public C9214a(RoomConnectedInfo roomConnectedInfo) {
            HashMap hashMap = new HashMap();
            this.f44190a = hashMap;
            if (roomConnectedInfo != null) {
                hashMap.put("roomConnectedInfo", roomConnectedInfo);
                return;
            }
            throw new IllegalArgumentException("Argument \"roomConnectedInfo\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_to_walletConnectDetailFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44190a.containsKey("roomConnectedInfo")) {
                RoomConnectedInfo roomConnectedInfo = (RoomConnectedInfo) this.f44190a.get("roomConnectedInfo");
                if (Parcelable.class.isAssignableFrom(RoomConnectedInfo.class) || roomConnectedInfo == null) {
                    bundle.putParcelable("roomConnectedInfo", Parcelable.class.cast(roomConnectedInfo));
                } else if (Serializable.class.isAssignableFrom(RoomConnectedInfo.class)) {
                    bundle.putSerializable("roomConnectedInfo", Serializable.class.cast(roomConnectedInfo));
                } else {
                    throw new UnsupportedOperationException(RoomConnectedInfo.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public RoomConnectedInfo mo65464c() {
            return (RoomConnectedInfo) this.f44190a.get("roomConnectedInfo");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9214a aVar = (C9214a) obj;
            if (this.f44190a.containsKey("roomConnectedInfo") != aVar.f44190a.containsKey("roomConnectedInfo")) {
                return false;
            }
            if (mo65464c() == null ? aVar.mo65464c() != null : !mo65464c().equals(aVar.mo65464c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65464c() != null) {
                i = mo65464c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionToWalletConnectDetailFragment(actionId=" + mo21068a() + "){roomConnectedInfo=" + mo65464c() + "}";
        }
    }

    /* renamed from: a */
    public static C9214a m71260a(RoomConnectedInfo roomConnectedInfo) {
        return new C9214a(roomConnectedInfo);
    }
}
