package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.C4495l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: xw7 */
public final class xw7 extends zr7<x66> {

    /* renamed from: j */
    public static xw7 f35710j;

    /* renamed from: g */
    public final Handler f35711g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public final yu7 f35712h;

    /* renamed from: i */
    public final Set<y66> f35713i = new LinkedHashSet();

    public xw7(Context context, yu7 yu7) {
        super(new pq7("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f35712h = yu7;
    }

    /* renamed from: f */
    public static synchronized xw7 m54579f(Context context) {
        xw7 xw7;
        synchronized (xw7.class) {
            if (f35710j == null) {
                f35710j = new xw7(context, C4495l.f24780a);
            }
            xw7 = f35710j;
        }
        return xw7;
    }

    /* renamed from: a */
    public final void mo43369a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            x66 e = x66.m54235e(bundleExtra);
            this.f36220a.mo46852a("ListenerRegistryBroadcastReceiver.onReceive: %s", e);
            cv7 a = this.f35712h.mo34292a();
            if (e.mo43359i() != 3 || a == null) {
                mo49564g(e);
            } else {
                a.mo41736a(e.mo43353d(), new rw7(this, e, intent, context));
            }
        }
    }

    /* renamed from: g */
    public final synchronized void mo49564g(x66 x66) {
        Iterator it = new LinkedHashSet(this.f35713i).iterator();
        while (it.hasNext()) {
            ((y66) it.next()).mo29896a(x66);
        }
        super.mo49912d(x66);
    }
}
