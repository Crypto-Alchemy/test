package p000;

/* renamed from: lf9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class lf9 implements kf9 {

    /* renamed from: a */
    public static final lx8<Boolean> f31307a;

    /* renamed from: b */
    public static final lx8<Boolean> f31308b;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f31307a = gx8.mo43039b("measurement.sdk.screen.manual_screen_view_logging", true);
        f31308b = gx8.mo43039b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f31307a.mo45550e().booleanValue();
    }

    public final boolean zzc() {
        return f31308b.mo45550e().booleanValue();
    }
}
