package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import okio.ByteString;
import org.web3j.abi.datatypes.Utf8String;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b9\u0010:J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0001H\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020\u000bH\u0016R\u0014\u0010.\u001a\u00020+8\u0006X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b2\u0010\rR\u001b\u00108\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105¨\u0006;"}, mo44877d2 = {"Lu75;", "Lv40;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "Lokio/ByteString;", "byteString", "e1", "", "string", "Z", "", "beginIndex", "endIndex", "d0", "", "offset", "Ljava/nio/ByteBuffer;", "Lz56;", "L0", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "w0", "U0", "U", "H", "Ljava/io/OutputStream;", "n1", "flush", "", "isOpen", "close", "Lqq6;", "timeout", "toString", "Ls36;", "a", "Ls36;", "sink", "d", "Lm40;", "bufferField", "e", "closed", "r", "()Lm40;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Ls36;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: u75 */
/* compiled from: RealBufferedSink.kt */
public final class u75 implements v40 {

    /* renamed from: a */
    public final s36 f44919a;

    /* renamed from: d */
    public final m40 f44920d = new m40();

    /* renamed from: e */
    public boolean f44921e;

    public u75(s36 s36) {
        vx2.m53591g(s36, "sink");
        this.f44919a = s36;
    }

    /* renamed from: H */
    public v40 mo56022H() {
        if (!this.f44921e) {
            long size = this.f44920d.size();
            if (size > 0) {
                this.f44919a.write(this.f44920d, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: L0 */
    public long mo56029L0(z56 z56) {
        vx2.m53591g(z56, "source");
        long j = 0;
        while (true) {
            long read = z56.read(this.f44920d, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo56039U();
        }
    }

    /* renamed from: U */
    public v40 mo56039U() {
        if (!this.f44921e) {
            long d = this.f44920d.mo56051d();
            if (d > 0) {
                this.f44919a.write(this.f44920d, d);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: U0 */
    public v40 mo56040U0(long j) {
        if (!this.f44921e) {
            this.f44920d.mo56040U0(j);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Z */
    public v40 mo56044Z(String str) {
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        if (!this.f44921e) {
            this.f44920d.mo56044Z(str);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f44921e) {
            Throwable th = null;
            try {
                if (this.f44920d.size() > 0) {
                    s36 s36 = this.f44919a;
                    m40 m40 = this.f44920d;
                    s36.write(m40, m40.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f44919a.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f44921e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d0 */
    public v40 mo56052d0(String str, int i, int i2) {
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        if (!this.f44921e) {
            this.f44920d.mo56052d0(str, i, i2);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: e1 */
    public v40 mo56054e1(ByteString byteString) {
        vx2.m53591g(byteString, "byteString");
        if (!this.f44921e) {
            this.f44920d.mo56054e1(byteString);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f44921e) {
            if (this.f44920d.size() > 0) {
                s36 s36 = this.f44919a;
                m40 m40 = this.f44920d;
                s36.write(m40, m40.size());
            }
            this.f44919a.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f44921e;
    }

    /* renamed from: n1 */
    public OutputStream mo56073n1() {
        return new C9392a(this);
    }

    /* renamed from: r */
    public m40 mo56081r() {
        return this.f44920d;
    }

    public qq6 timeout() {
        return this.f44919a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f44919a + ')';
    }

    /* renamed from: w0 */
    public v40 mo56096w0(long j) {
        if (!this.f44921e) {
            this.f44920d.mo56096w0(j);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        vx2.m53591g(byteBuffer, "source");
        if (!this.f44921e) {
            int write = this.f44920d.write(byteBuffer);
            mo56039U();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public v40 writeByte(int i) {
        if (!this.f44921e) {
            this.f44920d.writeByte(i);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public v40 writeInt(int i) {
        if (!this.f44921e) {
            this.f44920d.writeInt(i);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public v40 writeShort(int i) {
        if (!this.f44921e) {
            this.f44920d.writeShort(i);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"u75$a", "Ljava/io/OutputStream;", "", "b", "Lr37;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: u75$a */
    /* compiled from: RealBufferedSink.kt */
    public static final class C9392a extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ u75 f44922a;

        public C9392a(u75 u75) {
            this.f44922a = u75;
        }

        public void close() {
            this.f44922a.close();
        }

        public void flush() {
            u75 u75 = this.f44922a;
            if (!u75.f44921e) {
                u75.flush();
            }
        }

        public String toString() {
            return this.f44922a + ".outputStream()";
        }

        public void write(int i) {
            u75 u75 = this.f44922a;
            if (!u75.f44921e) {
                u75.f44920d.writeByte((byte) i);
                this.f44922a.mo56039U();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) {
            vx2.m53591g(bArr, "data");
            u75 u75 = this.f44922a;
            if (!u75.f44921e) {
                u75.f44920d.write(bArr, i, i2);
                this.f44922a.mo56039U();
                return;
            }
            throw new IOException("closed");
        }
    }

    public void write(m40 m40, long j) {
        vx2.m53591g(m40, "source");
        if (!this.f44921e) {
            this.f44920d.write(m40, j);
            mo56039U();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public v40 write(byte[] bArr) {
        vx2.m53591g(bArr, "source");
        if (!this.f44921e) {
            this.f44920d.write(bArr);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public v40 write(byte[] bArr, int i, int i2) {
        vx2.m53591g(bArr, "source");
        if (!this.f44921e) {
            this.f44920d.write(bArr, i, i2);
            return mo56039U();
        }
        throw new IllegalStateException("closed".toString());
    }
}
