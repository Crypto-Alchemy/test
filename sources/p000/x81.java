package p000;

import android.os.SystemClock;
import androidx.media3.common.C0798k;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: x81 */
/* compiled from: DefaultLivePlaybackSpeedControl */
public final class x81 implements qi3 {

    /* renamed from: a */
    public final float f19465a;

    /* renamed from: b */
    public final float f19466b;

    /* renamed from: c */
    public final long f19467c;

    /* renamed from: d */
    public final float f19468d;

    /* renamed from: e */
    public final long f19469e;

    /* renamed from: f */
    public final long f19470f;

    /* renamed from: g */
    public final float f19471g;

    /* renamed from: h */
    public long f19472h;

    /* renamed from: i */
    public long f19473i;

    /* renamed from: j */
    public long f19474j;

    /* renamed from: k */
    public long f19475k;

    /* renamed from: l */
    public long f19476l;

    /* renamed from: m */
    public long f19477m;

    /* renamed from: n */
    public float f19478n;

    /* renamed from: o */
    public float f19479o;

    /* renamed from: p */
    public float f19480p;

    /* renamed from: q */
    public long f19481q;

    /* renamed from: r */
    public long f19482r;

    /* renamed from: s */
    public long f19483s;

    /* renamed from: x81$b */
    /* compiled from: DefaultLivePlaybackSpeedControl */
    public static final class C3580b {

        /* renamed from: a */
        public float f19484a = 0.97f;

        /* renamed from: b */
        public float f19485b = 1.03f;

        /* renamed from: c */
        public long f19486c = 1000;

        /* renamed from: d */
        public float f19487d = 1.0E-7f;

        /* renamed from: e */
        public long f19488e = w67.m29391y0(20);

        /* renamed from: f */
        public long f19489f = w67.m29391y0(500);

        /* renamed from: g */
        public float f19490g = 0.999f;

        /* renamed from: a */
        public x81 mo27697a() {
            return new x81(this.f19484a, this.f19485b, this.f19486c, this.f19487d, this.f19488e, this.f19489f, this.f19490g);
        }
    }

    /* renamed from: h */
    public static long m29935h(long j, long j2, float f) {
        return (long) ((((float) j) * f) + ((1.0f - f) * ((float) j2)));
    }

    /* renamed from: a */
    public void mo25112a(C0798k.C0807g gVar) {
        this.f19472h = w67.m29391y0(gVar.f4297a);
        this.f19475k = w67.m29391y0(gVar.f4298d);
        this.f19476l = w67.m29391y0(gVar.f4299e);
        float f = gVar.f4300g;
        if (f == -3.4028235E38f) {
            f = this.f19465a;
        }
        this.f19479o = f;
        float f2 = gVar.f4301k;
        if (f2 == -3.4028235E38f) {
            f2 = this.f19466b;
        }
        this.f19478n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f19472h = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        mo27695g();
    }

    /* renamed from: b */
    public float mo25113b(long j, long j2) {
        if (this.f19472h == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return 1.0f;
        }
        mo27696i(j, j2);
        if (this.f19481q != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && SystemClock.elapsedRealtime() - this.f19481q < this.f19467c) {
            return this.f19480p;
        }
        this.f19481q = SystemClock.elapsedRealtime();
        mo27694f(j);
        long j3 = j - this.f19477m;
        if (Math.abs(j3) < this.f19469e) {
            this.f19480p = 1.0f;
        } else {
            this.f19480p = w67.m29372p((this.f19468d * ((float) j3)) + 1.0f, this.f19479o, this.f19478n);
        }
        return this.f19480p;
    }

    /* renamed from: c */
    public long mo25114c() {
        return this.f19477m;
    }

    /* renamed from: d */
    public void mo25115d() {
        long j = this.f19477m;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            long j2 = j + this.f19470f;
            this.f19477m = j2;
            long j3 = this.f19476l;
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j2 > j3) {
                this.f19477m = j3;
            }
            this.f19481q = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: e */
    public void mo25116e(long j) {
        this.f19473i = j;
        mo27695g();
    }

    /* renamed from: f */
    public final void mo27694f(long j) {
        long j2 = this.f19482r + (this.f19483s * 3);
        if (this.f19477m > j2) {
            float y0 = (float) w67.m29391y0(this.f19467c);
            this.f19477m = ll3.m47835c(j2, this.f19474j, this.f19477m - (((long) ((this.f19480p - 1.0f) * y0)) + ((long) ((this.f19478n - 1.0f) * y0))));
            return;
        }
        long r = w67.m29376r(j - ((long) (Math.max(Utils.FLOAT_EPSILON, this.f19480p - 1.0f) / this.f19468d)), this.f19477m, j2);
        this.f19477m = r;
        long j3 = this.f19476l;
        if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && r > j3) {
            this.f19477m = j3;
        }
    }

    /* renamed from: g */
    public final void mo27695g() {
        long j = this.f19472h;
        if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            long j2 = this.f19473i;
            if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                j = j2;
            }
            long j3 = this.f19475k;
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j < j3) {
                j = j3;
            }
            long j4 = this.f19476l;
            if (j4 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f19474j != j) {
            this.f19474j = j;
            this.f19477m = j;
            this.f19482r = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            this.f19483s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            this.f19481q = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: i */
    public final void mo27696i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f19482r;
        if (j4 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            this.f19482r = j3;
            this.f19483s = 0;
            return;
        }
        long max = Math.max(j3, m29935h(j4, j3, this.f19471g));
        this.f19482r = max;
        this.f19483s = m29935h(this.f19483s, Math.abs(j3 - max), this.f19471g);
    }

    public x81(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f19465a = f;
        this.f19466b = f2;
        this.f19467c = j;
        this.f19468d = f3;
        this.f19469e = j2;
        this.f19470f = j3;
        this.f19471g = f4;
        this.f19472h = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19473i = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19475k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19476l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19479o = f;
        this.f19478n = f2;
        this.f19480p = 1.0f;
        this.f19481q = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19474j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19477m = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19482r = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f19483s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
