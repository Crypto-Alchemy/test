package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: qu5 */
/* compiled from: SendFragmentDirections */
public class qu5 {

    /* renamed from: qu5$a */
    /* compiled from: SendFragmentDirections */
    public static class C9221a implements j44 {

        /* renamed from: a */
        public final HashMap f44245a;

        public C9221a(UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f44245a = hashMap;
            if (userTokenItemDisplayModel != null) {
                hashMap.put("userTokenData", userTokenItemDisplayModel);
                return;
            }
            throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_sendFragment_to_sendtoFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44245a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f44245a.get("userTokenData");
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
        public UserTokenItemDisplayModel mo65530c() {
            return (UserTokenItemDisplayModel) this.f44245a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9221a aVar = (C9221a) obj;
            if (this.f44245a.containsKey("userTokenData") != aVar.f44245a.containsKey("userTokenData")) {
                return false;
            }
            if (mo65530c() == null ? aVar.mo65530c() != null : !mo65530c().equals(aVar.mo65530c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65530c() != null) {
                i = mo65530c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionSendFragmentToSendtoFragment(actionId=" + mo21068a() + "){userTokenData=" + mo65530c() + "}";
        }
    }

    /* renamed from: a */
    public static C9221a m71356a(UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C9221a(userTokenItemDisplayModel);
    }
}
