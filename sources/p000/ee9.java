package p000;

/* renamed from: ee9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ee9 implements de9 {

    /* renamed from: a */
    public static final lx8<Boolean> f28611a;

    /* renamed from: b */
    public static final lx8<Boolean> f28612b;

    /* renamed from: c */
    public static final lx8<Long> f28613c;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f28611a = gx8.mo43039b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f28612b = gx8.mo43039b("measurement.collection.redundant_engagement_removal_enabled", false);
        f28613c = gx8.mo43038a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean zza() {
        return f28612b.mo45550e().booleanValue();
    }
}
