package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: yn8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class yn8 extends BroadcastReceiver {

    /* renamed from: d */
    public static final String f35904d = yn8.class.getName();

    /* renamed from: a */
    public final s59 f35905a;

    /* renamed from: b */
    public boolean f35906b;

    /* renamed from: c */
    public boolean f35907c;

    public yn8(s59 s59) {
        cu4.m43221k(s59);
        this.f35905a = s59;
    }

    /* renamed from: a */
    public final void mo49720a() {
        this.f35905a.mo47661d0();
        this.f35905a.mo45272s().mo29006e();
        if (!this.f35906b) {
            this.f35905a.mo45271q().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f35907c = this.f35905a.mo47650U().mo47844j();
            this.f35905a.mo45237A().mo29678v().mo48770b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f35907c));
            this.f35906b = true;
        }
    }

    /* renamed from: b */
    public final void mo49721b() {
        this.f35905a.mo47661d0();
        this.f35905a.mo45272s().mo29006e();
        this.f35905a.mo45272s().mo29006e();
        if (this.f35906b) {
            this.f35905a.mo45237A().mo29678v().mo48769a("Unregistering connectivity change receiver");
            this.f35906b = false;
            this.f35907c = false;
            try {
                this.f35905a.mo45271q().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f35905a.mo45237A().mo29670l().mo48770b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f35905a.mo47661d0();
        String action = intent.getAction();
        this.f35905a.mo45237A().mo29678v().mo48770b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean j = this.f35905a.mo47650U().mo47844j();
            if (this.f35907c != j) {
                this.f35907c = j;
                this.f35905a.mo45272s().mo41640o(new vn8(this, j));
                return;
            }
            return;
        }
        this.f35905a.mo45237A().mo29673o().mo48770b("NetworkBroadcastReceiver received unknown action", action);
    }
}
