package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.e */
public final class C4473e extends FilterInputStream {

    /* renamed from: a */
    public final eu7 f24718a = new eu7();

    /* renamed from: d */
    public byte[] f24719d = new byte[4096];

    /* renamed from: e */
    public long f24720e;

    /* renamed from: g */
    public boolean f24721g = false;

    /* renamed from: k */
    public boolean f24722k = false;

    public C4473e(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final vu7 mo34190a() throws IOException {
        byte[] bArr;
        if (this.f24720e > 0) {
            do {
                bArr = this.f24719d;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f24721g || this.f24722k) {
            return new vu7((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!mo34194e(30)) {
            this.f24721g = true;
            return this.f24718a.mo42425b();
        }
        vu7 b = this.f24718a.mo42425b();
        if (b.mo48835h()) {
            this.f24722k = true;
            return b;
        } else if (b.mo48831e() != 4294967295L) {
            int c = this.f24718a.mo42426c() - 30;
            long j = (long) c;
            int length = this.f24719d.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f24719d = Arrays.copyOf(this.f24719d, length);
            }
            if (!mo34194e(c)) {
                this.f24721g = true;
                return this.f24718a.mo42425b();
            }
            vu7 b2 = this.f24718a.mo42425b();
            this.f24720e = b2.mo48831e();
            return b2;
        } else {
            throw new C4470bj("Files bigger than 4GiB are not supported.");
        }
    }

    /* renamed from: b */
    public final boolean mo34191b() {
        return this.f24721g;
    }

    /* renamed from: c */
    public final boolean mo34192c() {
        return this.f24722k;
    }

    /* renamed from: d */
    public final long mo34193d() {
        return this.f24720e;
    }

    /* renamed from: e */
    public final boolean mo34194e(int i) throws IOException {
        int f = mo34195f(this.f24719d, 0, i);
        if (f != i) {
            int i2 = i - f;
            if (mo34195f(this.f24719d, f, i2) != i2) {
                this.f24718a.mo42424a(this.f24719d, 0, f);
                return false;
            }
        }
        this.f24718a.mo42424a(this.f24719d, 0, i);
        return true;
    }

    /* renamed from: f */
    public final int mo34195f(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f24720e;
        if (j <= 0 || this.f24721g) {
            return -1;
        }
        int f = mo34195f(bArr, i, (int) Math.min(j, (long) i2));
        this.f24720e -= (long) f;
        if (f != 0) {
            return f;
        }
        this.f24721g = true;
        return 0;
    }
}
