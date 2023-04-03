package p000;

/* renamed from: rg5 */
/* compiled from: RetryManager */
public class rg5 {

    /* renamed from: a */
    public boolean f17244a;

    /* renamed from: b */
    public int f17245b;

    /* renamed from: c */
    public int f17246c;

    public rg5() {
        mo25373a();
    }

    /* renamed from: a */
    public void mo25373a() {
        this.f17244a = false;
        this.f17245b = 4;
        mo25375c();
    }

    /* renamed from: b */
    public void mo25374b() {
        this.f17246c++;
    }

    /* renamed from: c */
    public void mo25375c() {
        this.f17246c = 0;
    }

    /* renamed from: d */
    public void mo25376d(boolean z) {
        this.f17244a = z;
    }

    /* renamed from: e */
    public boolean mo25377e() {
        if (!this.f17244a || this.f17246c >= this.f17245b) {
            return false;
        }
        return true;
    }
}
