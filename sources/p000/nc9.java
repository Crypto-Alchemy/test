package p000;

/* renamed from: nc9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class nc9 implements mc9 {

    /* renamed from: a */
    public static final lx8<Boolean> f32090a;

    /* renamed from: b */
    public static final lx8<Boolean> f32091b;

    /* renamed from: c */
    public static final lx8<Boolean> f32092c;

    /* renamed from: d */
    public static final lx8<Long> f32093d;

    /* renamed from: e */
    public static final lx8<Long> f32094e;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f32090a = gx8.mo43039b("measurement.client.consent_state_v1", true);
        f32091b = gx8.mo43039b("measurement.client.3p_consent_state_v1", true);
        f32092c = gx8.mo43039b("measurement.service.consent_state_v1_W36", true);
        f32093d = gx8.mo43038a("measurement.id.service.consent_state_v1_W36", 0);
        f32094e = gx8.mo43038a("measurement.service.storage_consent_support_version", 203590);
    }

    public final long zza() {
        return f32094e.mo45550e().longValue();
    }
}
