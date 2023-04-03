package p000;

/* renamed from: pt8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class pt8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32814a;

    /* renamed from: d */
    public final /* synthetic */ String f32815d;

    /* renamed from: e */
    public final /* synthetic */ String f32816e;

    /* renamed from: g */
    public final /* synthetic */ long f32817g;

    /* renamed from: k */
    public final /* synthetic */ rt8 f32818k;

    public pt8(rt8 rt8, String str, String str2, String str3, long j) {
        this.f32818k = rt8;
        this.f32814a = str;
        this.f32815d = str2;
        this.f32816e = str3;
        this.f32817g = j;
    }

    public final void run() {
        String str = this.f32814a;
        if (str == null) {
            this.f32818k.f33579a.mo47680p().mo45253Q().mo44645x(this.f32815d, (ty8) null);
            return;
        }
        this.f32818k.f33579a.mo47680p().mo45253Q().mo44645x(this.f32815d, new ty8(this.f32816e, str, this.f32817g));
    }
}
