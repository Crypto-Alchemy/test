package p000;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

/* renamed from: qa4 */
/* compiled from: NotificationFragmentDirections */
public class qa4 {

    /* renamed from: qa4$a */
    /* compiled from: NotificationFragmentDirections */
    public static class C9206a implements j44 {

        /* renamed from: a */
        public final HashMap f44159a;

        public C9206a(PAToken pAToken) {
            HashMap hashMap = new HashMap();
            this.f44159a = hashMap;
            if (pAToken != null) {
                hashMap.put("token", pAToken);
                return;
            }
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_to_cryptoPriceAlertFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f44159a.containsKey("token")) {
                PAToken pAToken = (PAToken) this.f44159a.get("token");
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
        public PAToken mo65427c() {
            return (PAToken) this.f44159a.get("token");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9206a aVar = (C9206a) obj;
            if (this.f44159a.containsKey("token") != aVar.f44159a.containsKey("token")) {
                return false;
            }
            if (mo65427c() == null ? aVar.mo65427c() != null : !mo65427c().equals(aVar.mo65427c())) {
                return false;
            }
            if (mo21068a() != aVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo65427c() != null) {
                i = mo65427c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionToCryptoPriceAlertFragment(actionId=" + mo21068a() + "){token=" + mo65427c() + "}";
        }
    }

    /* renamed from: a */
    public static C9206a m71200a(PAToken pAToken) {
        return new C9206a(pAToken);
    }
}
