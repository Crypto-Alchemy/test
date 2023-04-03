package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: c19 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class c19 {

    /* renamed from: a */
    public final Map<String, Callable<? extends j78>> f21575a = new HashMap();

    /* renamed from: a */
    public final void mo29847a(String str, Callable<? extends j78> callable) {
        this.f21575a.put(str, callable);
    }
}
