package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import java.util.HashMap;
import net.safemoon.androidwallet.R;

/* renamed from: net.safemoon.androidwallet.fragments.d */
/* compiled from: NotificationHistoryFragmentDirections */
public class C8565d {

    /* renamed from: net.safemoon.androidwallet.fragments.d$a */
    /* compiled from: NotificationHistoryFragmentDirections */
    public static class C8566a implements j44 {

        /* renamed from: a */
        public final HashMap f42390a;

        public C8566a(String str, boolean z) {
            HashMap hashMap = new HashMap();
            this.f42390a = hashMap;
            if (str != null) {
                hashMap.put("transactionHash", str);
                hashMap.put("isNewTransaction", Boolean.valueOf(z));
                return;
            }
            throw new IllegalArgumentException("Argument \"transactionHash\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_notificationHistoryFragment_to_transferNotificationDetailsFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f42390a.containsKey("transactionHash")) {
                bundle.putString("transactionHash", (String) this.f42390a.get("transactionHash"));
            }
            if (this.f42390a.containsKey("isNewTransaction")) {
                bundle.putBoolean("isNewTransaction", ((Boolean) this.f42390a.get("isNewTransaction")).booleanValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public boolean mo58099c() {
            return ((Boolean) this.f42390a.get("isNewTransaction")).booleanValue();
        }

        /* renamed from: d */
        public String mo58100d() {
            return (String) this.f42390a.get("transactionHash");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8566a aVar = (C8566a) obj;
            if (this.f42390a.containsKey("transactionHash") != aVar.f42390a.containsKey("transactionHash")) {
                return false;
            }
            if (mo58100d() == null ? aVar.mo58100d() != null : !mo58100d().equals(aVar.mo58100d())) {
                return false;
            }
            if (this.f42390a.containsKey("isNewTransaction") == aVar.f42390a.containsKey("isNewTransaction") && mo58099c() == aVar.mo58099c() && mo21068a() == aVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (mo58100d() != null) {
                i = mo58100d().hashCode();
            } else {
                i = 0;
            }
            return ((((i + 31) * 31) + (mo58099c() ? 1 : 0)) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNotificationHistoryFragmentToTransferNotificationDetailsFragment(actionId=" + mo21068a() + "){transactionHash=" + mo58100d() + ", isNewTransaction=" + mo58099c() + "}";
        }
    }

    /* renamed from: a */
    public static C8566a m67999a(String str, boolean z) {
        return new C8566a(str, z);
    }
}
