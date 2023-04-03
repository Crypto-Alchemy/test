package p000;

/* renamed from: bc9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class bc9 implements ac9 {

    /* renamed from: a */
    public static final lx8<Boolean> f21241a;

    /* renamed from: b */
    public static final lx8<Boolean> f21242b;

    /* renamed from: c */
    public static final lx8<Long> f21243c;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f21241a = gx8.mo43039b("measurement.frontend.directly_maybe_log_error_events", false);
        f21242b = gx8.mo43039b("measurement.upload.directly_maybe_log_error_events", true);
        f21243c = gx8.mo43038a("measurement.id.frontend.directly_maybe_log_error_events", 0);
    }

    public final boolean zza() {
        return f21241a.mo45550e().booleanValue();
    }

    public final boolean zzb() {
        return f21242b.mo45550e().booleanValue();
    }
}
