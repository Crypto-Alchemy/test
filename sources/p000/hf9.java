package p000;

/* renamed from: hf9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class hf9 implements gf9 {

    /* renamed from: a */
    public static final lx8<Long> f29565a;

    /* renamed from: b */
    public static final lx8<Boolean> f29566b;

    /* renamed from: c */
    public static final lx8<Boolean> f29567c;

    /* renamed from: d */
    public static final lx8<Boolean> f29568d;

    /* renamed from: e */
    public static final lx8<Long> f29569e;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f29565a = gx8.mo43038a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f29566b = gx8.mo43039b("measurement.lifecycle.app_backgrounded_engagement", false);
        f29567c = gx8.mo43039b("measurement.lifecycle.app_backgrounded_tracking", true);
        f29568d = gx8.mo43039b("measurement.lifecycle.app_in_background_parameter", false);
        f29569e = gx8.mo43038a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return f29566b.mo45550e().booleanValue();
    }

    public final boolean zzb() {
        return f29568d.mo45550e().booleanValue();
    }
}
