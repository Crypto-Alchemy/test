package p000;

import com.bumptech.glide.load.engine.C1768g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l33 */
/* compiled from: Jobs */
public final class l33 {

    /* renamed from: a */
    public final Map<z93, C1768g<?>> f14402a = new HashMap();

    /* renamed from: b */
    public final Map<z93, C1768g<?>> f14403b = new HashMap();

    /* renamed from: a */
    public C1768g<?> mo22629a(z93 z93, boolean z) {
        return mo22630b(z).get(z93);
    }

    /* renamed from: b */
    public final Map<z93, C1768g<?>> mo22630b(boolean z) {
        if (z) {
            return this.f14403b;
        }
        return this.f14402a;
    }

    /* renamed from: c */
    public void mo22631c(z93 z93, C1768g<?> gVar) {
        mo22630b(gVar.mo12545p()).put(z93, gVar);
    }

    /* renamed from: d */
    public void mo22632d(z93 z93, C1768g<?> gVar) {
        Map<z93, C1768g<?>> b = mo22630b(gVar.mo12545p());
        if (gVar.equals(b.get(z93))) {
            b.remove(z93);
        }
    }
}
