package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020E¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016J\u0010\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\rH\u0016J \u0010/\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000fH\u0016J\u0018\u00108\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0018\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000fH\u0016J(\u0010<\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0016J\b\u0010=\u001a\u00020\u0001H\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\nH\u0016J\b\u0010C\u001a\u00020BH\u0016J\b\u0010D\u001a\u00020\u001eH\u0016R\u0014\u0010G\u001a\u00020E8\u0006X\u0004¢\u0006\u0006\n\u0004\b0\u0010FR\u0014\u0010I\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b8\u0010HR\u0016\u0010K\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b<\u0010JR\u001b\u0010P\u001a\u00020\u00028Ö\u0002X\u0004¢\u0006\f\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010M¨\u0006S"}, mo44877d2 = {"Lv75;", "Lw40;", "Lm40;", "F", "sink", "", "byteCount", "read", "", "I0", "Lr37;", "u0", "request", "", "readByte", "Lokio/ByteString;", "V0", "z0", "Lwi4;", "options", "", "J0", "", "F0", "p0", "readFully", "Ljava/nio/ByteBuffer;", "f0", "Ls36;", "R0", "", "b1", "Ljava/nio/charset/Charset;", "charset", "T0", "m0", "limit", "V", "", "readShort", "g", "readInt", "f", "readLong", "M0", "o1", "skip", "b", "a", "fromIndex", "toIndex", "bytes", "M", "c", "targetBytes", "T", "d", "offset", "a0", "bytesOffset", "e", "peek", "Ljava/io/InputStream;", "p1", "isOpen", "close", "Lqq6;", "timeout", "toString", "Lz56;", "Lz56;", "source", "Lm40;", "bufferField", "Z", "closed", "r", "()Lm40;", "getBuffer$annotations", "()V", "buffer", "<init>", "(Lz56;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: v75 */
/* compiled from: RealBufferedSource.kt */
public final class v75 implements w40 {

    /* renamed from: a */
    public final z56 f45232a;

    /* renamed from: d */
    public final m40 f45233d = new m40();

    /* renamed from: e */
    public boolean f45234e;

    public v75(z56 z56) {
        vx2.m53591g(z56, "source");
        this.f45232a = z56;
    }

    /* renamed from: F */
    public m40 mo56019F() {
        return this.f45233d;
    }

    /* renamed from: F0 */
    public byte[] mo56020F0() {
        this.f45233d.mo56029L0(this.f45232a);
        return this.f45233d.mo56020F0();
    }

    /* renamed from: I0 */
    public boolean mo56024I0() {
        if (!(!this.f45234e)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f45233d.mo56024I0() || this.f45232a.read(this.f45233d, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: J0 */
    public int mo56026J0(wi4 wi4) {
        vx2.m53591g(wi4, "options");
        if (!this.f45234e) {
            while (true) {
                int e = up7.m72972e(this.f45233d, wi4, true);
                if (e == -2) {
                    if (this.f45232a.read(this.f45233d, 8192) == -1) {
                        break;
                    }
                } else if (e != -1) {
                    this.f45233d.skip((long) wi4.mo66713n()[e].size());
                    return e;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: M */
    public long mo56030M(ByteString byteString) {
        vx2.m53591g(byteString, "bytes");
        return mo66428c(byteString, 0);
    }

    /* renamed from: M0 */
    public long mo56031M0() {
        int i;
        mo56094u0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!request(j2)) {
                break;
            }
            byte j3 = this.f45233d.mo56066j(j);
            if ((j3 >= ((byte) 48) && j3 <= ((byte) 57)) || (j == 0 && j3 == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                String num = Integer.toString(j3, wd0.m73569a(wd0.m73569a(16)));
                vx2.m53590f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                throw new NumberFormatException(vx2.m53598n("Expected a digit or '-' but was 0x", num));
            }
        }
        return this.f45233d.mo56031M0();
    }

    /* renamed from: R0 */
    public long mo56035R0(s36 s36) {
        vx2.m53591g(s36, "sink");
        long j = 0;
        while (this.f45232a.read(this.f45233d, 8192) != -1) {
            long d = this.f45233d.mo56051d();
            if (d > 0) {
                j += d;
                s36.write(this.f45233d, d);
            }
        }
        if (this.f45233d.size() <= 0) {
            return j;
        }
        long size = j + this.f45233d.size();
        m40 m40 = this.f45233d;
        s36.write(m40, m40.size());
        return size;
    }

    /* renamed from: T */
    public long mo56037T(ByteString byteString) {
        vx2.m53591g(byteString, "targetBytes");
        return mo66429d(byteString, 0);
    }

    /* renamed from: T0 */
    public String mo56038T0(Charset charset) {
        vx2.m53591g(charset, "charset");
        this.f45233d.mo56029L0(this.f45232a);
        return this.f45233d.mo56038T0(charset);
    }

    /* renamed from: V */
    public String mo56041V(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long b2 = mo66427b(b, 0, j2);
            if (b2 != -1) {
                return up7.m72971d(this.f45233d, b2);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.f45233d.mo56066j(j2 - 1) == ((byte) 13) && request(1 + j2) && this.f45233d.mo56066j(j2) == b) {
                return up7.m72971d(this.f45233d, j2);
            }
            m40 m40 = new m40();
            m40 m402 = this.f45233d;
            m402.mo56058g(m40, 0, Math.min((long) 32, m402.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f45233d.size(), j) + " content=" + m40.mo56042V0().hex() + 8230);
        }
        throw new IllegalArgumentException(vx2.m53598n("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: V0 */
    public ByteString mo56042V0() {
        this.f45233d.mo56029L0(this.f45232a);
        return this.f45233d.mo56042V0();
    }

    /* renamed from: a */
    public long mo66426a(byte b) {
        return mo66427b(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a0 */
    public boolean mo56046a0(long j, ByteString byteString) {
        vx2.m53591g(byteString, "bytes");
        return mo66430e(j, byteString, 0, byteString.size());
    }

    /* renamed from: b */
    public long mo66427b(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f45234e) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long l = this.f45233d.mo56069l(b, j, j2);
                    if (l != -1) {
                        return l;
                    }
                    long size = this.f45233d.size();
                    if (size >= j2 || this.f45232a.read(this.f45233d, 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, size);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b1 */
    public String mo56048b1() {
        this.f45233d.mo56029L0(this.f45232a);
        return this.f45233d.mo56048b1();
    }

    /* renamed from: c */
    public long mo66428c(ByteString byteString, long j) {
        vx2.m53591g(byteString, "bytes");
        if (!this.f45234e) {
            while (true) {
                long m = this.f45233d.mo56071m(byteString, j);
                if (m != -1) {
                    return m;
                }
                long size = this.f45233d.size();
                if (this.f45232a.read(this.f45233d, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (size - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public void close() {
        if (!this.f45234e) {
            this.f45234e = true;
            this.f45232a.close();
            this.f45233d.mo56045a();
        }
    }

    /* renamed from: d */
    public long mo66429d(ByteString byteString, long j) {
        vx2.m53591g(byteString, "targetBytes");
        if (!this.f45234e) {
            while (true) {
                long p = this.f45233d.mo56076p(byteString, j);
                if (p != -1) {
                    return p;
                }
                long size = this.f45233d.size();
                if (this.f45232a.read(this.f45233d, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: e */
    public boolean mo66430e(long j, ByteString byteString, int i, int i2) {
        vx2.m53591g(byteString, "bytes");
        if (!this.f45234e) {
            if (j >= 0 && i >= 0 && i2 >= 0 && byteString.size() - i >= i2) {
                if (i2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        long j2 = ((long) i3) + j;
                        if (!request(1 + j2) || this.f45233d.mo56066j(j2) != byteString.getByte(i3 + i)) {
                            break;
                        } else if (i4 >= i2) {
                            return true;
                        } else {
                            i3 = i4;
                        }
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: f */
    public int mo66431f() {
        mo56094u0(4);
        return this.f45233d.mo56105z();
    }

    /* renamed from: f0 */
    public void mo56057f0(m40 m40, long j) {
        vx2.m53591g(m40, "sink");
        try {
            mo56094u0(j);
            this.f45233d.mo56057f0(m40, j);
        } catch (EOFException e) {
            m40.mo56029L0(this.f45233d);
            throw e;
        }
    }

    /* renamed from: g */
    public short mo66432g() {
        mo56094u0(2);
        return this.f45233d.mo56018C();
    }

    public boolean isOpen() {
        return !this.f45234e;
    }

    /* renamed from: m0 */
    public String mo56072m0() {
        return mo56041V(Long.MAX_VALUE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo56075o1() {
        /*
            r5 = this;
            r0 = 1
            r5.mo56094u0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L_0x0059
            m40 r2 = r5.f45233d
            long r3 = (long) r0
            byte r2 = r2.mo56066j(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0059
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = p000.wd0.m73569a(r1)
            int r1 = p000.wd0.m73569a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p000.vx2.m53590f(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = p000.vx2.m53598n(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0059:
            m40 r0 = r5.f45233d
            long r0 = r0.mo56075o1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v75.mo56075o1():long");
    }

    /* renamed from: p0 */
    public byte[] mo56077p0(long j) {
        mo56094u0(j);
        return this.f45233d.mo56077p0(j);
    }

    /* renamed from: p1 */
    public InputStream mo56078p1() {
        return new C9446a(this);
    }

    public w40 peek() {
        return sg4.m71929d(new an4(this));
    }

    /* renamed from: r */
    public m40 mo56081r() {
        return this.f45233d;
    }

    public long read(m40 m40, long j) {
        vx2.m53591g(m40, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!(!this.f45234e)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f45233d.size() == 0 && this.f45232a.read(this.f45233d, 8192) == -1) {
            return -1;
        } else {
            return this.f45233d.read(m40, Math.min(j, this.f45233d.size()));
        }
    }

    public byte readByte() {
        mo56094u0(1);
        return this.f45233d.readByte();
    }

    public void readFully(byte[] bArr) {
        vx2.m53591g(bArr, "sink");
        try {
            mo56094u0((long) bArr.length);
            this.f45233d.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f45233d.size() > 0) {
                m40 m40 = this.f45233d;
                int read = m40.read(bArr, i, (int) m40.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo56094u0(4);
        return this.f45233d.readInt();
    }

    public long readLong() {
        mo56094u0(8);
        return this.f45233d.readLong();
    }

    public short readShort() {
        mo56094u0(2);
        return this.f45233d.readShort();
    }

    public boolean request(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!this.f45234e) {
            while (this.f45233d.size() < j) {
                if (this.f45232a.read(this.f45233d, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public void skip(long j) {
        if (!this.f45234e) {
            while (j > 0) {
                if (this.f45233d.size() == 0 && this.f45232a.read(this.f45233d, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f45233d.size());
                this.f45233d.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public qq6 timeout() {
        return this.f45232a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f45232a + ')';
    }

    /* renamed from: u0 */
    public void mo56094u0(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: z0 */
    public ByteString mo56106z0(long j) {
        mo56094u0(j);
        return this.f45233d.mo56106z0(j);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo44877d2 = {"v75$a", "Ljava/io/InputStream;", "", "read", "", "data", "offset", "byteCount", "available", "Lr37;", "close", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: v75$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C9446a extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ v75 f45235a;

        public C9446a(v75 v75) {
            this.f45235a = v75;
        }

        public int available() {
            v75 v75 = this.f45235a;
            if (!v75.f45234e) {
                return (int) Math.min(v75.f45233d.size(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f45235a.close();
        }

        public int read() {
            v75 v75 = this.f45235a;
            if (!v75.f45234e) {
                if (v75.f45233d.size() == 0) {
                    v75 v752 = this.f45235a;
                    if (v752.f45232a.read(v752.f45233d, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f45235a.f45233d.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f45235a + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            vx2.m53591g(bArr, "data");
            if (!this.f45235a.f45234e) {
                zp7.m75204b((long) bArr.length, (long) i, (long) i2);
                if (this.f45235a.f45233d.size() == 0) {
                    v75 v75 = this.f45235a;
                    if (v75.f45232a.read(v75.f45233d, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f45235a.f45233d.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) {
        vx2.m53591g(byteBuffer, "sink");
        if (this.f45233d.size() == 0 && this.f45232a.read(this.f45233d, 8192) == -1) {
            return -1;
        }
        return this.f45233d.read(byteBuffer);
    }
}
