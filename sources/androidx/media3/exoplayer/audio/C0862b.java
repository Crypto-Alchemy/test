package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: androidx.media3.exoplayer.audio.b */
/* compiled from: AudioTrackPositionTracker */
public final class C0862b {

    /* renamed from: A */
    public long f4695A;

    /* renamed from: B */
    public long f4696B;

    /* renamed from: C */
    public long f4697C;

    /* renamed from: D */
    public boolean f4698D;

    /* renamed from: E */
    public long f4699E;

    /* renamed from: F */
    public long f4700F;

    /* renamed from: a */
    public final C0863a f4701a;

    /* renamed from: b */
    public final long[] f4702b;

    /* renamed from: c */
    public AudioTrack f4703c;

    /* renamed from: d */
    public int f4704d;

    /* renamed from: e */
    public int f4705e;

    /* renamed from: f */
    public C2425gt f4706f;

    /* renamed from: g */
    public int f4707g;

    /* renamed from: h */
    public boolean f4708h;

    /* renamed from: i */
    public long f4709i;

    /* renamed from: j */
    public float f4710j;

    /* renamed from: k */
    public boolean f4711k;

    /* renamed from: l */
    public long f4712l;

    /* renamed from: m */
    public long f4713m;

    /* renamed from: n */
    public Method f4714n;

    /* renamed from: o */
    public long f4715o;

    /* renamed from: p */
    public boolean f4716p;

    /* renamed from: q */
    public boolean f4717q;

    /* renamed from: r */
    public long f4718r;

    /* renamed from: s */
    public long f4719s;

    /* renamed from: t */
    public long f4720t;

    /* renamed from: u */
    public long f4721u;

    /* renamed from: v */
    public int f4722v;

    /* renamed from: w */
    public int f4723w;

    /* renamed from: x */
    public long f4724x;

    /* renamed from: y */
    public long f4725y;

    /* renamed from: z */
    public long f4726z;

    /* renamed from: androidx.media3.exoplayer.audio.b$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface C0863a {
        /* renamed from: a */
        void mo7071a(long j);

        /* renamed from: b */
        void mo7072b(int i, long j);

        /* renamed from: c */
        void mo7073c(long j);

