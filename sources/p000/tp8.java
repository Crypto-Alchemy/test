package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: tp8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class tp8 implements ServiceConnection {

    /* renamed from: a */
    public final String f34311a;

    /* renamed from: d */
    public final /* synthetic */ wp8 f34312d;

    public tp8(wp8 wp8, String str) {
        this.f34312d = wp8;
        this.f34311a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zc8 q1 = vc8.m53338q1(iBinder);
                if (q1 == null) {
                    this.f34312d.f35408a.mo45237A().mo29673o().mo48769a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f34312d.f35408a.mo45237A().mo29678v().mo48769a("Install Referrer Service connected");
                this.f34312d.f35408a.mo45272s().mo41640o(new op8(this, q1, this));
            } catch (RuntimeException e) {
                this.f34312d.f35408a.mo45237A().mo29673o().mo48770b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f34312d.f35408a.mo45237A().mo29673o().mo48769a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f34312d.f35408a.mo45237A().mo29678v().mo48769a("Install Referrer Service disconnected");
    }
}
