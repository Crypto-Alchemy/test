package p000;

/* renamed from: uf9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class uf9 implements tf9 {

    /* renamed from: a */
    public static final lx8<Boolean> f34593a;

    /* renamed from: b */
    public static final lx8<Long> f34594b;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f34593a = gx8.mo43039b("measurement.config.persist_last_modified", true);
        f34594b = gx8.mo43038a("measurement.id.config.persist_last_modified", 0);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return f34593a.mo45550e().booleanValue();
    }
}
