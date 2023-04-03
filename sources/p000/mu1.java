package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: mu1 */
/* compiled from: ExceptionPassthroughInputStream */
public final class mu1 extends InputStream {

    /* renamed from: e */
    public static final Queue<mu1> f15253e = p67.m24678f(0);

    /* renamed from: a */
    public InputStream f15254a;

    /* renamed from: d */
    public IOException f15255d;

    /* renamed from: b */
    public static mu1 m22646b(InputStream inputStream) {
        mu1 poll;
        Queue<mu1> queue = f15253e;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new mu1();
        }
        poll.mo23398d(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException mo23394a() {
        return this.f15255d;
    }

    public int available() throws IOException {
        return this.f15254a.available();
    }

    /* renamed from: c */
    public void mo23396c() {
        this.f15255d = null;
        this.f15254a = null;
        Queue<mu1> queue = f15253e;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void close() throws IOException {
        this.f15254a.close();
    }

    /* renamed from: d */
    public void mo23398d(InputStream inputStream) {
        this.f15254a = inputStream;
    }

    public void mark(int i) {
        this.f15254a.mark(i);
    }

    public boolean markSupported() {
        return this.f15254a.markSupported();
    }

    public int read() throws IOException {
        try {
            return this.f15254a.read();
        } catch (IOException e) {
            this.f15255d = e;
            throw e;
        }
    }

    public synchronized void reset() throws IOException {
        this.f15254a.reset();
    }

    public long skip(long j) throws IOException {
        try {
            return this.f15254a.skip(j);
        } catch (IOException e) {
            this.f15255d = e;
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        try {
            return this.f15254a.read(bArr);
        } catch (IOException e) {
            this.f15255d = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f15254a.read(bArr, i, i2);
        } catch (IOException e) {
            this.f15255d = e;
            throw e;
        }
    }
}
