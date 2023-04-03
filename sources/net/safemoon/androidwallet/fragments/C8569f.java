package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import java.util.HashMap;
import net.safemoon.androidwallet.R;

/* renamed from: net.safemoon.androidwallet.fragments.f */
/* compiled from: SettingsFragmentDirections */
public class C8569f {

    /* renamed from: net.safemoon.androidwallet.fragments.f$a */
    /* compiled from: SettingsFragmentDirections */
    public static class C8570a implements j44 {

        /* renamed from: a */
        public final HashMap f42392a;

        public C8570a(String str, int i) {
            HashMap hashMap = new HashMap();
            this.f42392a = hashMap;
            if (str != null) {
                hashMap.put("url", str);
                hashMap.put("titleResId", Integer.valueOf(i));
                return;
            }
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }

        /* renamed from: a */
        public int mo21068a() {
            return R.id.action_navigation_settings_to_termScreenWebViewFragment;
        }

        /* renamed from: b */
        public Bundle mo21069b() {
            Bundle bundle = new Bundle();
            if (this.f42392a.containsKey("url")) {
                bundle.putString("url", (String) this.f42392a.get("url"));
            }
            if (this.f42392a.containsKey("withBottomPadding")) {
                bundle.putBoolean("withBottomPadding", ((Boolean) this.f42392a.get("withBottomPadding")).booleanValue());
            } else {
                bundle.putBoolean("withBottomPadding", true);
            }
            if (this.f42392a.containsKey("titleResId")) {
                bundle.putInt("titleResId", ((Integer) this.f42392a.get("titleResId")).intValue());
            }
            return bundle;
        }

        /* renamed from: c */
        public int mo58110c() {
            return ((Integer) this.f42392a.get("titleResId")).intValue();
        }

        /* renamed from: d */
        public String mo58111d() {
            return (String) this.f42392a.get("url");
        }

        /* renamed from: e */
        public boolean mo58112e() {
            return ((Boolean) this.f42392a.get("withBottomPadding")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8570a aVar = (C8570a) obj;
            if (this.f42392a.containsKey("url") != aVar.f42392a.containsKey("url")) {
                return false;
            }
            if (mo58111d() == null ? aVar.mo58111d() != null : !mo58111d().equals(aVar.mo58111d())) {
                return false;
            }
            if (this.f42392a.containsKey("withBottomPadding") == aVar.f42392a.containsKey("withBottomPadding") && mo58112e() == aVar.mo58112e() && this.f42392a.containsKey("titleResId") == aVar.f42392a.containsKey("titleResId") && mo58110c() == aVar.mo58110c() && mo21068a() == aVar.mo21068a()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (mo58111d() != null) {
                i = mo58111d().hashCode();
            } else {
                i = 0;
            }
            return ((((((i + 31) * 31) + (mo58112e() ? 1 : 0)) * 31) + mo58110c()) * 31) + mo21068a();
        }

        public String toString() {
            return "ActionNavigationSettingsToTermScreenWebViewFragment(actionId=" + mo21068a() + "){url=" + mo58111d() + ", withBottomPadding=" + mo58112e() + ", titleResId=" + mo58110c() + "}";
        }
    }

    /* renamed from: a */
    public static j44 m68010a() {
        return new C2456h9(R.id.action_navigation_settings_to_dateFormatFragment);
    }

    /* renamed from: b */
    public static j44 m68011b() {
        return new C2456h9(R.id.action_navigation_settings_to_defaultAppIconFragment);
    }

    /* renamed from: c */
    public static j44 m68012c() {
        return new C2456h9(R.id.action_navigation_settings_to_defaultLanguageFragment);
    }

    /* renamed from: d */
    public static j44 m68013d() {
        return new C2456h9(R.id.action_navigation_settings_to_defaultScreenFragment);
    }

    /* renamed from: e */
    public static j44 m68014e() {
        return new C2456h9(R.id.action_navigation_settings_to_fiatListFragment);
    }

    /* renamed from: f */
    public static j44 m68015f() {
        return new C2456h9(R.id.action_navigation_settings_to_joinCommunityFragment);
    }

    /* renamed from: g */
    public static j44 m68016g() {
        return new C2456h9(R.id.action_navigation_settings_to_manageContactsFragment);
    }

    /* renamed from: h */
    public static j44 m68017h() {
        return new C2456h9(R.id.action_navigation_settings_to_notificationFragment);
    }

    /* renamed from: i */
    public static j44 m68018i() {
        return new C2456h9(R.id.action_navigation_settings_to_securityFragment);
    }

    /* renamed from: j */
    public static j44 m68019j() {
        return new C2456h9(R.id.action_navigation_settings_to_switchWalletFragment);
    }

    /* renamed from: k */
    public static C8570a m68020k(String str, int i) {
        return new C8570a(str, i);
    }

    /* renamed from: l */
    public static j44 m68021l() {
        return new C2456h9(R.id.action_navigation_settings_to_walletConnectFragment);
    }
}
