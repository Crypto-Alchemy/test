package p000;

/* renamed from: qc9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class qc9 implements pc9 {

    /* renamed from: a */
    public static final lx8<Boolean> f33057a;

    /* renamed from: b */
    public static final lx8<Boolean> f33058b;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f33057a = gx8.mo43039b("measurement.euid.client.dev", false);
        f33058b = gx8.mo43039b("measurement.euid.service", false);
    }

    public final boolean zza() {
        return f33057a.mo45550e().booleanValue();
    }

    public final boolean zzb() {
        return f33058b.mo45550e().booleanValue();
    }
}
