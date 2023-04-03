package p000;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: uy8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class uy8<T> implements qy8<T> {

    /* renamed from: a */
    public volatile qy8<T> f34757a;

    /* renamed from: d */
    public volatile boolean f34758d;
    @NullableDecl

    /* renamed from: e */
    public T f34759e;

    public uy8(qy8<T> qy8) {
        qy8.getClass();
        this.f34757a = qy8;
    }

    public final String toString() {
        Object obj = this.f34757a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f34759e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f34758d) {
            synchronized (this) {
                if (!this.f34758d) {
                    T zza = this.f34757a.zza();
                    this.f34759e = zza;
                    this.f34758d = true;
                    this.f34757a = null;
                    return zza;
                }
            }
        }
        return this.f34759e;
    }
}
