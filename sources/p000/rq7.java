package p000;

/* renamed from: rq7 */
public abstract class rq7 implements Runnable {

    /* renamed from: a */
    public final nv7<?> f33560a;

    public rq7() {
        this.f33560a = null;
    }

    public rq7(nv7<?> nv7) {
        this.f33560a = nv7;
    }

    /* renamed from: a */
    public abstract void mo29043a();

    /* renamed from: b */
    public final nv7<?> mo47470b() {
        return this.f33560a;
    }

    public final void run() {
        try {
            mo29043a();
        } catch (Exception e) {
            nv7<?> nv7 = this.f33560a;
            if (nv7 != null) {
                nv7.mo46238d(e);
            }
        }
    }
}
