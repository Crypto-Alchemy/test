package p000;

import com.google.protobuf.C5011t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: oz2 */
/* compiled from: IterableByteBufferInputStream */
public class oz2 extends InputStream {

    /* renamed from: a */
    public Iterator<ByteBuffer> f32503a;

    /* renamed from: d */
    public ByteBuffer f32504d;

    /* renamed from: e */
    public int f32505e = 0;

    /* renamed from: g */
    public int f32506g;

    /* renamed from: k */
    public int f32507k;

    /* renamed from: r */
    public boolean f32508r;

    /* renamed from: s */
    public byte[] f32509s;

    /* renamed from: x */
    public int f32510x;

    /* renamed from: y */
    public long f32511y;

    public oz2(Iterable<ByteBuffer> iterable) {
        this.f32503a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f32505e++;
        }
        this.f32506g = -1;
        if (!mo46574a()) {
            this.f32504d = C5011t.f25751e;
            this.f32506g = 0;
            this.f32507k = 0;
            this.f32511y = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo46574a() {
        this.f32506g++;
        if (!this.f32503a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f32503a.next();
        this.f32504d = next;
        this.f32507k = next.position();
        if (this.f32504d.hasArray()) {
            this.f32508r = true;
            this.f32509s = this.f32504d.array();
            this.f32510x = this.f32504d.arrayOffset();
        } else {
            this.f32508r = false;
            this.f32511y = p47.m49716k(this.f32504d);
            this.f32509s = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo46575b(int i) {
        int i2 = this.f32507k + i;
        this.f32507k = i2;
        if (i2 == this.f32504d.limit()) {
            mo46574a();
        }
    }

    public int read() throws IOException {
        if (this.f32506g == this.f32505e) {
            return -1;
        }
        if (this.f32508r) {
            byte b = this.f32509s[this.f32507k + this.f32510x] & 255;
            mo46575b(1);
            return b;
        }
        byte w = p47.m49728w(((long) this.f32507k) + this.f32511y) & 255;
        mo46575b(1);
        return w;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f32506g == this.f32505e) {
            return -1;
        }
        int limit = this.f32504d.limit();
        int i3 = this.f32507k;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f32508r) {
            System.arraycopy(this.f32509s, i3 + this.f32510x, bArr, i, i2);
            mo46575b(i2);
        } else {
            int position = this.f32504d.position();
            this.f32504d.position(this.f32507k);
            this.f32504d.get(bArr, i, i2);
            this.f32504d.position(position);
            mo46575b(i2);
        }
        return i2;
    }
}
