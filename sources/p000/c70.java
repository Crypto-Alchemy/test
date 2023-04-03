package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import org.slf4j.Marker;

/* renamed from: c70 */
/* compiled from: ByteString */
public abstract class c70 implements Iterable<Byte> {

    /* renamed from: a */
    public static final c70 f37074a = new ni3(new byte[0]);

    /* renamed from: c70$a */
    /* compiled from: ByteString */
    public interface C6927a extends Iterator<Byte> {
        /* renamed from: e */
        byte mo50834e();
    }

    static {
        Class<c70> cls = c70.class;
    }

    /* renamed from: D */
    public static C6928b m56312D() {
        return new C6928b(128);
    }

    /* renamed from: e */
    public static c70 m56313e(Iterator<c70> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m56313e(it, i2).mo50826j(m56313e(it, i - i2));
    }

    /* renamed from: k */
    public static c70 m56314k(Iterable<c70> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (c70 add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f37074a;
        }
        return m56313e(collection.iterator(), collection.size());
    }

    /* renamed from: n */
    public static c70 m56315n(byte[] bArr) {
        return m56316o(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    public static c70 m56316o(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ni3(bArr2);
    }

    /* renamed from: q */
    public static c70 m56317q(String str) {
        try {
            return new ni3(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: A */
    public abstract C6927a iterator();

    /* renamed from: B */
    public abstract C7614c mo50815B();

    /* renamed from: E */
    public abstract int mo50816E(int i, int i2, int i3);

    /* renamed from: F */
    public abstract int mo50817F(int i, int i2, int i3);

    /* renamed from: H */
    public abstract int mo50818H();

    /* renamed from: J */
    public byte[] mo50819J() {
        int size = size();
        if (size == 0) {
            return C7621f.f39965a;
        }
        byte[] bArr = new byte[size];
        mo50828s(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: L */
    public abstract String mo50820L(String str) throws UnsupportedEncodingException;

    /* renamed from: M */
    public String mo50821M() {
        try {
            return mo50820L("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: N */
    public void mo50822N(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                mo50823O(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: O */
    public abstract void mo50823O(OutputStream outputStream, int i, int i2) throws IOException;

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public c70 mo50826j(c70 c70) {
        int size = size();
        int size2 = c70.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return th5.m72316T(this, c70);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append(Marker.ANY_NON_NULL_MARKER);
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: r */
    public void mo50827r(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    mo50828s(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: s */
    public abstract void mo50828s(byte[] bArr, int i, int i2, int i3);

    public abstract int size();

    /* renamed from: t */
    public abstract int mo50830t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: u */
    public abstract boolean mo50832u();

    /* renamed from: w */
    public abstract boolean mo50833w();

    /* renamed from: c70$b */
    /* compiled from: ByteString */
    public static final class C6928b extends OutputStream {

        /* renamed from: r */
        public static final byte[] f37075r = new byte[0];

        /* renamed from: a */
        public final int f37076a;

        /* renamed from: d */
        public final ArrayList<c70> f37077d;

        /* renamed from: e */
        public int f37078e;

        /* renamed from: g */
        public byte[] f37079g;

        /* renamed from: k */
        public int f37080k;

        public C6928b(int i) {
            if (i >= 0) {
                this.f37076a = i;
                this.f37077d = new ArrayList<>();
                this.f37079g = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        public final byte[] mo50835a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: b */
        public final void mo50836b(int i) {
            this.f37077d.add(new ni3(this.f37079g));
            int length = this.f37078e + this.f37079g.length;
            this.f37078e = length;
            this.f37079g = new byte[Math.max(this.f37076a, Math.max(i, length >>> 1))];
            this.f37080k = 0;
        }

        /* renamed from: c */
        public final void mo50837c() {
            int i = this.f37080k;
            byte[] bArr = this.f37079g;
            if (i >= bArr.length) {
                this.f37077d.add(new ni3(this.f37079g));
                this.f37079g = f37075r;
            } else if (i > 0) {
                this.f37077d.add(new ni3(mo50835a(bArr, i)));
            }
            this.f37078e += this.f37080k;
            this.f37080k = 0;
        }

        /* renamed from: d */
        public synchronized c70 mo50838d() {
            mo50837c();
            return c70.m56314k(this.f37077d);
        }

        public synchronized int size() {
            return this.f37078e + this.f37080k;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i) {
            if (this.f37080k == this.f37079g.length) {
                mo50836b(1);
            }
            byte[] bArr = this.f37079g;
            int i2 = this.f37080k;
            this.f37080k = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f37079g;
            int length = bArr2.length;
            int i3 = this.f37080k;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f37080k += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                mo50836b(i4);
                System.arraycopy(bArr, i + length2, this.f37079g, 0, i4);
                this.f37080k = i4;
            }
        }
    }
}
