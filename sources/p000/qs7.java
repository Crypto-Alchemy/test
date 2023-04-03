package p000;

import com.google.android.play.core.assetpacks.C4482n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: qs7 */
public final class qs7 extends OutputStream {

    /* renamed from: a */
    public final eu7 f33256a = new eu7();

    /* renamed from: d */
    public final File f33257d;

    /* renamed from: e */
    public final C4482n f33258e;

    /* renamed from: g */
    public long f33259g;

    /* renamed from: k */
    public long f33260k;

    /* renamed from: r */
    public FileOutputStream f33261r;

    /* renamed from: s */
    public vu7 f33262s;

    public qs7(File file, C4482n nVar) {
        this.f33257d = file;
        this.f33258e = nVar;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f33259g == 0 && this.f33260k == 0) {
                int a = this.f33256a.mo42424a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    vu7 b = this.f33256a.mo42425b();
                    this.f33262s = b;
                    if (b.mo48835h()) {
                        this.f33259g = 0;
                        this.f33258e.mo34239m(this.f33262s.mo48837i(), this.f33262s.mo48837i().length);
                        this.f33260k = (long) this.f33262s.mo48837i().length;
                    } else if (!this.f33262s.mo48829c() || this.f33262s.mo48828b()) {
                        byte[] i4 = this.f33262s.mo48837i();
                        this.f33258e.mo34239m(i4, i4.length);
                        this.f33259g = this.f33262s.mo48831e();
                    } else {
                        this.f33258e.mo34233g(this.f33262s.mo48837i());
                        File file = new File(this.f33257d, this.f33262s.mo48830d());
                        file.getParentFile().mkdirs();
                        this.f33259g = this.f33262s.mo48831e();
                        this.f33261r = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f33262s.mo48828b()) {
                if (this.f33262s.mo48835h()) {
                    this.f33258e.mo34235i(this.f33260k, bArr, i, i2);
                    this.f33260k += (long) i2;
                    i3 = i2;
                } else if (this.f33262s.mo48829c()) {
                    i3 = (int) Math.min((long) i2, this.f33259g);
                    this.f33261r.write(bArr, i, i3);
                    long j = this.f33259g - ((long) i3);
                    this.f33259g = j;
                    if (j == 0) {
                        this.f33261r.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f33259g);
                    int length = this.f33262s.mo48837i().length;
                    this.f33258e.mo34235i((((long) length) + this.f33262s.mo48831e()) - this.f33259g, bArr, i, i3);
                    this.f33259g -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
