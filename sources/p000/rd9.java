package p000;

/* renamed from: rd9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class rd9 implements pd9 {

    /* renamed from: a */
    public static final lx8<Boolean> f33405a;

    /* renamed from: b */
    public static final lx8<Boolean> f33406b;

    /* renamed from: c */
    public static final lx8<Boolean> f33407c;

    /* renamed from: d */
    public static final lx8<Boolean> f33408d;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f33405a = gx8.mo43039b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f33406b = gx8.mo43039b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f33407c = gx8.mo43039b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f33408d = gx8.mo43039b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: b */
    public final boolean mo46703b() {
        return f33408d.mo45550e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f33406b.mo45550e().booleanValue();
    }

    public final boolean zzc() {
        return f33407c.mo45550e().booleanValue();
    }
}
