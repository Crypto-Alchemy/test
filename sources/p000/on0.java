package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: on0 */
public class on0 {

    /* renamed from: a */
    public final ByteArrayOutputStream f43741a = new ByteArrayOutputStream();

    /* renamed from: f */
    public static on0 m70404f() {
        return new on0();
    }

    /* renamed from: a */
    public on0 mo64497a(boolean z) {
        this.f43741a.write(z ? 1 : 0);
        return this;
    }

    /* renamed from: b */
    public byte[] mo64498b() {
        return this.f43741a.toByteArray();
    }

    /* renamed from: c */
    public on0 mo64499c(cp1 cp1) {
        try {
            this.f43741a.write(cp1.getEncoded());
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public on0 mo64500d(byte[] bArr) {
        try {
            this.f43741a.write(bArr);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: e */
    public on0 mo64501e(byte[][] bArr) {
        try {
            for (byte[] write : bArr) {
                this.f43741a.write(write);
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: g */
    public on0 mo64502g(int i, int i2) {
        while (this.f43741a.size() < i2) {
            this.f43741a.write(i);
        }
        return this;
    }

    /* renamed from: h */
    public on0 mo64503h(int i) {
        int i2 = i & 65535;
        this.f43741a.write((byte) (i2 >>> 8));
        this.f43741a.write((byte) i2);
        return this;
    }

    /* renamed from: i */
    public on0 mo64504i(int i) {
        this.f43741a.write((byte) (i >>> 24));
        this.f43741a.write((byte) (i >>> 16));
        this.f43741a.write((byte) (i >>> 8));
        this.f43741a.write((byte) i);
        return this;
    }

    /* renamed from: j */
    public on0 mo64505j(long j) {
        mo64504i((int) (j >>> 32));
        mo64504i((int) j);
        return this;
    }
}
