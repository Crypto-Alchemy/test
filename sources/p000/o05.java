package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o05 */
/* compiled from: QueueFile */
public class o05 implements Closeable {

    /* renamed from: s */
    public static final Logger f32239s = Logger.getLogger(o05.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f32240a;

    /* renamed from: d */
    public int f32241d;

    /* renamed from: e */
    public int f32242e;

    /* renamed from: g */
    public C6300b f32243g;

    /* renamed from: k */
    public C6300b f32244k;

    /* renamed from: r */
    public final byte[] f32245r = new byte[16];

    /* renamed from: o05$a */
    /* compiled from: QueueFile */
    public class C6299a implements C6302d {

        /* renamed from: a */
        public boolean f32246a = true;

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f32247b;

        public C6299a(StringBuilder sb) {
            this.f32247b = sb;
        }

        /* renamed from: a */
        public void mo46287a(InputStream inputStream, int i) throws IOException {
            if (this.f32246a) {
                this.f32246a = false;
            } else {
                this.f32247b.append(", ");
            }
            this.f32247b.append(i);
        }
    }

    /* renamed from: o05$b */
    /* compiled from: QueueFile */
    public static class C6300b {

        /* renamed from: c */
        public static final C6300b f32249c = new C6300b(0, 0);

        /* renamed from: a */
        public final int f32250a;

        /* renamed from: b */
        public final int f32251b;

        public C6300b(int i, int i2) {
            this.f32250a = i;
            this.f32251b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f32250a + ", length = " + this.f32251b + "]";
        }
    }

    /* renamed from: o05$c */
    /* compiled from: QueueFile */
    public final class C6301c extends InputStream {

        /* renamed from: a */
        public int f32252a;

        /* renamed from: d */
        public int f32253d;

        public /* synthetic */ C6301c(o05 o05, C6300b bVar, C6299a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            Object unused = o05.m49118l(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f32253d;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            o05.this.mo46284x(this.f32252a, bArr, i, i2);
            this.f32252a = o05.this.mo46270C(this.f32252a + i2);
            this.f32253d -= i2;
            return i2;
        }

        public C6301c(C6300b bVar) {
            this.f32252a = o05.this.mo46270C(bVar.f32250a + 4);
            this.f32253d = bVar.f32251b;
        }

        public int read() throws IOException {
            if (this.f32253d == 0) {
                return -1;
            }
            o05.this.f32240a.seek((long) this.f32252a);
            int read = o05.this.f32240a.read();
            this.f32252a = o05.this.mo46270C(this.f32252a + 1);
            this.f32253d--;
            return read;
        }
    }

    /* renamed from: o05$d */
    /* compiled from: QueueFile */
    public interface C6302d {
        /* renamed from: a */
        void mo46287a(InputStream inputStream, int i) throws IOException;
    }

    public o05(File file) throws IOException {
        if (!file.exists()) {
            m49117j(file);
        }
        this.f32240a = m49119m(file);
        mo46280p();
    }

    /* renamed from: I */
    public static void m49111I(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: J */
    public static void m49112J(byte[] bArr, int... iArr) {
        int i = 0;
        for (int I : iArr) {
            m49111I(bArr, i, I);
            i += 4;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public static void m49117j(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m = m49119m(file2);
        try {
            m.setLength(4096);
            m.seek(0);
            byte[] bArr = new byte[16];
            m49112J(bArr, 4096, 0, 0, 0);
            m.write(bArr);
            m.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m.close();
            throw th;
        }
    }

    /* renamed from: l */
    public static <T> T m49118l(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: m */
    public static RandomAccessFile m49119m(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: q */
    public static int m49120q(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: A */
    public int mo46269A() {
        if (this.f32242e == 0) {
            return 16;
        }
        C6300b bVar = this.f32244k;
        int i = bVar.f32250a;
        int i2 = this.f32243g.f32250a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f32251b + 16;
        }
        return (((i + 4) + bVar.f32251b) + this.f32241d) - i2;
    }

    /* renamed from: C */
    public final int mo46270C(int i) {
        int i2 = this.f32241d;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    /* renamed from: G */
    public final void mo46271G(int i, int i2, int i3, int i4) throws IOException {
        m49112J(this.f32245r, i, i2, i3, i4);
        this.f32240a.seek(0);
        this.f32240a.write(this.f32245r);
    }

    public synchronized void close() throws IOException {
        this.f32240a.close();
    }

    /* renamed from: e */
    public void mo46273e(byte[] bArr) throws IOException {
        mo46274f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public synchronized void mo46274f(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        m49118l(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        mo46276h(i2);
        boolean k = mo46278k();
        if (k) {
            i3 = 16;
        } else {
            C6300b bVar = this.f32244k;
            i3 = mo46270C(bVar.f32250a + 4 + bVar.f32251b);
        }
        C6300b bVar2 = new C6300b(i3, i2);
        m49111I(this.f32245r, 0, i2);
        mo46285y(bVar2.f32250a, this.f32245r, 0, 4);
        mo46285y(bVar2.f32250a + 4, bArr, i, i2);
        if (k) {
            i4 = bVar2.f32250a;
        } else {
            i4 = this.f32243g.f32250a;
        }
        mo46271G(this.f32241d, this.f32242e + 1, i4, bVar2.f32250a);
        this.f32244k = bVar2;
        this.f32242e++;
        if (k) {
            this.f32243g = bVar2;
        }
    }

    /* renamed from: g */
    public synchronized void mo46275g() throws IOException {
        mo46271G(4096, 0, 0, 0);
        this.f32242e = 0;
        C6300b bVar = C6300b.f32249c;
        this.f32243g = bVar;
        this.f32244k = bVar;
        if (this.f32241d > 4096) {
            mo46286z(4096);
        }
        this.f32241d = 4096;
    }

    /* renamed from: h */
    public final void mo46276h(int i) throws IOException {
        int i2 = i + 4;
        int s = mo46281s();
        if (s < i2) {
            int i3 = this.f32241d;
            do {
                s += i3;
                i3 <<= 1;
            } while (s < i2);
            mo46286z(i3);
            C6300b bVar = this.f32244k;
            int C = mo46270C(bVar.f32250a + 4 + bVar.f32251b);
            if (C < this.f32243g.f32250a) {
                FileChannel channel = this.f32240a.getChannel();
                channel.position((long) this.f32241d);
                long j = (long) (C - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f32244k.f32250a;
            int i5 = this.f32243g.f32250a;
            if (i4 < i5) {
                int i6 = (this.f32241d + i4) - 16;
                mo46271G(i3, this.f32242e, i5, i6);
                this.f32244k = new C6300b(i6, this.f32244k.f32251b);
            } else {
                mo46271G(i3, this.f32242e, i5, i4);
            }
            this.f32241d = i3;
        }
    }

    /* renamed from: i */
    public synchronized void mo46277i(C6302d dVar) throws IOException {
        int i = this.f32243g.f32250a;
        for (int i2 = 0; i2 < this.f32242e; i2++) {
            C6300b n = mo46279n(i);
            dVar.mo46287a(new C6301c(this, n, (C6299a) null), n.f32251b);
            i = mo46270C(n.f32250a + 4 + n.f32251b);
        }
    }

    /* renamed from: k */
    public synchronized boolean mo46278k() {
        boolean z;
        if (this.f32242e == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: n */
    public final C6300b mo46279n(int i) throws IOException {
        if (i == 0) {
            return C6300b.f32249c;
        }
        this.f32240a.seek((long) i);
        return new C6300b(i, this.f32240a.readInt());
    }

    /* renamed from: p */
    public final void mo46280p() throws IOException {
        this.f32240a.seek(0);
        this.f32240a.readFully(this.f32245r);
        int q = m49120q(this.f32245r, 0);
        this.f32241d = q;
        if (((long) q) <= this.f32240a.length()) {
            this.f32242e = m49120q(this.f32245r, 4);
            int q2 = m49120q(this.f32245r, 8);
            int q3 = m49120q(this.f32245r, 12);
            this.f32243g = mo46279n(q2);
            this.f32244k = mo46279n(q3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f32241d + ", Actual length: " + this.f32240a.length());
    }

    /* renamed from: s */
    public final int mo46281s() {
        return this.f32241d - mo46269A();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f32241d);
        sb.append(", size=");
        sb.append(this.f32242e);
        sb.append(", first=");
        sb.append(this.f32243g);
        sb.append(", last=");
        sb.append(this.f32244k);
        sb.append(", element lengths=[");
        try {
            mo46277i(new C6299a(sb));
        } catch (IOException e) {
            f32239s.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: v */
    public synchronized void mo46283v() throws IOException {
        if (mo46278k()) {
            throw new NoSuchElementException();
        } else if (this.f32242e == 1) {
            mo46275g();
        } else {
            C6300b bVar = this.f32243g;
            int C = mo46270C(bVar.f32250a + 4 + bVar.f32251b);
            mo46284x(C, this.f32245r, 0, 4);
            int q = m49120q(this.f32245r, 0);
            mo46271G(this.f32241d, this.f32242e - 1, C, this.f32244k.f32250a);
            this.f32242e--;
            this.f32243g = new C6300b(C, q);
        }
    }

    /* renamed from: x */
    public final void mo46284x(int i, byte[] bArr, int i2, int i3) throws IOException {
        int C = mo46270C(i);
        int i4 = C + i3;
        int i5 = this.f32241d;
        if (i4 <= i5) {
            this.f32240a.seek((long) C);
            this.f32240a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - C;
        this.f32240a.seek((long) C);
        this.f32240a.readFully(bArr, i2, i6);
        this.f32240a.seek(16);
        this.f32240a.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: y */
    public final void mo46285y(int i, byte[] bArr, int i2, int i3) throws IOException {
        int C = mo46270C(i);
        int i4 = C + i3;
        int i5 = this.f32241d;
        if (i4 <= i5) {
            this.f32240a.seek((long) C);
            this.f32240a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - C;
        this.f32240a.seek((long) C);
        this.f32240a.write(bArr, i2, i6);
        this.f32240a.seek(16);
        this.f32240a.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: z */
    public final void mo46286z(int i) throws IOException {
        this.f32240a.setLength((long) i);
        this.f32240a.getChannel().force(true);
    }
}
