package p000;

import java.util.List;

/* renamed from: g99 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class g99 extends j78 {

    /* renamed from: e */
    public final /* synthetic */ yc9 f29132e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g99(mb9 mb9, String str, yc9 yc9) {
        super("getValue");
        this.f29132e = yc9;
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        gv8.m44946a("getValue", 2, list);
        r88 a = ps8.mo46865a(list.get(0));
        r88 a2 = ps8.mo46865a(list.get(1));
        String a3 = this.f29132e.mo46133a(a.zzc());
        if (a3 != null) {
            return new b98(a3);
        }
        return a2;
    }
}
