package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0729l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: fa2 */
/* compiled from: FragmentManagerViewModel */
public final class fa2 extends ad7 {

    /* renamed from: h */
    public static final C0729l.C0733b f11659h = new C2281a();

    /* renamed from: a */
    public final HashMap<String, Fragment> f11660a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, fa2> f11661b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, gd7> f11662c = new HashMap<>();

    /* renamed from: d */
    public final boolean f11663d;

    /* renamed from: e */
    public boolean f11664e = false;

    /* renamed from: f */
    public boolean f11665f = false;

    /* renamed from: g */
    public boolean f11666g = false;

    /* renamed from: fa2$a */
    /* compiled from: FragmentManagerViewModel */
    public class C2281a implements C0729l.C0733b {
        /* renamed from: a */
        public <T extends ad7> T mo6370a(Class<T> cls) {
            return new fa2(true);
        }

        /* renamed from: b */
        public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
            return ed7.m16079b(this, cls, zv0);
        }
    }

    public fa2(boolean z) {
        this.f11663d = z;
    }

    /* renamed from: h */
    public static fa2 m16752h(gd7 gd7) {
        return (fa2) new C0729l(gd7, f11659h).mo6421a(fa2.class);
    }

    /* renamed from: b */
    public void mo19826b(Fragment fragment) {
        if (this.f11666g) {
            FragmentManager.m4630K0(2);
        } else if (!this.f11660a.containsKey(fragment.mWho)) {
            this.f11660a.put(fragment.mWho, fragment);
            if (FragmentManager.m4630K0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
            }
        }
    }

    /* renamed from: c */
    public void mo19827c(Fragment fragment) {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        mo19829e(fragment.mWho);
    }

    /* renamed from: d */
    public void mo19828d(String str) {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        mo19829e(str);
    }

    /* renamed from: e */
    public final void mo19829e(String str) {
        fa2 fa2 = this.f11661b.get(str);
        if (fa2 != null) {
            fa2.onCleared();
            this.f11661b.remove(str);
        }
        gd7 gd7 = this.f11662c.get(str);
        if (gd7 != null) {
            gd7.mo20539a();
            this.f11662c.remove(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fa2.class != obj.getClass()) {
            return false;
        }
        fa2 fa2 = (fa2) obj;
        if (!this.f11660a.equals(fa2.f11660a) || !this.f11661b.equals(fa2.f11661b) || !this.f11662c.equals(fa2.f11662c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Fragment mo19831f(String str) {
        return this.f11660a.get(str);
    }

    /* renamed from: g */
    public fa2 mo19832g(Fragment fragment) {
        fa2 fa2 = this.f11661b.get(fragment.mWho);
        if (fa2 != null) {
            return fa2;
        }
        fa2 fa22 = new fa2(this.f11663d);
        this.f11661b.put(fragment.mWho, fa22);
        return fa22;
    }

    public int hashCode() {
        return (((this.f11660a.hashCode() * 31) + this.f11661b.hashCode()) * 31) + this.f11662c.hashCode();
    }

    /* renamed from: i */
    public Collection<Fragment> mo19834i() {
        return new ArrayList(this.f11660a.values());
    }

    /* renamed from: j */
    public gd7 mo19835j(Fragment fragment) {
        gd7 gd7 = this.f11662c.get(fragment.mWho);
        if (gd7 != null) {
            return gd7;
        }
        gd7 gd72 = new gd7();
        this.f11662c.put(fragment.mWho, gd72);
        return gd72;
    }

    /* renamed from: k */
    public boolean mo19836k() {
        return this.f11664e;
    }

    /* renamed from: l */
    public void mo19837l(Fragment fragment) {
        boolean z;
        if (this.f11666g) {
            FragmentManager.m4630K0(2);
            return;
        }
        if (this.f11660a.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && FragmentManager.m4630K0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* renamed from: m */
    public void mo19838m(boolean z) {
        this.f11666g = z;
    }

    /* renamed from: n */
    public boolean mo19839n(Fragment fragment) {
        if (!this.f11660a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f11663d) {
            return this.f11664e;
        }
        return !this.f11665f;
    }

    public void onCleared() {
        if (FragmentManager.m4630K0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f11664e = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f11660a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f11661b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f11662c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
