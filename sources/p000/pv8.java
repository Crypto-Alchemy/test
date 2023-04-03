package p000;

/* renamed from: pv8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class pv8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f32849a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f32850d;

    public pv8(sx8 sx8, long j) {
        this.f32850d = sx8;
        this.f32849a = j;
    }

    public final void run() {
        this.f32850d.f34342a.mo45275z().f31362k.mo43883b(this.f32849a);
        this.f32850d.f34342a.mo45237A().mo29677u().mo48770b("Session timeout duration set", Long.valueOf(this.f32849a));
    }
}
