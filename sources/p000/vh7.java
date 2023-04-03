package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: vh7 */
/* compiled from: WalletFragmentDirections */
public class vh7 {

    /* renamed from: vh7$a */
    /* compiled from: WalletFragmentDirections */
    public static class C9457a implements j44 {

        /* renamed from: a */
        public final HashMap f45307a;

        public C9457a(boolean z) {
            HashMap hashMap = new HashMap();
            this.f45307a = hashMap;
            hashMap.put("isBuy", Boolean.valueOf(z));
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_wallet_to_tokenListFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f45307a.containsKey("isBuy")) {
                bundle.putBoolean("isBuy", ((Boolean) this.f45307a.get("isBuy")).booleanValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public boolean mo66515c() {
            return ((Boolean) this.f45307a.get("isBuy")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9457a aVar = (C9457a) obj;
            if (this.f45307a.containsKey("isBuy") == aVar.f45307a.containsKey("isBuy") && mo66515c() == aVar.mo66515c() && mo21068a() == aVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((mo66515c() ? 1 : 0) + true) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationWalletToTokenListFragment(actionId=" + mo21068a() + "){isBuy=" + mo66515c() + "}";
        }
    }

    /* renamed from: vh7$b */
    /* compiled from: WalletFragmentDirections */
    public static class C9458b implements j44 {

        /* renamed from: a */
        public final HashMap f45308a;

        public C9458b(UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f45308a = hashMap;
            if (userTokenItemDisplayModel != null) {
                hashMap.put("userTokenData", userTokenItemDisplayModel);
                return;
            }
            throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_wallet_to_transferHistoryFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f45308a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f45308a.get("userTokenData");
                if (Parcelable.class.isAssignableFrom(UserTokenItemDisplayModel.class) || userTokenItemDisplayModel == null) {
                    bundle.putParcelable("userTokenData", Parcelable.class.cast(userTokenItemDisplayModel));
                } else if (Serializable.class.isAssignableFrom(UserTokenItemDisplayModel.class)) {
                    bundle.putSerializable("userTokenData", Serializable.class.cast(userTokenItemDisplayModel));
                } else {
                    throw new UnsupportedOperationException(UserTokenItemDisplayModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public UserTokenItemDisplayModel mo66519c() {
            return (UserTokenItemDisplayModel) this.f45308a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9458b bVar = (C9458b) obj;
            if (this.f45308a.containsKey("userTokenData") != bVar.f45308a.containsKey("userTokenData")) {
                return false;
            }
            if (mo66519c() == null ? bVar.mo66519c() != null : !mo66519c().equals(bVar.mo66519c())) {
                return false;
            }
            if (mo21068a() != bVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo66519c() != null) {
                i = mo66519c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationWalletToTransferHistoryFragment(actionId=" + mo21068a() + "){userTokenData=" + mo66519c() + "}";
        }
    }

    /* renamed from: vh7$c */
    /* compiled from: WalletFragmentDirections */
    public static class C9459c implements j44 {

        /* renamed from: a */
        public final HashMap f45309a;

        public C9459c(String str, boolean z) {
            HashMap hashMap = new HashMap();
            this.f45309a = hashMap;
            if (str != null) {
                hashMap.put("transactionHash", str);
                hashMap.put("isNewTransaction", Boolean.valueOf(z));
                return;
            }
            throw new IllegalArgumentException("Argument \"transactionHash\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_wallet_to_transferNotificationDetailsFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f45309a.containsKey("transactionHash")) {
                bundle.putString("transactionHash", (String) this.f45309a.get("transactionHash"));
            }
            if (this.f45309a.containsKey("isNewTransaction")) {
                bundle.putBoolean("isNewTransaction", ((Boolean) this.f45309a.get("isNewTransaction")).booleanValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public boolean mo66523c() {
            return ((Boolean) this.f45309a.get("isNewTransaction")).booleanValue();
        }

        /* renamed from: d */
        public String mo66524d() {
            return (String) this.f45309a.get("transactionHash");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9459c cVar = (C9459c) obj;
            if (this.f45309a.containsKey("transactionHash") != cVar.f45309a.containsKey("transactionHash")) {
                return false;
            }
            if (mo66524d() == null ? cVar.mo66524d() != null : !mo66524d().equals(cVar.mo66524d())) {
                return false;
            }
            if (this.f45309a.containsKey("isNewTransaction") == cVar.f45309a.containsKey("isNewTransaction") && mo66523c() == cVar.mo66523c() && mo21068a() == cVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (mo66524d() != null) {
                i = mo66524d().hashCode();
            } else {
                i = 0;
            }
            return ((((i + 31) * 31) + (mo66523c() ? 1 : 0)) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationWalletToTransferNotificationDetailsFragment(actionId=" + mo21068a() + "){transactionHash=" + mo66524d() + ", isNewTransaction=" + mo66523c() + "}";
        }
    }

    /* renamed from: a */
    public static j44 m73240a() {
        return new C2456h9(R.id.action_navigation_wallet_to_allTokensListFragment);
    }

    /* renamed from: b */
    public static j44 m73241b() {
        return new C2456h9(R.id.action_navigation_wallet_to_myTokensListFragment);
    }

    /* renamed from: c */
    public static j44 m73242c() {
        return new C2456h9(R.id.action_navigation_wallet_to_notificationHistoryFragment);
    }

    /* renamed from: d */
    public static j44 m73243d() {
        return new C2456h9(R.id.action_navigation_wallet_to_ReceiveFragment);
    }

    /* renamed from: e */
    public static j44 m73244e() {
        return new C2456h9(R.id.action_navigation_wallet_to_sendFragment);
    }

    /* renamed from: f */
    public static j44 m73245f() {
        return fw3.m44435a();
    }

    /* renamed from: g */
    public static C9457a m73246g(boolean z) {
        return new C9457a(z);
    }

    /* renamed from: h */
    public static C9458b m73247h(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C9458b(userTokenItemDisplayModel);
    }

    /* renamed from: i */
    public static C9459c m73248i(String str, boolean z) {
        return new C9459c(str, z);
    }

    /* renamed from: j */
    public static j44 m73249j() {
        return fw3.m44436b();
    }
}
