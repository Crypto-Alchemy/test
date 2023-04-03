package p000;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: yk7 */
/* compiled from: WifiLockManager */
public final class yk7 {

    /* renamed from: a */
    public final WifiManager f20273a;

    /* renamed from: b */
    public WifiManager.WifiLock f20274b;

    /* renamed from: c */
    public boolean f20275c;

    /* renamed from: d */
    public boolean f20276d;

    public yk7(Context context) {
        this.f20273a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public void mo28143a(boolean z) {
        if (z && this.f20274b == null) {
            WifiManager wifiManager = this.f20273a;
            if (wifiManager == null) {
                gk3.m18132i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f20274b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f20275c = z;
        mo28145c();
    }

    /* renamed from: b */
    public void mo28144b(boolean z) {
        this.f20276d = z;
        mo28145c();
    }

    /* renamed from: c */
    public final void mo28145c() {
        WifiManager.WifiLock wifiLock = this.f20274b;
        if (wifiLock != null) {
            if (!this.f20275c || !this.f20276d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
