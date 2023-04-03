package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o78 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final /* synthetic */ class o78 {
    /* renamed from: a */
    public static r88 m49184a(y78 y78, r88 r88, ps8 ps8, List<r88> list) {
        if (y78.mo41864q(r88.zzc())) {
            r88 j = y78.mo41862j(r88.zzc());
            if (j instanceof j78) {
                return ((j78) j).mo29623a(ps8, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{r88.zzc()}));
        } else if ("hasOwnProperty".equals(r88.zzc())) {
            gv8.m44946a("hasOwnProperty", 1, list);
            if (y78.mo41864q(ps8.mo46865a(list.get(0)).zzc())) {
                return r88.f33335l1;
            }
            return r88.f33336m1;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{r88.zzc()}));
        }
    }

    /* renamed from: b */
    public static Iterator<r88> m49185b(Map<String, r88> map) {
        return new t78(map.keySet().iterator());
    }
}
