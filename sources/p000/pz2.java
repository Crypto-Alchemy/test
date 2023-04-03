package p000;

import com.google.crypto.tink.shaded.protobuf.C4758t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: pz2 */
/* compiled from: IterableByteBufferInputStream */
public class pz2 extends InputStream {

    /* renamed from: a */
    public Iterator<ByteBuffer> f32883a;

    /* renamed from: d */
    public ByteBuffer f32884d;

    /* renamed from: e */
    public int f32885e = 0;

    /* renamed from: g */
    public int f32886g;

    /* renamed from: k */
    public int f32887k;

    /* renamed from: r */
    public boolean f32888r;

    /* renamed from: s */
    public byte[] f32889s;

    /* renamed from: x */
    public int f32890x;

    /* renamed from: y */
    public long f32891y;

    public pz2(Iterable<ByteBuffer> iterable) {
        this.f32883a = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f32885e++;
        }
        this.f32886g = -1;
        if (!mo46923a()) {
            this.f32884d = C4758t.f25295e;
            this.f32886g = 0;
            this.f32887k = 0;
            this.f32891y = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo46923a() {
        this.f32886g++;
        if (!this.f32883a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f32883a.next();
        this.f32884d = next;
        this.f32887k = next.position();
        if (this.f32884d.hasArray()) {
            this.f32888r = true;
            this.f32889s = this.f32884d.array();
            this.f32890x = this.f32884d.arrayOffset();
        } else {
            this.f32888r = false;
            this.f32891y = q47.m50263k(this.f32884d);
            this.f32889s = null;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo46924b(int i) {
        int i2 = this.f32887k + i;
        this.f32887k = i2;
        if (i2 == this.f32884d.limit()) {
            mo46923a();
        }
    }

    public int read() throws IOException {
        if (this.f32886g == this.f32885e) {
            return -1;
        }
        if (this.f32888r) {
            byte b = this.f32889s[this.f32887k + this.f32890x] & 255;
            mo46924b(1);
            return b;
        }
        byte w = q47.m50275w(((long) this.f32887k) + this.f32891y) & 255;
        mo46924b(1);
        return w;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f32886g == this.f32885e) {
            return -1;
        }
        int limit = this.f32884d.limit();
        int i3 = this.f32887k;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f32888r) {
            System.arraycopy(this.f32889s, i3 + this.f32890x, bArr, i, i2);
            mo46924b(i2);
        } else {
            int position = this.f32884d.position();
            this.f32884d.position(this.f32887k);
            this.f32884d.get(bArr, i, i2);
            this.f32884d.position(position);
            mo46924b(i2);
        }
        return i2;
    }
}
