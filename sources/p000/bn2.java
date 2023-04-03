package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bn2 */
/* compiled from: HttpDataSource */
public final class bn2 {

    /* renamed from: a */
    public final Map<String, String> f8189a = new HashMap();

    /* renamed from: b */
    public Map<String, String> f8190b;

    /* renamed from: a */
    public synchronized Map<String, String> mo11708a() {
        if (this.f8190b == null) {
            this.f8190b = Collections.unmodifiableMap(new HashMap(this.f8189a));
        }
        return this.f8190b;
    }
}
