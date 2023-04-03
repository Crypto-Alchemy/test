package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.contact.abstraction.IContact;
import net.safemoon.androidwallet.model.nft.NFTData;
import org.web3j.abi.datatypes.Address;

/* renamed from: fv5 */
/* compiled from: SendToNftFragmentDirections */
public class fv5 {

    /* renamed from: fv5$a */
    /* compiled from: SendToNftFragmentDirections */
    public static class C7106a implements j44 {

        /* renamed from: a */
        public final HashMap f37919a;

        public C7106a(String str, NFTData nFTData, IContact iContact) {
            HashMap hashMap = new HashMap();
            this.f37919a = hashMap;
            if (str != null) {
                hashMap.put(Address.TYPE_NAME, str);
                if (nFTData != null) {
                    hashMap.put("nftData", nFTData);
                    hashMap.put("iContact", iContact);
                    return;
                }
                throw new IllegalArgumentException("Argument \"nftData\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_nft_transfer;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f37919a.containsKey(Address.TYPE_NAME)) {
                bundle.putString(Address.TYPE_NAME, (String) this.f37919a.get(Address.TYPE_NAME));
            }
            if (this.f37919a.containsKey("nftData")) {
                NFTData nFTData = (NFTData) this.f37919a.get("nftData");
                if (Parcelable.class.isAssignableFrom(NFTData.class) || nFTData == null) {
                    bundle.putParcelable("nftData", Parcelable.class.cast(nFTData));
                } else if (Serializable.class.isAssignableFrom(NFTData.class)) {
                    bundle.putSerializable("nftData", Serializable.class.cast(nFTData));
                } else {
                    throw new UnsupportedOperationException(NFTData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            if (this.f37919a.containsKey("iContact")) {
                IContact iContact = (IContact) this.f37919a.get("iContact");
                if (Parcelable.class.isAssignableFrom(IContact.class) || iContact == null) {
                    bundle.putParcelable("iContact", Parcelable.class.cast(iContact));
                } else if (Serializable.class.isAssignableFrom(IContact.class)) {
                    bundle.putSerializable("iContact", Serializable.class.cast(iContact));
                } else {
                    throw new UnsupportedOperationException(IContact.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public String mo51801c() {
            return (String) this.f37919a.get(Address.TYPE_NAME);
        }

        /* renamed from: d */
        public IContact mo51802d() {
            return (IContact) this.f37919a.get("iContact");
        }

        /* renamed from: e */
        public NFTData mo51803e() {
            return (NFTData) this.f37919a.get("nftData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7106a aVar = (C7106a) obj;
            if (this.f37919a.containsKey(Address.TYPE_NAME) != aVar.f37919a.containsKey(Address.TYPE_NAME)) {
                return false;
            }
            if (mo51801c() == null ? aVar.mo51801c() != null : !mo51801c().equals(aVar.mo51801c())) {
                return false;
            }
            if (this.f37919a.containsKey("nftData") != aVar.f37919a.containsKey("nftData")) {
                return false;
            }
            if (mo51803e() == null ? aVar.mo51803e() != null : !mo51803e().equals(aVar.mo51803e())) {
                return false;
            }
            if (this.f37919a.containsKey("iContact") != aVar.f37919a.containsKey("iContact")) {
                return false;
            }
            if (mo51802d() == null ? aVar.mo51802d() != null : !mo51802d().equals(aVar.mo51802d())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (mo51801c() != null) {
                i = mo51801c().hashCode();
            } else {
                i = 0;
            }
            int i4 = (i + 31) * 31;
            if (mo51803e() != null) {
                i2 = mo51803e().hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (mo51802d() != null) {
                i3 = mo51802d().hashCode();
            }
            return ((i5 + i3) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNftTransfer(actionId=" + mo21068a() + "){address=" + mo51801c() + ", nftData=" + mo51803e() + ", iContact=" + mo51802d() + "}";
        }
    }

    /* renamed from: a */
    public static C7106a m57932a(String str, NFTData nFTData, IContact iContact) {
        return new C7106a(str, nFTData, iContact);
    }

    /* renamed from: b */
    public static j44 m57933b() {
        return new C2456h9(R.id.action_sendtoNFTFragment_to_manageContactsFragment);
    }
}
