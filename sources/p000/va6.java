package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: va6 */
/* compiled from: StreamVolumeManager */
public final class va6 {

    /* renamed from: a */
    public final Context f18720a;

    /* renamed from: b */
    public final Handler f18721b;

    /* renamed from: c */
    public final C3477b f18722c;

    /* renamed from: d */
    public final AudioManager f18723d;

    /* renamed from: e */
    public C3478c f18724e;

    /* renamed from: f */
    public int f18725f = 3;

    /* renamed from: g */
    public int f18726g;

    /* renamed from: h */
    public boolean f18727h;

    /* renamed from: va6$b */
    /* compiled from: StreamVolumeManager */
    public interface C3477b {
        /* renamed from: a */
        void mo24172a(int i);

        /* renamed from: w */
        void mo24191w(int i, boolean z);
    }

    /* renamed from: va6$c */
    /* compiled from: StreamVolumeManager */
    public final class C3478c extends BroadcastReceiver {
        public C3478c() {
        }

        public void onReceive(Context context, Intent intent) {
            va6.this.f18721b.post(new wa6(va6.this));
        }
    }

    public va6(Context context, Handler handler, C3477b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18720a = applicationContext;
        this.f18721b = handler;
        this.f18722c = bVar;
        AudioManager audioManager = (AudioManager) C2725kr.m20989i((AudioManager) applicationContext.getSystemService("audio"));
        this.f18723d = audioManager;
        this.f18726g = m28711f(audioManager, 3);
        this.f18727h = m28710e(audioManager, this.f18725f);
        C3478c cVar = new C3478c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f18724e = cVar;
        } catch (RuntimeException e) {
            gk3.m18133j("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: e */
    public static boolean m28710e(AudioManager audioManager, int i) {
        if (w67.f19021a >= 23) {
            return audioManager.isStreamMute(i);
        }
        if (m28711f(audioManager, i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m28711f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            gk3.m18133j("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: c */
    public int mo27087c() {
        return this.f18723d.getStreamMaxVolume(this.f18725f);
    }

    /* renamed from: d */
    public int mo27088d() {
        if (w67.f19021a >= 28) {
            return this.f18723d.getStreamMinVolume(this.f18725f);
        }
        return 0;
    }

    /* renamed from: g */
    public void mo27089g() {
        C3478c cVar = this.f18724e;
        if (cVar != null) {
            try {
                this.f18720a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                gk3.m18133j("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f18724e = null;
        }
    }

    /* renamed from: h */
    public void mo27090h(int i) {
        if (this.f18725f != i) {
            this.f18725f = i;
            mo27091i();
            this.f18722c.mo24172a(i);
        }
    }

    /* renamed from: i */
    public final void mo27091i() {
        int f = m28711f(this.f18723d, this.f18725f);
        boolean e = m28710e(this.f18723d, this.f18725f);
        if (this.f18726g != f || this.f18727h != e) {
            this.f18726g = f;
            this.f18727h = e;
            this.f18722c.mo24191w(f, e);
        }
    }
}
