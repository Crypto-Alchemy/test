package p000;

/* renamed from: uu8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class uu8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f34731a;

    /* renamed from: d */
    public final /* synthetic */ sx8 f34732d;

    public uu8(sx8 sx8, boolean z) {
        this.f34732d = sx8;
        this.f34731a = z;
    }

    public final void run() {
        boolean h = this.f34732d.f34342a.mo45262h();
        boolean g = this.f34732d.f34342a.mo45261g();
        this.f34732d.f34342a.mo45260f(this.f34731a);
        if (g == this.f34731a) {
            this.f34732d.f34342a.mo45237A().mo29678v().mo48770b("Default data collection state already set to", Boolean.valueOf(this.f34731a));
        }
        if (this.f34732d.f34342a.mo45262h() == h || this.f34732d.f34342a.mo45262h() != this.f34732d.f34342a.mo45261g()) {
            this.f34732d.f34342a.mo45237A().mo29675r().mo48771c("Default data collection is different than actual status", Boolean.valueOf(this.f34731a), Boolean.valueOf(h));
        }
        this.f34732d.mo47905M();
    }
}
