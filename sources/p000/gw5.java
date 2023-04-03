package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.p020ui.displayModel.UserTokenItemDisplayModel;

/* renamed from: gw5 */
/* compiled from: SendtoFragmentDirections */
public class gw5 {

    /* renamed from: gw5$a */
    /* compiled from: SendtoFragmentDirections */
    public static class C7147a implements j44 {

        /* renamed from: a */
        public final HashMap f38085a;

        public C7147a(String str, String str2, UserTokenItemDisplayModel userTokenItemDisplayModel) {
            HashMap hashMap = new HashMap();
            this.f38085a = hashMap;
            if (str != null) {
                hashMap.put("etAddress", str);
                if (str2 != null) {
                    hashMap.put("balance", str2);
                    if (userTokenItemDisplayModel != null) {
                        hashMap.put("userTokenData", userTokenItemDisplayModel);
                        return;
                    }
                    throw new IllegalArgumentException("Argument \"userTokenData\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Argument \"balance\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Argument \"etAddress\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_sendtoFragment_to_sendingFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f38085a.containsKey("etAddress")) {
                bundle.putString("etAddress", (String) this.f38085a.get("etAddress"));
            }
            if (this.f38085a.containsKey("balance")) {
                bundle.putString("balance", (String) this.f38085a.get("balance"));
            }
            if (this.f38085a.containsKey("userTokenData")) {
                UserTokenItemDisplayModel userTokenItemDisplayModel = (UserTokenItemDisplayModel) this.f38085a.get("userTokenData");
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
        public String mo52033c() {
            return (String) this.f38085a.get("balance");
        }

        /* renamed from: d */
        public String mo52034d() {
            return (String) this.f38085a.get("etAddress");
        }

        /* renamed from: e */
        public UserTokenItemDisplayModel mo52035e() {
            return (UserTokenItemDisplayModel) this.f38085a.get("userTokenData");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7147a aVar = (C7147a) obj;
            if (this.f38085a.containsKey("etAddress") != aVar.f38085a.containsKey("etAddress")) {
                return false;
            }
            if (mo52034d() == null ? aVar.mo52034d() != null : !mo52034d().equals(aVar.mo52034d())) {
                return false;
            }
            if (this.f38085a.containsKey("balance") != aVar.f38085a.containsKey("balance")) {
                return false;
            }
            if (mo52033c() == null ? aVar.mo52033c() != null : !mo52033c().equals(aVar.mo52033c())) {
                return false;
            }
            if (this.f38085a.containsKey("userTokenData") != aVar.f38085a.containsKey("userTokenData")) {
                return false;
            }
            if (mo52035e() == null ? aVar.mo52035e() != null : !mo52035e().equals(aVar.mo52035e())) {
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
            if (mo52034d() != null) {
                i = mo52034d().hashCode();
            } else {
                i = 0;
            }
            int i4 = (i + 31) * 31;
            if (mo52033c() != null) {
                i2 = mo52033c().hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (mo52035e() != null) {
                i3 = mo52035e().hashCode();
            }
            return ((i5 + i3) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionSendtoFragmentToSendingFragment(actionId=" + mo21068a() + "){etAddress=" + mo52034d() + ", balance=" + mo52033c() + ", userTokenData=" + mo52035e() + "}";
        }
    }

    /* renamed from: a */
    public static j44 m58274a() {
        return new C2456h9(R.id.action_sendtoFragment_to_manageContactsFragment);
    }

    /* renamed from: b */
    public static C7147a m58275b(String str, String str2, UserTokenItemDisplayModel userTokenItemDisplayModel) {
        return new C7147a(str, str2, userTokenItemDisplayModel);
    }
}
