package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.internal.C4486ar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gr7 */
public final class gr7<T extends IInterface> {

    /* renamed from: l */
    public static final Map<String, Handler> f29325l = new HashMap();

    /* renamed from: a */
    public final Context f29326a;

    /* renamed from: b */
    public final pq7 f29327b;

    /* renamed from: c */
    public final String f29328c;

    /* renamed from: d */
    public final List<rq7> f29329d = new ArrayList();

    /* renamed from: e */
    public boolean f29330e;

    /* renamed from: f */
    public final Intent f29331f;

    /* renamed from: g */
    public final zq7<T> f29332g;

    /* renamed from: h */
    public final WeakReference<yq7> f29333h;

    /* renamed from: i */
    public final IBinder.DeathRecipient f29334i = new tq7(this);

    /* renamed from: j */
    public ServiceConnection f29335j;

    /* renamed from: k */
    public T f29336k;

    public gr7(Context context, pq7 pq7, String str, Intent intent, zq7<T> zq7) {
        this.f29326a = context;
        this.f29327b = pq7;
        this.f29328c = str;
        this.f29331f = intent;
        this.f29332g = zq7;
        this.f29333h = new WeakReference<>((Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ void m44843d(gr7 gr7, rq7 rq7) {
        if (gr7.f29336k == null && !gr7.f29330e) {
            gr7.f29327b.mo46855d("Initiate binding to the service.", new Object[0]);
            gr7.f29329d.add(rq7);
            er7 er7 = new er7(gr7);
            gr7.f29335j = er7;
            gr7.f29330e = true;
            if (!gr7.f29326a.bindService(gr7.f29331f, er7, 1)) {
                gr7.f29327b.mo46855d("Failed to bind to the service.", new Object[0]);
                gr7.f29330e = false;
                for (rq7 b : gr7.f29329d) {
                    nv7<?> b2 = b.mo47470b();
                    if (b2 != null) {
                        b2.mo46238d(new C4486ar());
                    }
                }
                gr7.f29329d.clear();
            }
        } else if (gr7.f29330e) {
            gr7.f29327b.mo46855d("Waiting to bind to the service.", new Object[0]);
            gr7.f29329d.add(rq7);
        } else {
            rq7.run();
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m44849j(gr7 gr7) {
        gr7.f29327b.mo46855d("linkToDeath", new Object[0]);
        try {
            gr7.f29336k.asBinder().linkToDeath(gr7.f29334i, 0);
        } catch (RemoteException e) {
            gr7.f29327b.mo46854c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m44852m(gr7 gr7) {
        gr7.f29327b.mo46855d("unlinkToDeath", new Object[0]);
        gr7.f29336k.asBinder().unlinkToDeath(gr7.f29334i, 0);
    }

    /* renamed from: a */
    public final void mo42952a(rq7 rq7) {
        mo42956r(new vq7(this, rq7.mo47470b(), rq7));
    }

    /* renamed from: b */
    public final void mo42953b() {
        mo42956r(new xq7(this));
    }

    /* renamed from: c */
    public final T mo42954c() {
        return this.f29336k;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo42955n() {
        this.f29327b.mo46855d("reportBinderDeath", new Object[0]);
        yq7 yq7 = this.f29333h.get();
        if (yq7 == null) {
            this.f29327b.mo46855d("%s : Binder has died.", this.f29328c);
            for (rq7 b : this.f29329d) {
                nv7<?> b2 = b.mo47470b();
                if (b2 != null) {
                    b2.mo46238d(new RemoteException(String.valueOf(this.f29328c).concat(" : Binder has died.")));
                }
            }
            this.f29329d.clear();
            return;
        }
        this.f29327b.mo46855d("calling onBinderDied", new Object[0]);
        yq7.mo49731a();
    }

    /* renamed from: r */
    public final void mo42956r(rq7 rq7) {
        Handler handler;
        Map<String, Handler> map = f29325l;
        synchronized (map) {
            if (!map.containsKey(this.f29328c)) {
                HandlerThread handlerThread = new HandlerThread(this.f29328c, 10);
                handlerThread.start();
                map.put(this.f29328c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f29328c);
        }
        handler.post(rq7);
    }
}
