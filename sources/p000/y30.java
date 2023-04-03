package p000;

import java.util.NoSuchElementException;
import org.slf4j.Marker;
import p000.c70;

/* renamed from: y30 */
/* compiled from: BoundedByteString */
public class y30 extends ni3 {

    /* renamed from: g */
    public final int f46119g;

    /* renamed from: k */
    public final int f46120k;

    /* renamed from: y30$b */
    /* compiled from: BoundedByteString */
    public class C9625b implements c70.C6927a {

        /* renamed from: a */
        public int f46121a;

        /* renamed from: d */
        public final int f46122d;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo50834e());
        }

        /* renamed from: e */
        public byte mo50834e() {
            int i = this.f46121a;
            if (i < this.f46122d) {
                byte[] bArr = y30.this.f43478d;
                this.f46121a = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f46121a < this.f46122d) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9625b() {
            int S = y30.this.mo62692S();
            this.f46121a = S;
            this.f46122d = S + y30.this.size();
        }
    }

    public y30(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.f46119g = i;
            this.f46120k = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append(Marker.ANY_NON_NULL_MARKER);
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: A */
    public c70.C6927a iterator() {
        return new C9625b();
    }

    /* renamed from: Q */
    public byte mo62690Q(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < size()) {
            return this.f43478d[this.f46119g + i];
        } else {
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* renamed from: S */
    public int mo62692S() {
        return this.f46119g;
    }

    /* renamed from: s */
    public void mo50828s(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f43478d, mo62692S() + i, bArr, i2, i3);
    }

    public int size() {
        return this.f46120k;
    }
}
