package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e80 */
/* compiled from: CacheFragment */
public class e80 extends Fragment {

    /* renamed from: a */
    public final Map<String, Object> f46513a = new HashMap();

    /* renamed from: h */
    public static e80 m75269h(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Fragment l0 = supportFragmentManager.mo5984l0("CacheFragment");
        if (l0 instanceof e80) {
            return (e80) l0;
        }
        e80 e80 = new e80();
        e80.setRetainInstance(true);
        supportFragmentManager.mo5996q().mo6264e(e80, "CacheFragment").mo6139j();
        return e80;
    }

    /* renamed from: i */
    public <T> T mo67417i(String str) {
        try {
            return this.f46513a.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public <T> void mo67418j(String str, T t) {
        this.f46513a.put(str, t);
    }
}