        /* renamed from: d */
        void mo7074d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo7075e(long j, long j2, long j3, long j4);
    }

    public C0862b(C0863a aVar) {
        this.f4701a = (C0863a) C2725kr.m20985e(aVar);
        if (w67.f19021a >= 18) {
            try {
                this.f4714n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f4702b = new long[10];
    }

    /* renamed from: o */
    public static boolean m6150o(int i) {
        if (w67.f19021a >= 23 || (i != 5 && i != 6)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo7101a() {
        if (this.f4708h && ((AudioTrack) C2725kr.m20985e(this.f4703c)).getPlayState() == 2 && mo7105e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final long mo7102b(long j) {
        return (j * 1000000) / ((long) this.f4707g);
    }

    /* renamed from: c */
    public int mo7103c(long j) {
        return this.f4705e - ((int) (j - (mo7105e() * ((long) this.f4704d))));
    }

    /* renamed from: d */
    public long mo7104d(boolean z) {
        long j;
        if (((AudioTrack) C2725kr.m20985e(this.f4703c)).getPlayState() == 3) {
            mo7113m();
        }
        long nanoTime = System.nanoTime() / 1000;
        C2425gt gtVar = (C2425gt) C2725kr.m20985e(this.f4706f);
        boolean d = gtVar.mo20832d();
        if (d) {
            j = mo7102b(gtVar.mo20830b()) + w67.m29338W(nanoTime - gtVar.mo20831c(), this.f4710j);
        } else {
            if (this.f4723w == 0) {
                j = mo7106f();
            } else {
                j = this.f4712l + nanoTime;
            }
            if (!z) {
                j = Math.max(0, j - this.f4715o);
            }
        }
        if (this.f4698D != d) {
            this.f4700F = this.f4697C;
            this.f4699E = this.f4696B;
        }
        long j2 = nanoTime - this.f4700F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f4699E + w67.m29338W(j2, this.f4710j)))) / 1000;
        }
        if (!this.f4711k) {
            long j4 = this.f4696B;
            if (j > j4) {
                this.f4711k = true;
                this.f4701a.mo7071a(System.currentTimeMillis() - w67.m29335U0(w67.m29345b0(w67.m29335U0(j - j4), this.f4710j)));
            }
        }
        this.f4697C = nanoTime;
        this.f4696B = j;
        this.f4698D = d;
        return j;
    }

    /* renamed from: e */
    public final long mo7105e() {
        AudioTrack audioTrack = (AudioTrack) C2725kr.m20985e(this.f4703c);
        if (this.f4724x != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return Math.min(this.f4695A, this.f4726z + ((((SystemClock.elapsedRealtime() * 1000) - this.f4724x) * ((long) this.f4707g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f4708h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f4721u = this.f4719s;
            }
            playbackHeadPosition += this.f4721u;
        }
        if (w67.f19021a <= 29) {
            if (playbackHeadPosition == 0 && this.f4719s > 0 && playState == 3) {
                if (this.f4725y == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    this.f4725y = SystemClock.elapsedRealtime();
                }
                return this.f4719s;
            }
            this.f4725y = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        if (this.f4719s > playbackHeadPosition) {
            this.f4720t++;
        }
        this.f4719s = playbackHeadPosition;
        return playbackHeadPosition + (this.f4720t << 32);
    }

    /* renamed from: f */
    public final long mo7106f() {
        return mo7102b(mo7105e());
    }

    /* renamed from: g */
    public void mo7107g(long j) {
        this.f4726z = mo7105e();
        this.f4724x = SystemClock.elapsedRealtime() * 1000;
        this.f4695A = j;
    }

    /* renamed from: h */
    public boolean mo7108h(long j) {
        if (j > mo7105e() || mo7101a()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo7109i() {
        if (((AudioTrack) C2725kr.m20985e(this.f4703c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo7110j(long j) {
        if (this.f4725y == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j <= 0 || SystemClock.elapsedRealtime() - this.f4725y < 200) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo7111k(long j) {
        int playState = ((AudioTrack) C2725kr.m20985e(this.f4703c)).getPlayState();
        if (this.f4708h) {
            if (playState == 2) {
                this.f4716p = false;
                return false;
            } else if (playState == 1 && mo7105e() == 0) {
                return false;
            }
        }
        boolean z = this.f4716p;
        boolean h = mo7108h(j);
        this.f4716p = h;
        if (z && !h && playState != 1) {
            this.f4701a.mo7072b(this.f4705e, w67.m29335U0(this.f4709i));
        }
        return true;
    }

    /* renamed from: l */
    public final void mo7112l(long j, long j2) {
        C2425gt gtVar = (C2425gt) C2725kr.m20985e(this.f4706f);
        if (gtVar.mo20833e(j)) {
            long c = gtVar.mo20831c();
            long b = gtVar.mo20830b();
            if (Math.abs(c - j) > 5000000) {
                this.f4701a.mo7075e(b, c, j, j2);
                gtVar.mo20834f();
            } else if (Math.abs(mo7102b(b) - j2) > 5000000) {
                this.f4701a.mo7074d(b, c, j, j2);
                gtVar.mo20834f();
            } else {
                gtVar.mo20829a();
            }
        }
    }

    /* renamed from: m */
    public final void mo7113m() {
        long f = mo7106f();
        if (f != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f4713m >= 30000) {
                long[] jArr = this.f4702b;
                int i = this.f4722v;
                jArr[i] = f - nanoTime;
                this.f4722v = (i + 1) % 10;
                int i2 = this.f4723w;
                if (i2 < 10) {
                    this.f4723w = i2 + 1;
                }
                this.f4713m = nanoTime;
                this.f4712l = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f4723w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f4712l += this.f4702b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f4708h) {
                mo7112l(nanoTime, f);
                mo7114n(nanoTime);
            }
        }
    }

    /* renamed from: n */
    public final void mo7114n(long j) {
        Method method;
        if (this.f4717q && (method = this.f4714n) != null && j - this.f4718r >= 500000) {
            try {
                long intValue = (((long) ((Integer) w67.m29360j((Integer) method.invoke(C2725kr.m20985e(this.f4703c), new Object[0]))).intValue()) * 1000) - this.f4709i;
                this.f4715o = intValue;
                long max = Math.max(intValue, 0);
                this.f4715o = max;
                if (max > 5000000) {
                    this.f4701a.mo7073c(max);
                    this.f4715o = 0;
                }
            } catch (Exception unused) {
                this.f4714n = null;
            }
            this.f4718r = j;
        }
    }

    /* renamed from: p */
    public boolean mo7115p() {
        mo7117r();
        if (this.f4724x != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return false;
        }
        ((C2425gt) C2725kr.m20985e(this.f4706f)).mo20835g();
        return true;
    }

    /* renamed from: q */
    public void mo7116q() {
        mo7117r();
        this.f4703c = null;
        this.f4706f = null;
    }

    /* renamed from: r */
    public final void mo7117r() {
        this.f4712l = 0;
        this.f4723w = 0;
        this.f4722v = 0;
        this.f4713m = 0;
        this.f4697C = 0;
        this.f4700F = 0;
        this.f4711k = false;
    }

    /* renamed from: s */
    public void mo7118s(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        long j;
        this.f4703c = audioTrack;
        this.f4704d = i2;
        this.f4705e = i3;
        this.f4706f = new C2425gt(audioTrack);
        this.f4707g = audioTrack.getSampleRate();
        if (!z || !m6150o(i)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f4708h = z2;
        boolean q0 = w67.m29375q0(i);
        this.f4717q = q0;
        if (q0) {
            j = mo7102b((long) (i3 / i2));
        } else {
            j = -9223372036854775807L;
        }
        this.f4709i = j;
        this.f4719s = 0;
        this.f4720t = 0;
        this.f4721u = 0;
        this.f4716p = false;
        this.f4724x = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4725y = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4718r = 0;
        this.f4715o = 0;
        this.f4710j = 1.0f;
    }

    /* renamed from: t */
    public void mo7119t(float f) {
        this.f4710j = f;
        C2425gt gtVar = this.f4706f;
        if (gtVar != null) {
            gtVar.mo20835g();
        }
    }

    /* renamed from: u */
    public void mo7120u() {
        ((C2425gt) C2725kr.m20985e(this.f4706f)).mo20835g();
    }
}
