package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: xc5 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class xc5 {

    /* renamed from: a */
    public final Map f35597a = new HashMap();

    /* renamed from: xc5$a */
    /* compiled from: com.google.mlkit:common@@18.5.0 */
    public static class C6695a {

        /* renamed from: a */
        public final Class f35598a;

        /* renamed from: b */
        public final ly4 f35599b;

        public <RemoteT extends wc5> C6695a(Class<RemoteT> cls, ly4<Object> ly4) {
            this.f35598a = cls;
            this.f35599b = ly4;
        }

        /* renamed from: a */
        public final ly4 mo49451a() {
            return this.f35599b;
        }

        /* renamed from: b */
        public final Class mo49452b() {
            return this.f35598a;
        }
    }

    public xc5(Set<C6695a> set) {
        for (C6695a next : set) {
            this.f35597a.put(next.mo49452b(), next.mo49451a());
        }
    }
}
