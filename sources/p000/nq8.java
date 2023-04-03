package p000;

import java.util.Map;

/* renamed from: nq8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class nq8 implements yc9 {

    /* renamed from: a */
    public final /* synthetic */ String f32170a;

    /* renamed from: b */
    public final /* synthetic */ qq8 f32171b;

    public nq8(qq8 qq8, String str) {
        this.f32171b = qq8;
        this.f32170a = str;
    }

    /* renamed from: a */
    public final String mo46133a(String str) {
        Map map = (Map) this.f32171b.f33243d.get(this.f32170a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
