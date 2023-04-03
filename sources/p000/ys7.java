package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ys7 */
public final class ys7 extends ws7 {

    /* renamed from: a */
    public final ws7 f35917a;

    /* renamed from: d */
    public final long f35918d;

    /* renamed from: e */
    public final long f35919e;

    public ys7(ws7 ws7, long j, long j2) {
        this.f35917a = ws7;
        long d = mo49735d(j);
        this.f35918d = d;
        this.f35919e = mo49735d(d + j2);
    }

    /* renamed from: a */
    public final long mo34185a() {
        return this.f35919e - this.f35918d;
    }

    /* renamed from: b */
    public final InputStream mo34186b(long j, long j2) throws IOException {
        long d = mo49735d(this.f35918d);
        return this.f35917a.mo34186b(d, mo49735d(j2 + d) - d);
    }

    public final void close() throws IOException {
    }

    /* renamed from: d */
    public final long mo49735d(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f35917a.mo34185a() ? this.f35917a.mo34185a() : j;
    }
}
