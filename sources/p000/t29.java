package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t29 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class t29 {

    /* renamed from: b */
    public static volatile t29 f34089b;

    /* renamed from: c */
    public static volatile t29 f34090c;

    /* renamed from: d */
    public static final t29 f34091d = new t29(true);

    /* renamed from: a */
    public final Map<q29, n49<?, ?>> f34092a;

    public t29() {
        this.f34092a = new HashMap();
    }

    /* renamed from: a */
    public static t29 m52054a() {
        t29 t29 = f34089b;
        if (t29 == null) {
            synchronized (t29.class) {
                t29 = f34089b;
                if (t29 == null) {
                    t29 = f34091d;
                    f34089b = t29;
                }
            }
        }
        return t29;
    }

    /* renamed from: b */
    public static t29 m52055b() {
        Class<t29> cls = t29.class;
        t29 t29 = f34090c;
        if (t29 != null) {
            return t29;
        }
        synchronized (cls) {
            t29 t292 = f34090c;
            if (t292 != null) {
                return t292;
            }
            t29 b = q39.m50226b(cls);
            f34090c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends r79> n49<ContainingType, ?> mo47960c(ContainingType containingtype, int i) {
        return this.f34092a.get(new q29(containingtype, i));
    }

    public t29(boolean z) {
        this.f34092a = Collections.emptyMap();
    }
}
