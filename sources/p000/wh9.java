package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: wh9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class wh9 extends kh2 {

    /* renamed from: f */
    public final HashMap f35326f = new HashMap();

    /* renamed from: g */
    public final Context f35327g;

    /* renamed from: h */
    public volatile Handler f35328h;

    /* renamed from: i */
    public final mg9 f35329i;

    /* renamed from: j */
    public final rp0 f35330j;

    /* renamed from: k */
    public final long f35331k;

    /* renamed from: l */
    public final long f35332l;

    public wh9(Context context, Looper looper) {
        mg9 mg9 = new mg9(this, (ue9) null);
        this.f35329i = mg9;
        this.f35327g = context.getApplicationContext();
        this.f35328h = new iy8(looper, mg9);
        this.f35330j = rp0.m51209b();
        this.f35331k = 5000;
        this.f35332l = 300000;
    }

    /* renamed from: d */
    public final void mo44798d(ib9 ib9, ServiceConnection serviceConnection, String str) {
        cu4.m43222l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f35326f) {
            vc9 vc9 = (vc9) this.f35326f.get(ib9);
            if (vc9 == null) {
                String obj = ib9.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (vc9.mo48726h(serviceConnection)) {
                vc9.mo48724f(serviceConnection, str);
                if (vc9.mo48727i()) {
                    this.f35328h.sendMessageDelayed(this.f35328h.obtainMessage(0, ib9), this.f35331k);
                }
            } else {
                String obj2 = ib9.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo44800f(ib9 ib9, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        cu4.m43222l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f35326f) {
            vc9 vc9 = (vc9) this.f35326f.get(ib9);
            if (vc9 == null) {
                vc9 = new vc9(this, ib9);
                vc9.mo48722d(serviceConnection, serviceConnection, str);
                vc9.mo48723e(str, executor);
                this.f35326f.put(ib9, vc9);
            } else {
                this.f35328h.removeMessages(0, ib9);
                if (!vc9.mo48726h(serviceConnection)) {
                    vc9.mo48722d(serviceConnection, serviceConnection, str);
                    int a = vc9.mo48719a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(vc9.mo48720b(), vc9.mo48721c());
                    } else if (a == 2) {
                        vc9.mo48723e(str, executor);
                    }
                } else {
                    String obj = ib9.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = vc9.mo48728j();
        }
        return j;
    }
}
