package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: vc9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class vc9 implements ServiceConnection, ei9 {

    /* renamed from: a */
    public final Map f34907a = new HashMap();

    /* renamed from: d */
    public int f34908d = 2;

    /* renamed from: e */
    public boolean f34909e;

    /* renamed from: g */
    public IBinder f34910g;

    /* renamed from: k */
    public final ib9 f34911k;

    /* renamed from: r */
    public ComponentName f34912r;

    /* renamed from: s */
    public final /* synthetic */ wh9 f34913s;

    public vc9(wh9 wh9, ib9 ib9) {
        this.f34913s = wh9;
        this.f34911k = ib9;
    }

    /* renamed from: a */
    public final int mo48719a() {
        return this.f34908d;
    }

    /* renamed from: b */
    public final ComponentName mo48720b() {
        return this.f34912r;
    }

    /* renamed from: c */
    public final IBinder mo48721c() {
        return this.f34910g;
    }

    /* renamed from: d */
    public final void mo48722d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f34907a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo48723e(String str, Executor executor) {
        this.f34908d = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (xp4.m54487l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            wh9 wh9 = this.f34913s;
            boolean d = wh9.f35330j.mo47468d(wh9.f35327g, str, this.f34911k.mo43537c(wh9.f35327g), this, this.f34911k.mo43535a(), executor);
            this.f34909e = d;
            if (d) {
                this.f34913s.f35328h.sendMessageDelayed(this.f34913s.f35328h.obtainMessage(1, this.f34911k), this.f34913s.f35332l);
            } else {
                this.f34908d = 2;
                try {
                    wh9 wh92 = this.f34913s;
                    wh92.f35330j.mo47467c(wh92.f35327g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo48724f(ServiceConnection serviceConnection, String str) {
        this.f34907a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo48725g(String str) {
        this.f34913s.f35328h.removeMessages(1, this.f34911k);
        wh9 wh9 = this.f34913s;
        wh9.f35330j.mo47467c(wh9.f35327g, this);
        this.f34909e = false;
        this.f34908d = 2;
    }

    /* renamed from: h */
    public final boolean mo48726h(ServiceConnection serviceConnection) {
        return this.f34907a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo48727i() {
        return this.f34907a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo48728j() {
        return this.f34909e;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f34913s.f35326f) {
            this.f34913s.f35328h.removeMessages(1, this.f34911k);
            this.f34910g = iBinder;
            this.f34912r = componentName;
            for (ServiceConnection onServiceConnected : this.f34907a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f34908d = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f34913s.f35326f) {
            this.f34913s.f35328h.removeMessages(1, this.f34911k);
            this.f34910g = null;
            this.f34912r = componentName;
            for (ServiceConnection onServiceDisconnected : this.f34907a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f34908d = 2;
        }
    }
}
