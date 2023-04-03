package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: su2 */
/* compiled from: InputAccessor */
public interface su2 {
    /* renamed from: a */
    boolean mo25964a() throws IOException;

    /* renamed from: e */
    byte mo25965e() throws IOException;

    /* renamed from: su2$a */
    /* compiled from: InputAccessor */
    public static class C3305a implements su2 {

        /* renamed from: a */
        public final InputStream f17803a;

        /* renamed from: b */
        public final byte[] f17804b;

        /* renamed from: c */
        public final int f17805c;

        /* renamed from: d */
        public int f17806d;

        /* renamed from: e */
        public int f17807e;

        public C3305a(InputStream inputStream, byte[] bArr) {
            this.f17803a = inputStream;
            this.f17804b = bArr;
            this.f17805c = 0;
            this.f17807e = 0;
            this.f17806d = 0;
        }

        /* renamed from: a */
        public boolean mo25964a() throws IOException {
            int read;
            int i = this.f17807e;
            if (i < this.f17806d) {
                return true;
            }
            InputStream inputStream = this.f17803a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f17804b;
            int length = bArr.length - i;
            if (length < 1 || (read = inputStream.read(bArr, i, length)) <= 0) {
                return false;
            }
            this.f17806d += read;
            return true;
        }

        /* renamed from: b */
        public void mo25966b() {
            this.f17807e = this.f17805c;
        }

        /* renamed from: e */
        public byte mo25965e() throws IOException {
            if (this.f17807e < this.f17806d || mo25964a()) {
                byte[] bArr = this.f17804b;
                int i = this.f17807e;
                this.f17807e = i + 1;
                return bArr[i];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.f17807e + " bytes (max buffer size: " + this.f17804b.length + ")");
        }

        public C3305a(byte[] bArr, int i, int i2) {
            this.f17803a = null;
            this.f17804b = bArr;
            this.f17807e = i;
            this.f17805c = i;
            this.f17806d = i + i2;
        }
    }
}
