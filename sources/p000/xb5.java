package p000;

import android.os.Bundle;
import java.util.HashMap;
import net.safemoon.androidwallet.R;

/* renamed from: xb5 */
/* compiled from: ReflectionsFragmentDirections */
public class xb5 {

    /* renamed from: xb5$a */
    /* compiled from: ReflectionsFragmentDirections */
    public static class C9590a implements j44 {

        /* renamed from: a */
        public final HashMap f45859a;

        public C9590a(int i) {
            HashMap hashMap = new HashMap();
            this.f45859a = hashMap;
            hashMap.put("tokenChainId", Integer.valueOf(i));
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_reflectionsFragment_to_addCustomReflectionContractFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f45859a.containsKey("tokenChainId")) {
                bundle.putInt("tokenChainId", ((Integer) this.f45859a.get("tokenChainId")).intValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public int mo66837c() {
            return ((Integer) this.f45859a.get("tokenChainId")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9590a aVar = (C9590a) obj;
            if (this.f45859a.containsKey("tokenChainId") == aVar.f45859a.containsKey("tokenChainId") && mo66837c() == aVar.mo66837c() && mo21068a() == aVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((mo66837c() + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionReflectionsFragmentToAddCustomReflectionContractFragment(actionId=" + mo21068a() + "){tokenChainId=" + mo66837c() + "}";
        }
    }

    /* renamed from: xb5$b */
    /* compiled from: ReflectionsFragmentDirections */
    public static class C9591b implements j44 {

        /* renamed from: a */
        public final HashMap f45860a;

        public C9591b(String str) {
            HashMap hashMap = new HashMap();
            this.f45860a = hashMap;
            if (str != null) {
                hashMap.put("symbolWithType", str);
                return;
            }
            throw new IllegalArgumentException("Argument \"symbolWithType\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_reflectionsFragment_to_reflectionsAdvanceFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f45860a.containsKey("symbolWithType")) {
                bundle.putString("symbolWithType", (String) this.f45860a.get("symbolWithType"));
            }
            return bundle;
        }

        /* renamed from: c */
        public String mo66841c() {
            return (String) this.f45860a.get("symbolWithType");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9591b bVar = (C9591b) obj;
            if (this.f45860a.containsKey("symbolWithType") != bVar.f45860a.containsKey("symbolWithType")) {
                return false;
            }
            if (mo66841c() == null ? bVar.mo66841c() != null : !mo66841c().equals(bVar.mo66841c())) {
                return false;
            }
            if (mo21068a() != bVar.mo21068a()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            if (mo66841c() != null) {
                i = mo66841c().hashCode();
            } else {
                i = 0;
            }
            return ((i + 31) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionReflectionsFragmentToReflectionsAdvanceFragment(actionId=" + mo21068a() + "){symbolWithType=" + mo66841c() + "}";
        }
    }

    /* renamed from: a */
    public static C9590a m73907a(int i) {
        return new C9590a(i);
    }

    /* renamed from: b */
    public static j44 m73908b() {
        return new C2456h9(R.id.action_reflectionsFragment_to_notificationHistoryFragment);
    }

    /* renamed from: c */
    public static C9591b m73909c(String str) {
        return new C9591b(str);
    }
}
