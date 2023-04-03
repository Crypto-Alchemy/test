package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: db1 */
public class db1 extends fh3 {

    /* renamed from: k */
    public static final byte[] f37265k = new byte[0];

    /* renamed from: e */
    public final int f37266e;

    /* renamed from: g */
    public int f37267g;

    public db1(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i >= 0) {
                mo51672b(true);
            } else {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
        }
        this.f37266e = i;
        this.f37267g = i;
    }

    /* renamed from: c */
    public int mo51165c() {
        return this.f37267g;
    }

    /* renamed from: d */
    public void mo51166d(byte[] bArr) throws IOException {
        int i = this.f37267g;
        if (i != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        } else if (i != 0) {
            int a = mo51671a();
            int i2 = this.f37267g;
            if (i2 < a) {
                int d = i2 - ya6.m74323d(this.f37795a, bArr, 0, bArr.length);
                this.f37267g = d;
                if (d == 0) {
                    mo51672b(true);
                    return;
                }
                throw new EOFException("DEF length " + this.f37266e + " object truncated by " + this.f37267g);
            }
            throw new IOException("corrupted stream - out of bounds length found: " + this.f37267g + " >= " + a);
        }
    }

    /* renamed from: e */
    public byte[] mo51167e() throws IOException {
        if (this.f37267g == 0) {
            return f37265k;
        }
        int a = mo51671a();
        int i = this.f37267g;
        if (i < a) {
            byte[] bArr = new byte[i];
            int d = i - ya6.m74323d(this.f37795a, bArr, 0, i);
            this.f37267g = d;
            if (d == 0) {
                mo51672b(true);
                return bArr;
            }
            throw new EOFException("DEF length " + this.f37266e + " object truncated by " + this.f37267g);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.f37267g + " >= " + a);
    }

    public int read() throws IOException {
        if (this.f37267g == 0) {
            return -1;
        }
        int read = this.f37795a.read();
        if (read >= 0) {
            int i = this.f37267g - 1;
            this.f37267g = i;
            if (i == 0) {
                mo51672b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f37266e + " object truncated by " + this.f37267g);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f37267g;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f37795a.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.f37267g - read;
            this.f37267g = i4;
            if (i4 == 0) {
                mo51672b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f37266e + " object truncated by " + this.f37267g);
    }
}
