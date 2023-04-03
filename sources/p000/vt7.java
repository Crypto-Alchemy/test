package p000;

/* renamed from: vt7 */
public final class vt7<T> implements xt7, rt7 {

    /* renamed from: c */
    public static final Object f35122c = new Object();

    /* renamed from: a */
    public volatile xt7<T> f35123a;

    /* renamed from: b */
    public volatile Object f35124b = f35122c;

    public vt7(xt7<T> xt7) {
        this.f35123a = xt7;
    }

    /* renamed from: b */
    public static <P extends xt7<T>, T> xt7<T> m53502b(P p) {
        ns7.m49003j(p);
        return p instanceof vt7 ? p : new vt7(p);
    }

    /* renamed from: c */
    public static <P extends xt7<T>, T> rt7<T> m53503c(P p) {
        if (p instanceof rt7) {
            return (rt7) p;
        }
        ns7.m49003j(p);
        return new vt7(p);
    }

    /* renamed from: a */
    public final T mo42984a() {
        T t = this.f35124b;
        T t2 = f35122c;
        if (t == t2) {
            synchronized (this) {
                t = this.f35124b;
                if (t == t2) {
                    t = this.f35123a.mo42984a();
                    T t3 = this.f35124b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f35124b = t;
                    this.f35123a = null;
                }
            }
        }
        return t;
    }
}
