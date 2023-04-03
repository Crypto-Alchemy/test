package p000;

/* renamed from: yb9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class yb9 implements wb9 {

    /* renamed from: a */
    public static final lx8<Boolean> f35845a;

    /* renamed from: b */
    public static final lx8<Boolean> f35846b;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f35845a = gx8.mo43039b("measurement.androidId.delete_feature", true);
        f35846b = gx8.mo43039b("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return f35845a.mo45550e().booleanValue();
    }
}
