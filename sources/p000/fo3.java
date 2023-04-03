package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: fo3 */
/* compiled from: MarkableInputStream */
public final class fo3 extends InputStream {

    /* renamed from: a */
    public final InputStream f28921a;

    /* renamed from: d */
    public long f28922d;

    /* renamed from: e */
    public long f28923e;

    /* renamed from: g */
    public long f28924g;

    /* renamed from: k */
    public long f28925k;

    /* renamed from: r */
    public boolean f28926r;

    /* renamed from: s */
    public int f28927s;

    public fo3(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: a */
    public void mo42625a(boolean z) {
        this.f28926r = z;
    }

    public int available() throws IOException {
        return this.f28921a.available();
    }

    /* renamed from: b */
    public void mo42627b(long j) throws IOException {
        if (this.f28922d > this.f28924g || j < this.f28923e) {
            throw new IOException("Cannot reset");
        }
        this.f28921a.reset();
        mo42631e(this.f28923e, j);
        this.f28922d = j;
    }

    /* renamed from: c */
    public long mo42628c(int i) {
        long j = this.f28922d + ((long) i);
        if (this.f28924g < j) {
            mo42630d(j);
        }
        return this.f28922d;
    }

    public void close() throws IOException {
        this.f28921a.close();
    }

    /* renamed from: d */
    public final void mo42630d(long j) {
        try {
            long j2 = this.f28923e;
            long j3 = this.f28922d;
            if (j2 >= j3 || j3 > this.f28924g) {
                this.f28923e = j3;
                this.f28921a.mark((int) (j - j3));
            } else {
                this.f28921a.reset();
                this.f28921a.mark((int) (j - this.f28923e));
                mo42631e(this.f28923e, this.f28922d);
            }
            this.f28924g = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    /* renamed from: e */
    public final void mo42631e(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f28921a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public void mark(int i) {
        this.f28925k = mo42628c(i);
    }

    public boolean markSupported() {
        return this.f28921a.markSupported();
    }

    public int read() throws IOException {
        if (!this.f28926r) {
            long j = this.f28924g;
            if (this.f28922d + 1 > j) {
                mo42630d(j + ((long) this.f28927s));
            }
        }
        int read = this.f28921a.read();
        if (read != -1) {
            this.f28922d++;
        }
        return read;
    }

    public void reset() throws IOException {
        mo42627b(this.f28925k);
    }

    public long skip(long j) throws IOException {
        if (!this.f28926r) {
            long j2 = this.f28922d;
            if (j2 + j > this.f28924g) {
                mo42630d(j2 + j + ((long) this.f28927s));
            }
        }
        long skip = this.f28921a.skip(j);
        this.f28922d += skip;
        return skip;
    }

    public fo3(InputStream inputStream, int i) {
        this(inputStream, i, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
    }

    public fo3(InputStream inputStream, int i, int i2) {
        this.f28925k = -1;
        this.f28926r = true;
        this.f28927s = -1;
        this.f28921a = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
        this.f28927s = i2;
    }

    public int read(byte[] bArr) throws IOException {
        if (!this.f28926r) {
            long j = this.f28922d;
            if (((long) bArr.length) + j > this.f28924g) {
                mo42630d(j + ((long) bArr.length) + ((long) this.f28927s));
            }
        }
        int read = this.f28921a.read(bArr);
        if (read != -1) {
            this.f28922d += (long) read;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f28926r) {
            long j = this.f28922d;
            long j2 = (long) i2;
            if (j + j2 > this.f28924g) {
                mo42630d(j + j2 + ((long) this.f28927s));
            }
        }
        int read = this.f28921a.read(bArr, i, i2);
        if (read != -1) {
            this.f28922d += (long) read;
        }
        return read;
    }
}
