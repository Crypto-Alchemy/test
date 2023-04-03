package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: dg7 */
/* compiled from: WakeLockManager */
public final class dg7 {

    /* renamed from: a */
    public final PowerManager f10708a;

    /* renamed from: b */
    public PowerManager.WakeLock f10709b;

    /* renamed from: c */
    public boolean f10710c;

    /* renamed from: d */
    public boolean f10711d;

    public dg7(Context context) {
        this.f10708a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public void mo18766a(boolean z) {
        if (z && this.f10709b == null) {
            PowerManager powerManager = this.f10708a;
            if (powerManager == null) {
                gk3.m18132i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f10709b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f10710c = z;
        mo18768c();
    }

    /* renamed from: b */
    public void mo18767b(boolean z) {
        this.f10711d = z;
        mo18768c();
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: c */
    public final void mo18768c() {
        PowerManager.WakeLock wakeLock = this.f10709b;
        if (wakeLock != null) {
            if (!this.f10710c || !this.f10711d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
