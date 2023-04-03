package p000;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: gt */
/* compiled from: AudioTimestampPoller */
public final class C2425gt {

    /* renamed from: a */
    public final C2426a f12594a;

    /* renamed from: b */
    public int f12595b;

    /* renamed from: c */
    public long f12596c;

    /* renamed from: d */
    public long f12597d;

    /* renamed from: e */
    public long f12598e;

    /* renamed from: f */
    public long f12599f;

    /* renamed from: gt$a */
    /* compiled from: AudioTimestampPoller */
    public static final class C2426a {

        /* renamed from: a */
        public final AudioTrack f12600a;

        /* renamed from: b */
        public final AudioTimestamp f12601b = new AudioTimestamp();

        /* renamed from: c */
        public long f12602c;

        /* renamed from: d */
        public long f12603d;

        /* renamed from: e */
        public long f12604e;

        public C2426a(AudioTrack audioTrack) {
            this.f12600a = audioTrack;
        }

        /* renamed from: a */
        public long mo20837a() {
            return this.f12604e;
        }

        /* renamed from: b */
        public long mo20838b() {
            return this.f12601b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo20839c() {
            boolean timestamp = this.f12600a.getTimestamp(this.f12601b);
            if (timestamp) {
                long j = this.f12601b.framePosition;
                if (this.f12603d > j) {
                    this.f12602c++;
                }
                this.f12603d = j;
                this.f12604e = j + (this.f12602c << 32);
            }
            return timestamp;
        }
    }

    public C2425gt(AudioTrack audioTrack) {
        if (w67.f19021a >= 19) {
            this.f12594a = new C2426a(audioTrack);
            mo20835g();
            return;
        }
        this.f12594a = null;
        mo20836h(3);
    }

    /* renamed from: a */
    public void mo20829a() {
        if (this.f12595b == 4) {
            mo20835g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long mo20830b() {
        C2426a aVar = this.f12594a;
        if (aVar != null) {
            return aVar.mo20837a();
        }
        return -1;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long mo20831c() {
        C2426a aVar = this.f12594a;
        if (aVar != null) {
            return aVar.mo20838b();
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: d */
    public boolean mo20832d() {
        if (this.f12595b == 2) {
            return true;
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: e */
    public boolean mo20833e(long j) {
        C2426a aVar = this.f12594a;
        if (aVar == null || j - this.f12598e < this.f12597d) {
            return false;
        }
        this.f12598e = j;
        boolean c = aVar.mo20839c();
        int i = this.f12595b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo20835g();
                    }
                } else if (!c) {
                    mo20835g();
                }
            } else if (!c) {
                mo20835g();
            } else if (this.f12594a.mo20837a() > this.f12599f) {
                mo20836h(2);
            }
        } else if (c) {
            if (this.f12594a.mo20838b() < this.f12596c) {
                return false;
            }
            this.f12599f = this.f12594a.mo20837a();
            mo20836h(1);
        } else if (j - this.f12596c > 500000) {
            mo20836h(3);
        }
        return c;
    }

    /* renamed from: f */
    public void mo20834f() {
        mo20836h(4);
    }

    /* renamed from: g */
    public void mo20835g() {
        if (this.f12594a != null) {
            mo20836h(0);
        }
    }

    /* renamed from: h */
    public final void mo20836h(int i) {
        this.f12595b = i;
        if (i == 0) {
            this.f12598e = 0;
            this.f12599f = -1;
            this.f12596c = System.nanoTime() / 1000;
            this.f12597d = 10000;
        } else if (i == 1) {
            this.f12597d = 10000;
        } else if (i == 2 || i == 3) {
            this.f12597d = 10000000;
        } else if (i == 4) {
            this.f12597d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
