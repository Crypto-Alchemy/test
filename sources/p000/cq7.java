package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: cq7 */
public final class cq7 {

    /* renamed from: a */
    public final Map<String, Object> f27888a = new HashMap();

    /* renamed from: b */
    public final AtomicBoolean f27889b = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized boolean mo41632a() {
        if (!this.f27889b.get()) {
            mo41633b();
        }
        Object obj = this.f27888a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: b */
    public final synchronized void mo41633b() {
        this.f27888a.put("assetOnlyUpdates", Boolean.FALSE);
    }
}
