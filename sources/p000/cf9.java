package p000;

/* renamed from: cf9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class cf9 implements te9 {

    /* renamed from: a */
    public static final lx8<Boolean> f21732a;

    /* renamed from: b */
    public static final lx8<Boolean> f21733b;

    /* renamed from: c */
    public static final lx8<Boolean> f21734c;

    /* renamed from: d */
    public static final lx8<Boolean> f21735d;

    /* renamed from: e */
    public static final lx8<Long> f21736e;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f21732a = gx8.mo43039b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f21733b = gx8.mo43039b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f21734c = gx8.mo43039b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f21735d = gx8.mo43039b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        f21736e = gx8.mo43038a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: b */
    public final boolean mo29963b() {
        return f21735d.mo45550e().booleanValue();
    }

    public final boolean zza() {
        return f21732a.mo45550e().booleanValue();
    }

    public final boolean zzb() {
        return f21733b.mo45550e().booleanValue();
    }

    public final boolean zzc() {
        return f21734c.mo45550e().booleanValue();
    }
}
