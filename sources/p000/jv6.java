package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;
import org.web3j.abi.datatypes.Address;

/* renamed from: jv6 */
/* compiled from: TransferHistoryFragmentDirections */
public class jv6 {

    /* renamed from: jv6$a */
    /* compiled from: TransferHistoryFragmentDirections */
    public static class C7313a implements j44 {

        /* renamed from: a */
        public final HashMap f38801a;

        public C7313a(PAToken pAToken) {
            HashMap hashMap = new HashMap();
            this.f38801a = hashMap;
            if (pAToken != null) {
                hashMap.put("token", pAToken);
                return;
            }
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_transferHistoryFragment_to_cryptoPriceAlertFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38801a.containsKey("token")) {
                PAToken pAToken = (PAToken) this.f38801a.get("token");
                if (Parcelable.class.isAssignableFrom(PAToken.class) || pAToken == null) {
                    bundle.putParcelable("token", Parcelable.class.cast(pAToken));
                } else if (Serializable.class.isAssignableFrom(PAToken.class)) {
                    bundle.putSerializable("token", Serializable.class.cast(pAToken));
                } else {
                    throw new UnsupportedOperationException(PAToken.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            return bundle;
        }

        /* renamed from: c */
        public PAToken mo52794c() {
            return (PAToken) this.f38801a.get("token");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7313a aVar = (C7313a) obj;
            if (this.f38801a.containsKey("token") != aVar.f38801a.containsKey("token")) {
                return false;
            }
            if (mo52794c() == null ? aVar.mo52794c() != null : !mo52794c().equals(aVar.mo52794c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo52794c() != null) {
                i = mo52794c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionTransferHistoryFragmentToCryptoPriceAlertFragment(actionId=" + mo21068a() + "){token=" + mo52794c() + "}";
        }
    }

    /* renamed from: jv6$b */
    /* compiled from: TransferHistoryFragmentDirections */
    public static class C7314b implements j44 {

        /* renamed from: a */
        public final HashMap f38802a;

        public C7314b(UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f38802a = hashMap;
            if (userTokenItemDisplayModel != null) {
                hashMap.put("userTokenData", userTokenItemDisplayModel);
                return;
            }
            throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_transferHistoryFragment_to_navigation_swap;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38802a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f38802a.get("userTokenData");
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
        public UserTokenItemDisplayModel mo52798c() {
            return (UserTokenItemDisplayModel) this.f38802a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7314b bVar = (C7314b) obj;
            if (this.f38802a.containsKey("userTokenData") != bVar.f38802a.containsKey("userTokenData")) {
                return false;
            }
            if (mo52798c() == null ? bVar.mo52798c() != null : !mo52798c().equals(bVar.mo52798c())) {
                return false;
            }
            if (mo21068a() != bVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo52798c() != null) {
                i = mo52798c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionTransferHistoryFragmentToNavigationSwap(actionId=" + mo21068a() + "){userTokenData=" + mo52798c() + "}";
        }
    }

    /* renamed from: jv6$c */
    /* compiled from: TransferHistoryFragmentDirections */
    public static class C7315c implements j44 {

        /* renamed from: a */
        public final HashMap f38803a;

        public C7315c(int i, String str) {
            HashMap hashMap = new HashMap();
            this.f38803a = hashMap;
            hashMap.put("tokenChainId", Integer.valueOf(i));
            if (str != null) {
                hashMap.put(Address.TYPE_NAME, str);
                return;
            }
            throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_transferHistoryFragment_to_qrFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38803a.containsKey("tokenChainId")) {
                bundle.putInt("tokenChainId", ((Integer) this.f38803a.get("tokenChainId")).intValue());
            }
            if (this.f38803a.containsKey(Address.TYPE_NAME)) {
                bundle.putString(Address.TYPE_NAME, (String) this.f38803a.get(Address.TYPE_NAME));
            }
            return bundle;
        }

        /* renamed from: c */
        public String mo52802c() {
            return (String) this.f38803a.get(Address.TYPE_NAME);
        }

        /* renamed from: d */
        public int mo52803d() {
            return ((Integer) this.f38803a.get("tokenChainId")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7315c cVar = (C7315c) obj;
            if (this.f38803a.containsKey("tokenChainId") != cVar.f38803a.containsKey("tokenChainId") || mo52803d() != cVar.mo52803d() || this.f38803a.containsKey(Address.TYPE_NAME) != cVar.f38803a.containsKey(Address.TYPE_NAME)) {
                return false;
            }
            if (mo52802c() == null ? cVar.mo52802c() != null : !mo52802c().equals(cVar.mo52802c())) {
                return false;
            }
            if (mo21068a() != cVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int d = (mo52803d() + 31) * 31;
            if (mo52802c() != null) {
                i = mo52802c().hashCode();
            } else {
                i = 0;
            }
            return ((d + i) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionTransferHistoryFragmentToQrFragment(actionId=" + mo21068a() + "){tokenChainId=" + mo52803d() + ", address=" + mo52802c() + "}";
        }
    }

    /* renamed from: jv6$d */
    /* compiled from: TransferHistoryFragmentDirections */
    public static class C7316d implements j44 {

        /* renamed from: a */
        public final HashMap f38804a;

        public C7316d(UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f38804a = hashMap;
            if (userTokenItemDisplayModel != null) {
                hashMap.put("userTokenData", userTokenItemDisplayModel);
                return;
            }
            throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_transferHistoryFragment_to_sendtoFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38804a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f38804a.get("userTokenData");
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
        public UserTokenItemDisplayModel mo52807c() {
            return (UserTokenItemDisplayModel) this.f38804a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7316d dVar = (C7316d) obj;
            if (this.f38804a.containsKey("userTokenData") != dVar.f38804a.containsKey("userTokenData")) {
                return false;
            }
            if (mo52807c() == null ? dVar.mo52807c() != null : !mo52807c().equals(dVar.mo52807c())) {
                return false;
            }
            if (mo21068a() != dVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo52807c() != null) {
                i = mo52807c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionTransferHistoryFragmentToSendtoFragment(actionId=" + mo21068a() + "){userTokenData=" + mo52807c() + "}";
        }
    }

    /* renamed from: jv6$e */
    /* compiled from: TransferHistoryFragmentDirections */
    public static class C7317e implements j44 {

        /* renamed from: a */
        public final HashMap f38805a;

        public C7317e(Result result, int i, boolean z) {
            HashMap hashMap = new HashMap();
            this.f38805a = hashMap;
            if (result != null) {
                hashMap.put("result", result);
                hashMap.put("tokenChainId", Integer.valueOf(i));
                hashMap.put("isNewTransaction", Boolean.valueOf(z));
                return;
            }
            throw new IllegalArgumentException("Argument \"result\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_transferHistoryFragment_to_transferDetailsFragmentStatus;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38805a.containsKey("result")) {
                Result result = (Result) this.f38805a.get("result");
                if (Parcelable.class.isAssignableFrom(Result.class) || result == null) {
                    bundle.putParcelable("result", Parcelable.class.cast(result));
                } else if (Serializable.class.isAssignableFrom(Result.class)) {
                    bundle.putSerializable("result", Serializable.class.cast(result));
                } else {
                    throw new UnsupportedOperationException(Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
            }
            if (this.f38805a.containsKey("tokenChainId")) {
                bundle.putInt("tokenChainId", ((Integer) this.f38805a.get("tokenChainId")).intValue());
            }
            if (this.f38805a.containsKey("isNewTransaction")) {
                bundle.putBoolean("isNewTransaction", ((Boolean) this.f38805a.get("isNewTransaction")).booleanValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public boolean mo52811c() {
            return ((Boolean) this.f38805a.get("isNewTransaction")).booleanValue();
        }

        /* renamed from: d */
        public Result mo52812d() {
            return (Result) this.f38805a.get("result");
        }

        /* renamed from: e */
        public int mo52813e() {
            return ((Integer) this.f38805a.get("tokenChainId")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7317e eVar = (C7317e) obj;
            if (this.f38805a.containsKey("result") != eVar.f38805a.containsKey("result")) {
                return false;
            }
            if (mo52812d() == null ? eVar.mo52812d() != null : !mo52812d().equals(eVar.mo52812d())) {
                return false;
            }
            if (this.f38805a.containsKey("tokenChainId") == eVar.f38805a.containsKey("tokenChainId") && mo52813e() == eVar.mo52813e() && this.f38805a.containsKey("isNewTransaction") == eVar.f38805a.containsKey("isNewTransaction") && mo52811c() == eVar.mo52811c() && mo21068a() == eVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (mo52812d() != null) {
                i = mo52812d().hashCode();
            } else {
                i = 0;
            }
            return ((((((i + 31) * 31) + mo52813e()) * 31) + (mo52811c() ? 1 : 0)) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionTransferHistoryFragmentToTransferDetailsFragmentStatus(actionId=" + mo21068a() + "){result=" + mo52812d() + ", tokenChainId=" + mo52813e() + ", isNewTransaction=" + mo52811c() + "}";
        }
    }

    /* renamed from: a */
    public static C7313a m59575a(PAToken pAToken) {
        return new C7313a(pAToken);
    }

    /* renamed from: b */
    public static C7314b m59576b(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C7314b(userTokenItemDisplayModel);
    }

    /* renamed from: c */
    public static C7315c m59577c(int i, String str) {
        return new C7315c(i, str);
    }

    /* renamed from: d */
    public static C7316d m59578d(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C7316d(userTokenItemDisplayModel);
    }

    /* renamed from: e */
    public static C7317e m59579e(Result result, int i, boolean z) {
        return new C7317e(result, i, z);
    }
}
