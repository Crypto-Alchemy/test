package p000;

import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: y81 */
/* compiled from: DefaultLoadControl */
public class y81 implements ti3 {

    /* renamed from: a */
    public final s31 f20080a;

    /* renamed from: b */
    public final long f20081b;

    /* renamed from: c */
    public final long f20082c;

    /* renamed from: d */
    public final long f20083d;

    /* renamed from: e */
    public final long f20084e;

    /* renamed from: f */
    public final int f20085f;

    /* renamed from: g */
    public final boolean f20086g;

    /* renamed from: h */
    public final long f20087h;

    /* renamed from: i */
    public final boolean f20088i;

    /* renamed from: j */
    public int f20089j;

    /* renamed from: k */
    public boolean f20090k;

    public y81() {
        this(new s31(true, 65536), SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, 5000, -1, false, 0, false);
    }

    /* renamed from: j */
    public static void m30463j(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20982b(z, str + " cannot be less than " + str2);
    }

    /* renamed from: l */
    public static int m30464l(int i) {
        switch (i) {
            case -2:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public boolean mo26450a() {
        return this.f20088i;
    }

    /* renamed from: b */
    public long mo26451b() {
        return this.f20087h;
    }

    /* renamed from: c */
    public void mo26452c() {
        mo27986m(false);
    }

    /* renamed from: d */
    public boolean mo26453d(long j, float f, boolean z, long j2) {
        long j3;
        long b0 = w67.m29345b0(j, f);
        if (z) {
            j3 = this.f20084e;
        } else {
            j3 = this.f20083d;
        }
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 <= 0 || b0 >= j3 || (!this.f20086g && this.f20080a.mo25622f() >= this.f20089j)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public C2891nf mo26454e() {
        return this.f20080a;
    }

    /* renamed from: f */
    public void mo26455f() {
        mo27986m(true);
    }

    /* renamed from: g */
    public void mo26456g(md5[] md5Arr, ws6 ws6, dx1[] dx1Arr) {
        int i = this.f20085f;
        if (i == -1) {
            i = mo27985k(md5Arr, dx1Arr);
        }
        this.f20089j = i;
        this.f20080a.mo25624h(i);
    }

    /* renamed from: h */
    public void mo26457h() {
        mo27986m(true);
    }

    /* renamed from: i */
    public boolean mo26458i(long j, long j2, float f) {
        boolean z;
        boolean z2 = true;
        if (this.f20080a.mo25622f() >= this.f20089j) {
            z = true;
        } else {
            z = false;
        }
        long j3 = this.f20081b;
        if (f > 1.0f) {
            j3 = Math.min(w67.m29338W(j3, f), this.f20082c);
        }
        if (j2 < Math.max(j3, 500000)) {
            if (!this.f20086g && z) {
                z2 = false;
            }
            this.f20090k = z2;
            if (!z2 && j2 < 500000) {
                gk3.m18132i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f20082c || z) {
            this.f20090k = false;
        }
        return this.f20090k;
    }

    /* renamed from: k */
    public int mo27985k(md5[] md5Arr, dx1[] dx1Arr) {
        int i = 0;
        for (int i2 = 0; i2 < md5Arr.length; i2++) {
            if (dx1Arr[i2] != null) {
                i += m30464l(md5Arr[i2].mo21684f());
            }
        }
        return Math.max(13107200, i);
    }

    /* renamed from: m */
    public final void mo27986m(boolean z) {
        int i = this.f20085f;
        if (i == -1) {
            i = 13107200;
        }
        this.f20089j = i;
        this.f20090k = false;
        if (z) {
            this.f20080a.mo25623g();
        }
    }

    public y81(s31 s31, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m30463j(i3, 0, "bufferForPlaybackMs", "0");
        m30463j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m30463j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m30463j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m30463j(i2, i, "maxBufferMs", "minBufferMs");
        m30463j(i6, 0, "backBufferDurationMs", "0");
        this.f20080a = s31;
        this.f20081b = w67.m29391y0((long) i);
        this.f20082c = w67.m29391y0((long) i2);
        this.f20083d = w67.m29391y0((long) i3);
        this.f20084e = w67.m29391y0((long) i4);
        this.f20085f = i5;
        this.f20089j = i5 == -1 ? 13107200 : i5;
        this.f20086g = z;
        this.f20087h = w67.m29391y0((long) i6);
        this.f20088i = z2;
    }
}
