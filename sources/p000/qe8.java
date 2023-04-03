package p000;

/* renamed from: qe8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class qe8 {

    /* renamed from: a */
    public Object f33080a;

    /* renamed from: b */
    public boolean f33081b = false;

    /* renamed from: c */
    public final /* synthetic */ C6462ry f33082c;

    public qe8(C6462ry ryVar, Object obj) {
        this.f33082c = ryVar;
        this.f33080a = obj;
    }

    /* renamed from: a */
    public abstract void mo47093a(Object obj);

    /* renamed from: b */
    public abstract void mo47094b();

    /* renamed from: c */
    public final void mo47095c() {
        Object obj;
        synchronized (this) {
            obj = this.f33080a;
            if (this.f33081b) {
                String obj2 = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Callback proxy ");
                sb.append(obj2);
                sb.append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo47093a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f33081b = true;
        }
        mo47097e();
    }

    /* renamed from: d */
    public final void mo47096d() {
        synchronized (this) {
            this.f33080a = null;
        }
    }

    /* renamed from: e */
    public final void mo47097e() {
        mo47096d();
        synchronized (this.f33082c.f33642Q) {
            this.f33082c.f33642Q.remove(this);
        }
    }
}
