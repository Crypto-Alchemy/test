package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: os */
/* compiled from: AudioBecomingNoisyManager */
public final class C2988os {

    /* renamed from: a */
    public final Context f16052a;

    /* renamed from: b */
    public final C2989a f16053b;

    /* renamed from: c */
    public boolean f16054c;

    /* renamed from: os$a */
    /* compiled from: AudioBecomingNoisyManager */
    public final class C2989a extends BroadcastReceiver implements Runnable {

        /* renamed from: a */
        public final C2990b f16055a;

        /* renamed from: d */
        public final Handler f16056d;

        public C2989a(Handler handler, C2990b bVar) {
            this.f16056d = handler;
            this.f16055a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16056d.post(this);
            }
        }

        public void run() {
            if (C2988os.this.f16054c) {
                this.f16055a.mo24094g();
            }
        }
    }

    /* renamed from: os$b */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C2990b {
        /* renamed from: g */
        void mo24094g();
    }

    public C2988os(Context context, Handler handler, C2990b bVar) {
        this.f16052a = context.getApplicationContext();
        this.f16053b = new C2989a(handler, bVar);
    }

    /* renamed from: b */
    public void mo24091b(boolean z) {
        if (z && !this.f16054c) {
            this.f16052a.registerReceiver(this.f16053b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f16054c = true;
        } else if (!z && this.f16054c) {
            this.f16052a.unregisterReceiver(this.f16053b);
            this.f16054c = false;
        }
    }
}
