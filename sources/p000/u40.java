package p000;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: u40 */
/* compiled from: BufferedOutputStream */
public final class u40 extends OutputStream {

    /* renamed from: a */
    public final OutputStream f18371a;

    /* renamed from: d */
    public byte[] f18372d;

    /* renamed from: e */
    public C2982oq f18373e;

    /* renamed from: g */
    public int f18374g;

    public u40(OutputStream outputStream, C2982oq oqVar) {
        this(outputStream, oqVar, 65536);
    }

    /* renamed from: a */
    public final void mo26643a() throws IOException {
        int i = this.f18374g;
        if (i > 0) {
            this.f18371a.write(this.f18372d, 0, i);
            this.f18374g = 0;
        }
    }

    /* renamed from: b */
    public final void mo26644b() throws IOException {
        if (this.f18374g == this.f18372d.length) {
            mo26643a();
        }
    }

    /* renamed from: c */
    public final void mo26645c() {
        byte[] bArr = this.f18372d;
        if (bArr != null) {
            this.f18373e.put(bArr);
            this.f18372d = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f18371a.close();
            mo26645c();
        } catch (Throwable th) {
            this.f18371a.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        mo26643a();
        this.f18371a.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f18372d;
        int i2 = this.f18374g;
        this.f18374g = i2 + 1;
        bArr[i2] = (byte) i;
        mo26644b();
    }

    public u40(OutputStream outputStream, C2982oq oqVar, int i) {
        this.f18371a = outputStream;
        this.f18373e = oqVar;
        this.f18372d = (byte[]) oqVar.mo24041c(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f18374g;
            if (i6 != 0 || i4 < this.f18372d.length) {
                int min = Math.min(i4, this.f18372d.length - i6);
                System.arraycopy(bArr, i5, this.f18372d, this.f18374g, min);
                this.f18374g += min;
                i3 += min;
                mo26644b();
            } else {
                this.f18371a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
