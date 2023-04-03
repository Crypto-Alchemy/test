package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ie5 */
/* compiled from: RequestLimiter */
public class ie5 {

    /* renamed from: d */
    public static final long f29907d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f29908e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final p77 f29909a = p77.m49814c();

    /* renamed from: b */
    public long f29910b;

    /* renamed from: c */
    public int f29911c;

    /* renamed from: c */
    public static boolean m45700c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m45701d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long mo43580a(int i) {
        if (!m45700c(i)) {
            return f29907d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f29911c) + ((double) this.f29909a.mo46660e()), (double) f29908e);
    }

    /* renamed from: b */
    public synchronized boolean mo43581b() {
        boolean z;
        if (this.f29911c == 0 || this.f29909a.mo46658a() > this.f29910b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public final synchronized void mo43582e() {
        this.f29911c = 0;
    }

    /* renamed from: f */
    public synchronized void mo43583f(int i) {
        if (m45701d(i)) {
            mo43582e();
            return;
        }
        this.f29911c++;
        this.f29910b = this.f29909a.mo46658a() + mo43580a(i);
    }
}
