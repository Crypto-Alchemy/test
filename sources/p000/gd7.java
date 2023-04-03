package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gd7 */
/* compiled from: ViewModelStore */
public class gd7 {

    /* renamed from: a */
    public final HashMap<String, ad7> f12302a = new HashMap<>();

    /* renamed from: a */
    public final void mo20539a() {
        for (ad7 clear : this.f12302a.values()) {
            clear.clear();
        }
        this.f12302a.clear();
    }

    /* renamed from: b */
    public final ad7 mo20540b(String str) {
        return this.f12302a.get(str);
    }

    /* renamed from: c */
    public Set<String> mo20541c() {
        return new HashSet(this.f12302a.keySet());
    }

    /* renamed from: d */
    public final void mo20542d(String str, ad7 ad7) {
        ad7 put = this.f12302a.put(str, ad7);
        if (put != null) {
            put.onCleared();
        }
    }
}
