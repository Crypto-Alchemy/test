package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import p000.c70;

/* renamed from: ni3 */
/* compiled from: LiteralByteString */
public class ni3 extends c70 {

    /* renamed from: d */
    public final byte[] f43478d;

    /* renamed from: e */
    public int f43479e = 0;

    /* renamed from: ni3$b */
    /* compiled from: LiteralByteString */
    public class C8990b implements c70.C6927a {

        /* renamed from: a */
        public int f43480a;

        /* renamed from: d */
        public final int f43481d;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo50834e());
        }

        /* renamed from: e */
        public byte mo50834e() {
            try {
                byte[] bArr = ni3.this.f43478d;
                int i = this.f43480a;
                this.f43480a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public boolean hasNext() {
            if (this.f43480a < this.f43481d) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C8990b() {
            this.f43480a = 0;
            this.f43481d = ni3.this.size();
        }
    }

    public ni3(byte[] bArr) {
        this.f43478d = bArr;
    }

    /* renamed from: T */
    public static int m69768T(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: A */
    public c70.C6927a iterator() {
        return new C8990b();
    }

    /* renamed from: B */
    public C7614c mo50815B() {
        return C7614c.m61964g(this);
    }

    /* renamed from: E */
    public int mo50816E(int i, int i2, int i3) {
        return m69768T(i, this.f43478d, mo62692S() + i2, i3);
    }

    /* renamed from: F */
    public int mo50817F(int i, int i2, int i3) {
        int S = mo62692S() + i2;
        return f67.m57625g(i, this.f43478d, S, i3 + S);
    }

    /* renamed from: H */
    public int mo50818H() {
        return this.f43479e;
    }

    /* renamed from: L */
    public String mo50820L(String str) throws UnsupportedEncodingException {
        return new String(this.f43478d, mo62692S(), size(), str);
    }

    /* renamed from: O */
    public void mo50823O(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f43478d, mo62692S() + i, i2);
    }

    /* renamed from: Q */
    public byte mo62690Q(int i) {
        return this.f43478d[i];
    }

    /* renamed from: R */
    public boolean mo62691R(ni3 ni3, int i, int i2) {
        if (i2 > ni3.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= ni3.size()) {
            byte[] bArr = this.f43478d;
            byte[] bArr2 = ni3.f43478d;
            int S = mo62692S() + i2;
            int S2 = mo62692S();
            int S3 = ni3.mo62692S() + i;
            while (S2 < S) {
                if (bArr[S2] != bArr2[S3]) {
                    return false;
                }
                S2++;
                S3++;
            }
            return true;
        } else {
            int size2 = ni3.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: S */
    public int mo62692S() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c70) || size() != ((c70) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof ni3) {
            return mo62691R((ni3) obj, 0, size());
        }
        if (obj instanceof th5) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i = this.f43479e;
        if (i == 0) {
            int size = size();
            i = mo50816E(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f43479e = i;
        }
        return i;
    }

    /* renamed from: s */
    public void mo50828s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f43478d, i, bArr, i2, i3);
    }

    public int size() {
        return this.f43478d.length;
    }

    /* renamed from: t */
    public int mo50830t() {
        return 0;
    }

    /* renamed from: u */
    public boolean mo50832u() {
        return true;
    }

    /* renamed from: w */
    public boolean mo50833w() {
        int S = mo62692S();
        return f67.m57624f(this.f43478d, S, size() + S);
    }
}
