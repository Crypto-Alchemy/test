package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzp;

/* renamed from: tg9 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public abstract class tg9<T> {

    /* renamed from: a */
    public final int f34261a;

    /* renamed from: b */
    public final xl6<T> f34262b = new xl6<>();

    /* renamed from: c */
    public final int f34263c;

    /* renamed from: d */
    public final Bundle f34264d;

    public tg9(int i, int i2, Bundle bundle) {
        this.f34261a = i;
        this.f34263c = i2;
        this.f34264d = bundle;
    }

    /* renamed from: a */
    public abstract void mo45802a(Bundle bundle);

    /* renamed from: b */
    public final void mo48112b(zzp zzp) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzp);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f34262b.mo49504b(zzp);
    }

    /* renamed from: c */
    public final void mo48113c(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
        }
        this.f34262b.mo49505c(t);
    }

    /* renamed from: d */
    public abstract boolean mo45803d();

    public String toString() {
        int i = this.f34263c;
        int i2 = this.f34261a;
        boolean d = mo45803d();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
