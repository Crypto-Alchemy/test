package p000;

import java.util.List;

/* renamed from: ri9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class ri9 extends j78 {

    /* renamed from: e */
    public final zh9 f33441e;

    public ri9(zh9 zh9) {
        super("internal.logger");
        this.f33441e = zh9;
        this.f30237d.put("log", new hi9(this, false, true));
        this.f30237d.put("silent", new xe9(this, "silent"));
        ((j78) this.f30237d.get("silent")).mo41863k("log", new hi9(this, true, true));
        this.f30237d.put("unmonitored", new qg9(this, "unmonitored"));
        ((j78) this.f30237d.get("unmonitored")).mo41863k("log", new hi9(this, false, false));
    }

    /* renamed from: a */
    public final r88 mo29623a(ps8 ps8, List<r88> list) {
        return r88.f33330g1;
    }
}
