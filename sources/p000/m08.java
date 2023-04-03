package p000;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: m08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class m08 implements bh4 {

    /* renamed from: a */
    public final bi2 f31465a;

    /* renamed from: b */
    public final int f31466b;

    /* renamed from: c */
    public final C6286nm f31467c;

    /* renamed from: d */
    public final long f31468d;

    /* renamed from: e */
    public final long f31469e;

    public m08(bi2 bi2, int i, C6286nm nmVar, long j, long j2, String str, String str2) {
        this.f31465a = bi2;
        this.f31466b = i;
        this.f31467c = nmVar;
        this.f31468d = j;
        this.f31469e = j2;
    }

    /* renamed from: b */
    public static m08 m48022b(bi2 bi2, int i, C6286nm nmVar) {
        boolean z;
        long j;
        long j2;
        if (!bi2.mo29601f()) {
            return null;
        }
        RootTelemetryConfiguration a = rh5.m51097b().mo47416a();
        if (a == null) {
            z = true;
        } else if (!a.mo30653t1()) {
            return null;
        } else {
            z = a.mo30654u1();
            uz7 w = bi2.mo29609w(nmVar);
            if (w != null) {
                if (!(w.mo48619s() instanceof C6462ry)) {
                    return null;
                }
                C6462ry ryVar = (C6462ry) w.mo48619s();
                if (ryVar.mo47534O() && !ryVar.mo47549e()) {
                    ConnectionTelemetryConfiguration c = m48023c(w, ryVar, i);
                    if (c == null) {
                        return null;
                    }
                    w.mo48593D();
                    z = c.mo30645v1();
                }
            }
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new m08(bi2, i, nmVar, j, j2, (String) null, (String) null);
    }

    /* renamed from: c */
    public static ConnectionTelemetryConfiguration m48023c(uz7 uz7, C6462ry ryVar, int i) {
        int[] s1;
        int[] t1;
        ConnectionTelemetryConfiguration M = ryVar.mo47533M();
        if (M == null || !M.mo30644u1() || ((s1 = M.mo30642s1()) != null ? !C6441rq.m51219b(s1, i) : !((t1 = M.mo30643t1()) == null || !C6441rq.m51219b(t1, i))) || uz7.mo48617p() >= M.mo30641r1()) {
            return null;
        }
        return M;
    }

    /* renamed from: a */
    public final void mo29007a(tl6 tl6) {
        uz7 w;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f31465a.mo29601f()) {
            RootTelemetryConfiguration a = rh5.m51097b().mo47416a();
            if ((a == null || a.mo30653t1()) && (w = this.f31465a.mo29609w(this.f31467c)) != null && (w.mo48619s() instanceof C6462ry)) {
                C6462ry ryVar = (C6462ry) w.mo48619s();
                boolean z2 = true;
                int i7 = 0;
                if (this.f31468d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int E = ryVar.mo47529E();
                if (a != null) {
                    boolean u1 = z & a.mo30654u1();
                    int r1 = a.mo30651r1();
                    int s1 = a.mo30652s1();
                    i3 = a.mo30655v1();
                    if (ryVar.mo47534O() && !ryVar.mo47549e()) {
                        ConnectionTelemetryConfiguration c = m48023c(w, ryVar, this.f31466b);
                        if (c != null) {
                            if (!c.mo30645v1() || this.f31468d <= 0) {
                                z2 = false;
                            }
                            s1 = c.mo30641r1();
                            u1 = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = r1;
                    i = s1;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                bi2 bi2 = this.f31465a;
                if (tl6.mo48145p()) {
                    i4 = 0;
                } else {
                    if (tl6.mo48143n()) {
                        i7 = 100;
                    } else {
                        Exception k = tl6.mo48140k();
                        if (k instanceof ApiException) {
                            Status status = ((ApiException) k).getStatus();
                            int t1 = status.mo30524t1();
                            ConnectionResult r12 = status.mo30522r1();
                            if (r12 == null) {
                                i6 = -1;
                            } else {
                                i6 = r12.mo30457r1();
                            }
                            i4 = i6;
                            i7 = t1;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j3 = this.f31468d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f31469e);
                    j2 = j3;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                bi2.mo29595F(new MethodInvocation(this.f31466b, i7, i4, j2, j, (String) null, (String) null, E, i5), i3, (long) i2, i);
            }
        }
    }
}
