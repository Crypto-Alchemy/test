package p000;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.common.C0778b;

/* renamed from: us */
/* compiled from: AudioFocusManager */
public final class C3428us {

    /* renamed from: a */
    public final AudioManager f18561a;

    /* renamed from: b */
    public final C3429a f18562b;

    /* renamed from: c */
    public C3430b f18563c;

    /* renamed from: d */
    public C0778b f18564d;

    /* renamed from: e */
    public int f18565e;

    /* renamed from: f */
    public int f18566f;

    /* renamed from: g */
    public float f18567g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f18568h;

    /* renamed from: i */
    public boolean f18569i;

    /* renamed from: us$a */
    /* compiled from: AudioFocusManager */
    public class C3429a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f18570a;

        public C3429a(Handler handler) {
            this.f18570a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m28408b(int i) {
            C3428us.this.mo26855h(i);
        }

        public void onAudioFocusChange(int i) {
            this.f18570a.post(new C3382ts(this, i));
        }
    }

    /* renamed from: us$b */
    /* compiled from: AudioFocusManager */
    public interface C3430b {
        /* renamed from: F */
        void mo24170F(float f);

        /* renamed from: G */
        void mo24171G(int i);
    }

    public C3428us(Context context, Handler handler, C3430b bVar) {
        this.f18561a = (AudioManager) C2725kr.m20985e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f18563c = bVar;
        this.f18562b = new C3429a(handler);
        this.f18565e = 0;
    }

    /* renamed from: e */
    public static int m28391e(C0778b bVar) {
        if (bVar == null) {
            return 0;
        }
        switch (bVar.f4146e) {
            case 0:
                gk3.m18132i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (bVar.f4144a == 1) {
                    return 2;
                }
                break;
            case 16:
                if (w67.f19021a >= 19) {
                    return 4;
                }
                return 2;
            default:
                gk3.m18132i("AudioFocusManager", "Unidentified audio usage: " + bVar.f4146e);
                return 0;
        }
        return 3;
    }

    /* renamed from: a */
    public final void mo26850a() {
        this.f18561a.abandonAudioFocus(this.f18562b);
    }

    /* renamed from: b */
    public final void mo26851b() {
        if (this.f18565e != 0) {
            if (w67.f19021a >= 26) {
                mo26852c();
            } else {
                mo26850a();
            }
            mo26861n(0);
        }
    }

    /* renamed from: c */
    public final void mo26852c() {
        AudioFocusRequest audioFocusRequest = this.f18568h;
        if (audioFocusRequest != null) {
            int unused = this.f18561a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: f */
    public final void mo26853f(int i) {
        C3430b bVar = this.f18563c;
        if (bVar != null) {
            bVar.mo24171G(i);
        }
    }

    /* renamed from: g */
    public float mo26854g() {
        return this.f18567g;
    }

    /* renamed from: h */
    public final void mo26855h(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || mo26864q()) {
                mo26853f(0);
                mo26861n(2);
                return;
            }
            mo26861n(3);
        } else if (i == -1) {
            mo26853f(-1);
            mo26851b();
        } else if (i != 1) {
            gk3.m18132i("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            mo26861n(1);
            mo26853f(1);
        }
    }

    /* renamed from: i */
    public void mo26856i() {
        this.f18563c = null;
        mo26851b();
    }

    /* renamed from: j */
    public final int mo26857j() {
        int i;
        if (this.f18565e == 1) {
            return 1;
        }
        if (w67.f19021a >= 26) {
            i = mo26859l();
        } else {
            i = mo26858k();
        }
        if (i == 1) {
            mo26861n(1);
            return 1;
        }
        mo26861n(0);
        return -1;
    }

    /* renamed from: k */
    public final int mo26858k() {
        return this.f18561a.requestAudioFocus(this.f18562b, w67.m29347c0(((C0778b) C2725kr.m20985e(this.f18564d)).f4146e), this.f18566f);
    }

    /* renamed from: l */
    public final int mo26859l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.f18568h;
        if (audioFocusRequest == null || this.f18569i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f18566f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f18568h);
            }
            this.f18568h = builder.setAudioAttributes(((C0778b) C2725kr.m20985e(this.f18564d)).mo6586b().f4150a).setWillPauseWhenDucked(mo26864q()).setOnAudioFocusChangeListener(this.f18562b).build();
            this.f18569i = false;
        }
        return this.f18561a.requestAudioFocus(this.f18568h);
    }

    /* renamed from: m */
    public void mo26860m(C0778b bVar) {
        if (!w67.m29346c(this.f18564d, bVar)) {
            this.f18564d = bVar;
            int e = m28391e(bVar);
            this.f18566f = e;
            boolean z = true;
            if (!(e == 1 || e == 0)) {
                z = false;
            }
            C2725kr.m20982b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: n */
    public final void mo26861n(int i) {
        float f;
        if (this.f18565e != i) {
            this.f18565e = i;
            if (i == 3) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.f18567g != f) {
                this.f18567g = f;
                C3430b bVar = this.f18563c;
                if (bVar != null) {
                    bVar.mo24170F(f);
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean mo26862o(int i) {
        if (i == 1 || this.f18566f != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public int mo26863p(boolean z, int i) {
        if (mo26862o(i)) {
            mo26851b();
            if (z) {
                return 1;
            }
            return -1;
        } else if (z) {
            return mo26857j();
        } else {
            return -1;
        }
    }

    /* renamed from: q */
    public final boolean mo26864q() {
        C0778b bVar = this.f18564d;
        if (bVar == null || bVar.f4144a != 1) {
            return false;
        }
        return true;
    }
}
