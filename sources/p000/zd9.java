package p000;

/* renamed from: zd9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zd9 implements yd9 {

    /* renamed from: a */
    public static final lx8<Boolean> f36121a;

    /* renamed from: b */
    public static final lx8<Boolean> f36122b;

    /* renamed from: c */
    public static final lx8<Boolean> f36123c;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f36121a = gx8.mo43039b("measurement.client.sessions.check_on_reset_and_enable2", true);
        f36122b = gx8.mo43039b("measurement.client.sessions.check_on_startup", true);
        f36123c = gx8.mo43039b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f36121a.mo45550e().booleanValue();
    }
}
