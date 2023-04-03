package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.nft.NFTData;

/* renamed from: f74 */
/* compiled from: NftDetailFragmentDirections */
public class f74 {

    /* renamed from: f74$a */
    /* compiled from: NftDetailFragmentDirections */
    public static class C7070a implements j44 {

        /* renamed from: a */
        public final HashMap f37733a;

        public C7070a(NFTData nFTData) {
            HashMap hashMap = new HashMap();
            this.f37733a = hashMap;
            if (nFTData != null) {
                hashMap.put("nftData", nFTData);
                return;
            }
            throw new IllegalArgumentException("Argument \"nftData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_nft_detail_to_sendto;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f37733a.containsKey("nftData")) {
                NFTData nFTData = (NFTData) this.f37733a.get("nftData");
                if (Parcelable.class.isAssignableFrom(NFTData.class) || nFTData == null) {
                    bundle.putParcelable("nftData", Parcelable.class.cast(nFTData));
                } else if (Serializable.class.isAssignableFrom(NFTData.class)) {
                    bundle.putSerializable("nftData", Serializable.class.cast(nFTData));
                } else {
                    throw new UnsupportedOperationException(NFTData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public NFTData mo51609c() {
            return (NFTData) this.f37733a.get("nftData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7070a aVar = (C7070a) obj;
            if (this.f37733a.containsKey("nftData") != aVar.f37733a.containsKey("nftData")) {
                return false;
            }
            if (mo51609c() == null ? aVar.mo51609c() != null : !mo51609c().equals(aVar.mo51609c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo51609c() != null) {
                i = mo51609c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNftDetailToSendto(actionId=" + mo21068a() + "){nftData=" + mo51609c() + "}";
        }
    }

    /* renamed from: a */
    public static C7070a m57631a(NFTData nFTData) {
        return new C7070a(nFTData);
    }
}
