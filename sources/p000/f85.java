package p000;

import android.os.Bundle;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import org.web3j.abi.datatypes.Address;

/* renamed from: f85 */
/* compiled from: ReceiveFragmentDirections */
public class f85 {

    /* renamed from: f85$a */
    /* compiled from: ReceiveFragmentDirections */
    public static class C7071a implements j44 {

        /* renamed from: a */
        public final HashMap f37734a;

        public C7071a(int i, String str) {
            HashMap hashMap = new HashMap();
            this.f37734a = hashMap;
            hashMap.put("tokenChainId", Integer.valueOf(i));
            if (str != null) {
                hashMap.put(Address.TYPE_NAME, str);
                return;
            }
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_ReceiveFragment_to_qrFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f37734a.containsKey("tokenChainId")) {
                bundle.putInt("tokenChainId", ((Integer) this.f37734a.get("tokenChainId")).intValue());
            }
            if (this.f37734a.containsKey(Address.TYPE_NAME)) {
                bundle.putString(Address.TYPE_NAME, (String) this.f37734a.get(Address.TYPE_NAME));
            }
            return bundle;
        }

        /* renamed from: c */
        public String mo51614c() {
            return (String) this.f37734a.get(Address.TYPE_NAME);
        }

        /* renamed from: d */
        public int mo51615d() {
            return ((Integer) this.f37734a.get("tokenChainId")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7071a aVar = (C7071a) obj;
            if (this.f37734a.containsKey("tokenChainId") != aVar.f37734a.containsKey("tokenChainId") || mo51615d() != aVar.mo51615d() || this.f37734a.containsKey(Address.TYPE_NAME) != aVar.f37734a.containsKey(Address.TYPE_NAME)) {
                return false;
            }
            if (mo51614c() == null ? aVar.mo51614c() != null : !mo51614c().equals(aVar.mo51614c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int d = (mo51615d() + 31) * 31;
            if (mo51614c() != null) {
                i = mo51614c().hashCode();
            } else {
                i = 0;
            }
            return ((d + i) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionReceiveFragmentToQrFragment(actionId=" + mo21068a() + "){tokenChainId=" + mo51615d() + ", address=" + mo51614c() + "}";
        }
    }

    /* renamed from: a */
    public static C7071a m57636a(int i, String str) {
        return new C7071a(i, str);
    }
}
