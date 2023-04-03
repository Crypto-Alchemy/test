package p000;

/* renamed from: yf9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class yf9 implements wf9 {

    /* renamed from: a */
    public static final lx8<Boolean> f35871a;

    /* renamed from: b */
    public static final lx8<Double> f35872b;

    /* renamed from: c */
    public static final lx8<Long> f35873c;

    /* renamed from: d */
    public static final lx8<Long> f35874d;

    /* renamed from: e */
    public static final lx8<String> f35875e;

    static {
        gx8 gx8 = new gx8(pw8.m50175a("com.google.android.gms.measurement"));
        f35871a = gx8.mo43039b("measurement.test.boolean_flag", false);
        f35872b = gx8.mo43040c("measurement.test.double_flag", -3.0d);
        f35873c = gx8.mo43038a("measurement.test.int_flag", -2);
        f35874d = gx8.mo43038a("measurement.test.long_flag", -1);
        f35875e = gx8.mo43041d("measurement.test.string_flag", "---");
    }

    /* renamed from: b */
    public final long mo49193b() {
        return f35874d.mo45550e().longValue();
    }

    /* renamed from: c */
    public final String mo49194c() {
        return f35875e.mo45550e();
    }

    public final boolean zza() {
        return f35871a.mo45550e().booleanValue();
    }

    public final double zzb() {
        return f35872b.mo45550e().doubleValue();
    }

    public final long zzc() {
        return f35873c.mo45550e().longValue();
    }
}
