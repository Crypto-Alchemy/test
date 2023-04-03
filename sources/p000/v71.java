package p000;

import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: v71 */
/* compiled from: DefaultEbmlReader */
public final class v71 implements an1 {

    /* renamed from: a */
    public final byte[] f18701a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<C3471b> f18702b = new ArrayDeque<>();

    /* renamed from: c */
    public final q87 f18703c = new q87();

    /* renamed from: d */
    public zm1 f18704d;

    /* renamed from: e */
    public int f18705e;

    /* renamed from: f */
    public int f18706f;

    /* renamed from: g */
    public long f18707g;

    /* renamed from: v71$b */
    /* compiled from: DefaultEbmlReader */
    public static final class C3471b {

        /* renamed from: a */
        public final int f18708a;

        /* renamed from: b */
        public final long f18709b;

        public C3471b(int i, long j) {
            this.f18708a = i;
            this.f18709b = j;
        }
    }

    /* renamed from: f */
    public static String m28681f(iy1 iy1, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        iy1.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public void mo424a(zm1 zm1) {
        this.f18704d = zm1;
    }

    /* renamed from: b */
    public boolean mo425b(iy1 iy1) throws IOException {
        C2725kr.m20989i(this.f18704d);
        while (true) {
            C3471b peek = this.f18702b.peek();
            if (peek == null || iy1.getPosition() < peek.f18709b) {
                if (this.f18705e == 0) {
                    long d = this.f18703c.mo25039d(iy1, true, false, 4);
                    if (d == -2) {
                        d = mo27078c(iy1);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f18706f = (int) d;
                    this.f18705e = 1;
                }
                if (this.f18705e == 1) {
                    this.f18707g = this.f18703c.mo25039d(iy1, false, true, 8);
                    this.f18705e = 2;
                }
                int e = this.f18704d.mo23269e(this.f18706f);
                if (e == 0) {
                    iy1.mo92k((int) this.f18707g);
                    this.f18705e = 0;
                } else if (e == 1) {
                    long position = iy1.getPosition();
                    this.f18702b.push(new C3471b(this.f18706f, this.f18707g + position));
                    this.f18704d.mo23272h(this.f18706f, position, this.f18707g);
                    this.f18705e = 0;
                    return true;
                } else if (e == 2) {
                    long j = this.f18707g;
                    if (j <= 8) {
                        this.f18704d.mo23268d(this.f18706f, mo27080e(iy1, (int) j));
                        this.f18705e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f18707g, (Throwable) null);
                } else if (e == 3) {
                    long j2 = this.f18707g;
                    if (j2 <= 2147483647L) {
                        this.f18704d.mo23271g(this.f18706f, m28681f(iy1, (int) j2));
                        this.f18705e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.f18707g, (Throwable) null);
                } else if (e == 4) {
                    this.f18704d.mo23267c(this.f18706f, (int) this.f18707g, iy1);
                    this.f18705e = 0;
                    return true;
                } else if (e == 5) {
                    long j3 = this.f18707g;
                    if (j3 == 4 || j3 == 8) {
                        this.f18704d.mo23266b(this.f18706f, mo27079d(iy1, (int) j3));
                        this.f18705e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid float size: " + this.f18707g, (Throwable) null);
                } else {
                    throw ParserException.createForMalformedContainer("Invalid element type " + e, (Throwable) null);
                }
            } else {
                this.f18704d.mo23265a(this.f18702b.pop().f18708a);
                return true;
            }
        }
    }

    @RequiresNonNull({"processor"})
    /* renamed from: c */
    public final long mo27078c(iy1 iy1) throws IOException {
        iy1.mo85e();
        while (true) {
            iy1.mo94n(this.f18701a, 0, 4);
            int c = q87.m25551c(this.f18701a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) q87.m25550a(this.f18701a, c, false);
                if (this.f18704d.mo23270f(a)) {
                    iy1.mo92k(c);
                    return (long) a;
                }
            }
            iy1.mo92k(1);
        }
    }

    /* renamed from: d */
    public final double mo27079d(iy1 iy1, int i) throws IOException {
        long e = mo27080e(iy1, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) e);
        }
        return Double.longBitsToDouble(e);
    }

    /* renamed from: e */
    public final long mo27080e(iy1 iy1, int i) throws IOException {
        iy1.readFully(this.f18701a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f18701a[i2] & 255));
        }
        return j;
    }

    public void reset() {
        this.f18705e = 0;
        this.f18702b.clear();
        this.f18703c.mo25040e();
    }
}
