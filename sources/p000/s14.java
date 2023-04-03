package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: s14 */
/* compiled from: MyTokensListFragmentDirections */
public class s14 {

    /* renamed from: s14$a */
    /* compiled from: MyTokensListFragmentDirections */
    public static class C9296a implements j44 {

        /* renamed from: a */
        public final HashMap f44513a;

        public C9296a(UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f44513a = hashMap;
            if (userTokenItemDisplayModel != null) {
                hashMap.put("userTokenData", userTokenItemDisplayModel);
                return;
            }
            throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_myTokensListFragment_to_transferHistoryFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44513a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f44513a.get("userTokenData");
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
        public UserTokenItemDisplayModel mo65792c() {
            return (UserTokenItemDisplayModel) this.f44513a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9296a aVar = (C9296a) obj;
            if (this.f44513a.containsKey("userTokenData") != aVar.f44513a.containsKey("userTokenData")) {
                return false;
            }
            if (mo65792c() == null ? aVar.mo65792c() != null : !mo65792c().equals(aVar.mo65792c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65792c() != null) {
                i = mo65792c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionMyTokensListFragmentToTransferHistoryFragment(actionId=" + mo21068a() + "){userTokenData=" + mo65792c() + "}";
        }
    }

    /* renamed from: a */
    public static j44 m71751a() {
        return new C2456h9(R.id.action_myTokensListFragment_to_addNewTokenFragment);
    }

    /* renamed from: b */
    public static j44 m71752b() {
        return new C2456h9(R.id.action_myTokensListFragment_to_ReceiveFragment);
    }

    /* renamed from: c */
    public static j44 m71753c() {
        return new C2456h9(R.id.action_myTokensListFragment_to_sendFragment);
    }

    /* renamed from: d */
    public static C9296a m71754d(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C9296a(userTokenItemDisplayModel);
    }

    /* renamed from: e */
    public static j44 m71755e() {
        return new C2456h9(R.id.action_navigation_my_tokens_to_notificationHistoryFragment);
    }
}
