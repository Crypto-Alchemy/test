package p000;

import com.fasterxml.jackson.core.Base64Variant;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.SegmentedByteString;
import org.web3j.abi.datatypes.Utf8String;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B\t¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\fH\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u0010,\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\u0010\u00102\u001a\u0002002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J\u0018\u00106\u001a\u0002002\u0006\u0010\r\u001a\u00020\f2\u0006\u00104\u001a\u000203H\u0016J\b\u00107\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u00108\u001a\u00020\fH\u0016J\b\u0010:\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020;H\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020;H\u0016J \u0010?\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020;2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020&H\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u000200H\u0016J \u0010I\u001a\u00020\u00002\u0006\u0010E\u001a\u0002002\u0006\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001fH\u0016J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u001fH\u0016J\u0018\u0010L\u001a\u00020\u00002\u0006\u0010E\u001a\u0002002\u0006\u00104\u001a\u000203H\u0016J(\u0010M\u001a\u00020\u00002\u0006\u0010E\u001a\u0002002\u0006\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u001f2\u0006\u00104\u001a\u000203H\u0016J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010N\u001a\u00020;H\u0016J \u0010P\u001a\u00020\u00002\u0006\u0010N\u001a\u00020;2\u0006\u0010\u0015\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\u0010\u0010Q\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020@H\u0016J\u0010\u0010S\u001a\u00020\f2\u0006\u0010N\u001a\u00020RH\u0016J\u0018\u0010T\u001a\u00020\u00002\u0006\u0010N\u001a\u00020R2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u001fH\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u001fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\fH\u0016J\u0010\u0010\\\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\fH\u0016J\u0010\u0010]\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\fH\u0016J\u0017\u0010`\u001a\u00020_2\u0006\u0010^\u001a\u00020\u001fH\u0000¢\u0006\u0004\b`\u0010aJ\u0018\u0010Q\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010?\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010d\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020&H\u0016J\u0018\u0010g\u001a\u00020\f2\u0006\u0010e\u001a\u00020&2\u0006\u0010b\u001a\u00020\fH\u0016J\u0010\u0010i\u001a\u00020\f2\u0006\u0010h\u001a\u00020&H\u0016J\u0018\u0010j\u001a\u00020\f2\u0006\u0010h\u001a\u00020&2\u0006\u0010b\u001a\u00020\fH\u0016J\u0018\u0010k\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010e\u001a\u00020&H\u0016J(\u0010Z\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010e\u001a\u00020&2\u0006\u0010l\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001fH\u0016J\b\u0010m\u001a\u00020\u000eH\u0016J\b\u0010n\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020\u000eH\u0016J\b\u0010q\u001a\u00020pH\u0016J\u0013\u0010t\u001a\u00020\n2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002J\b\u0010u\u001a\u00020\u001fH\u0016J\b\u0010v\u001a\u000200H\u0016J\u0006\u0010w\u001a\u00020\u0000J\b\u0010U\u001a\u00020\u0000H\u0016J\u0006\u0010x\u001a\u00020&J\u000e\u0010y\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u001fJ\u0012\u0010|\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020zH\u0007R\u0018\u0010~\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\bA\u0010}R/\u0010\u0001\u001a\u00020\f2\u0006\u0010\u001a\u00020\f8G@@X\u000e¢\u0006\u0016\n\u0004\b\u0017\u0010:\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00008VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo44877d2 = {"Lm40;", "Lw40;", "Lv40;", "", "Ljava/nio/channels/ByteChannel;", "F", "Ljava/io/OutputStream;", "n1", "i", "h", "", "I0", "", "byteCount", "Lr37;", "u0", "request", "peek", "Ljava/io/InputStream;", "p1", "out", "offset", "g", "d", "", "readByte", "pos", "j", "(J)B", "", "readShort", "", "readInt", "readLong", "C", "z", "M0", "o1", "Lokio/ByteString;", "V0", "z0", "Lwi4;", "options", "J0", "sink", "f0", "Ls36;", "R0", "", "b1", "I", "Ljava/nio/charset/Charset;", "charset", "T0", "G", "m0", "limit", "V", "J", "", "F0", "p0", "readFully", "read", "Ljava/nio/ByteBuffer;", "a", "skip", "byteString", "S", "string", "q0", "beginIndex", "endIndex", "s0", "codePoint", "x0", "o0", "l0", "source", "Y", "c0", "write", "Lz56;", "L0", "P", "b", "e0", "s", "k0", "i0", "v", "j0", "g0", "h0", "minimumCapacity", "Lct5;", "O", "(I)Lct5;", "fromIndex", "toIndex", "l", "bytes", "M", "m", "targetBytes", "T", "p", "a0", "bytesOffset", "flush", "isOpen", "close", "Lqq6;", "timeout", "", "other", "equals", "hashCode", "toString", "f", "L", "N", "Lm40$c;", "unsafeCursor", "x", "Lct5;", "head", "<set-?>", "size", "()J", "K", "(J)V", "r", "()Lm40;", "buffer", "<init>", "()V", "c", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: m40 */
/* compiled from: Buffer.kt */
public final class m40 implements w40, v40, Cloneable, ByteChannel {

    /* renamed from: a */
    public ct5 f40752a;

    /* renamed from: d */
    public long f40753d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"m40$b", "Ljava/io/OutputStream;", "", "b", "Lr37;", "write", "", "data", "offset", "byteCount", "flush", "close", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: m40$b */
    /* compiled from: Buffer.kt */
    public static final class C7862b extends OutputStream {

        /* renamed from: a */
        public final /* synthetic */ m40 f40755a;

        public C7862b(m40 m40) {
            this.f40755a = m40;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f40755a + ".outputStream()";
        }

        public void write(int i) {
            this.f40755a.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            vx2.m53591g(bArr, "data");
            this.f40755a.write(bArr, i, i2);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0013\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006%"}, mo44877d2 = {"Lm40$c;", "Ljava/io/Closeable;", "", "b", "", "offset", "d", "newSize", "c", "Lr37;", "close", "Lm40;", "a", "Lm40;", "buffer", "", "Z", "readWrite", "Lct5;", "e", "Lct5;", "()Lct5;", "(Lct5;)V", "segment", "g", "J", "", "k", "[B", "data", "r", "I", "start", "s", "end", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: m40$c */
    /* compiled from: Buffer.kt */
    public static final class C7863c implements Closeable {

        /* renamed from: a */
        public m40 f40756a;

        /* renamed from: d */
        public boolean f40757d;

        /* renamed from: e */
        public ct5 f40758e;

        /* renamed from: g */
        public long f40759g = -1;

        /* renamed from: k */
        public byte[] f40760k;

        /* renamed from: r */
        public int f40761r = -1;

        /* renamed from: s */
        public int f40762s = -1;

        /* renamed from: a */
        public final ct5 mo56117a() {
            return this.f40758e;
        }

        /* renamed from: b */
        public final int mo56118b() {
            boolean z;
            long j;
            long j2 = this.f40759g;
            m40 m40 = this.f40756a;
            vx2.m53588d(m40);
            if (j2 != m40.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f40759g;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + ((long) (this.f40762s - this.f40761r));
                }
                return mo56121d(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: c */
        public final long mo56119c(long j) {
            boolean z;
            long j2 = j;
            m40 m40 = this.f40756a;
            if (m40 == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f40757d) {
                long size = m40.size();
                int i = (j2 > size ? 1 : (j2 == size ? 0 : -1));
                int i2 = 1;
                if (i <= 0) {
                    if (j2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j3 = size - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            ct5 ct5 = m40.f40752a;
                            vx2.m53588d(ct5);
                            ct5 ct52 = ct5.f37206g;
                            vx2.m53588d(ct52);
                            int i3 = ct52.f37202c;
                            long j4 = (long) (i3 - ct52.f37201b);
                            if (j4 > j3) {
                                ct52.f37202c = i3 - ((int) j3);
                                break;
                            }
                            m40.f40752a = ct52.mo51003b();
                            et5.m57488b(ct52);
                            j3 -= j4;
                        }
                        mo56122e((ct5) null);
                        this.f40759g = j2;
                        this.f40760k = null;
                        this.f40761r = -1;
                        this.f40762s = -1;
                    } else {
                        throw new IllegalArgumentException(vx2.m53598n("newSize < 0: ", Long.valueOf(j)).toString());
                    }
                } else if (i > 0) {
                    long j5 = j2 - size;
                    boolean z2 = true;
                    while (j5 > 0) {
                        ct5 O = m40.mo56033O(i2);
                        int min = (int) Math.min(j5, (long) (8192 - O.f37202c));
                        O.f37202c += min;
                        j5 -= (long) min;
                        if (z2) {
                            mo56122e(O);
                            this.f40759g = size;
                            this.f40760k = O.f37200a;
                            int i4 = O.f37202c;
                            this.f40761r = i4 - min;
                            this.f40762s = i4;
                            z2 = false;
                        }
                        i2 = 1;
                    }
                }
                m40.mo56027K(j2);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public void close() {
            boolean z;
            if (this.f40756a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f40756a = null;
                mo56122e((ct5) null);
                this.f40759g = -1;
                this.f40760k = null;
                this.f40761r = -1;
                this.f40762s = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: d */
        public final int mo56121d(long j) {
            ct5 ct5;
            m40 m40 = this.f40756a;
            if (m40 != null) {
                int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
                if (i < 0 || j > m40.size()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + m40.size());
                } else if (i == 0 || j == m40.size()) {
                    mo56122e((ct5) null);
                    this.f40759g = j;
                    this.f40760k = null;
                    this.f40761r = -1;
                    this.f40762s = -1;
                    return -1;
                } else {
                    long j2 = 0;
                    long size = m40.size();
                    ct5 ct52 = m40.f40752a;
                    if (mo56117a() != null) {
                        long j3 = this.f40759g;
                        int i2 = this.f40761r;
                        ct5 a = mo56117a();
                        vx2.m53588d(a);
                        long j4 = j3 - ((long) (i2 - a.f37201b));
                        if (j4 > j) {
                            ct5 ct53 = ct52;
                            ct52 = mo56117a();
                            size = j4;
                            ct5 = ct53;
                        } else {
                            long j5 = j4;
                            ct5 = mo56117a();
                            j2 = j5;
                        }
                    } else {
                        ct5 = ct52;
                    }
                    if (size - j > j - j2) {
                        while (true) {
                            vx2.m53588d(ct5);
                            int i3 = ct5.f37202c;
                            int i4 = ct5.f37201b;
                            if (j < ((long) (i3 - i4)) + j2) {
                                break;
                            }
                            j2 += (long) (i3 - i4);
                            ct5 = ct5.f37205f;
                        }
                    } else {
                        while (size > j) {
                            vx2.m53588d(ct52);
                            ct52 = ct52.f37206g;
                            vx2.m53588d(ct52);
                            size -= (long) (ct52.f37202c - ct52.f37201b);
                        }
                        j2 = size;
                        ct5 = ct52;
                    }
                    if (this.f40757d) {
                        vx2.m53588d(ct5);
                        if (ct5.f37203d) {
                            ct5 f = ct5.mo51007f();
                            if (m40.f40752a == ct5) {
                                m40.f40752a = f;
                            }
                            ct5 = ct5.mo51004c(f);
                            ct5 ct54 = ct5.f37206g;
                            vx2.m53588d(ct54);
                            ct54.mo51003b();
                        }
                    }
                    mo56122e(ct5);
                    this.f40759g = j;
                    vx2.m53588d(ct5);
                    this.f40760k = ct5.f37200a;
                    int i5 = ct5.f37201b + ((int) (j - j2));
                    this.f40761r = i5;
                    int i6 = ct5.f37202c;
                    this.f40762s = i6;
                    return i6 - i5;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
        }

        /* renamed from: e */
        public final void mo56122e(ct5 ct5) {
            this.f40758e = ct5;
        }
    }

    /* renamed from: y */
    public static /* synthetic */ C7863c m64075y(m40 m40, C7863c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = zp7.m75206d();
        }
        return m40.mo56103x(cVar);
    }

    /* renamed from: C */
    public short mo56018C() throws EOFException {
        return zp7.m75210h(readShort());
    }

    /* renamed from: F */
    public m40 mo56019F() {
        return this;
    }

    /* renamed from: F0 */
    public byte[] mo56020F0() {
        return mo56077p0(size());
    }

    /* renamed from: G */
    public String mo56021G(long j, Charset charset) throws EOFException {
        boolean z;
        vx2.m53591g(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount: ", Long.valueOf(j)).toString());
        } else if (this.f40753d < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            int i2 = ct5.f37201b;
            if (((long) i2) + j > ((long) ct5.f37202c)) {
                return new String(mo56077p0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(ct5.f37200a, i2, i3, charset);
            int i4 = ct5.f37201b + i3;
            ct5.f37201b = i4;
            this.f40753d -= j;
            if (i4 == ct5.f37202c) {
                this.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            }
            return str;
        }
    }

    /* renamed from: I */
    public String mo56023I(long j) throws EOFException {
        return mo56021G(j, ae0.f36435b);
    }

    /* renamed from: I0 */
    public boolean mo56024I0() {
        if (this.f40753d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public int mo56025J() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (size() != 0) {
            byte j = mo56066j(0);
            boolean z = false;
            if ((j & 128) == 0) {
                b2 = j & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((j & 224) == 192) {
                b2 = j & 31;
                i = 2;
                b = 128;
            } else if ((j & 240) == 224) {
                b2 = j & 15;
                i = 3;
                b = 2048;
            } else if ((j & 248) == 240) {
                b2 = j & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j2 = (long) i;
            if (size() >= j2) {
                if (1 < i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2 + 1;
                        long j3 = (long) i2;
                        byte j4 = mo56066j(j3);
                        if ((j4 & 192) == 128) {
                            b2 = (b2 << 6) | (j4 & 63);
                            if (i3 >= i) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            skip(j3);
                            return 65533;
                        }
                    }
                }
                skip(j2);
                if (b2 > 1114111) {
                    return 65533;
                }
                if (55296 <= b2 && b2 <= 57343) {
                    z = true;
                }
                if (!z && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            throw new EOFException("size < " + i + ": " + size() + " (to read code point prefixed 0x" + zp7.m75211i(j) + ')');
        }
        throw new EOFException();
    }

    /* renamed from: J0 */
    public int mo56026J0(wi4 wi4) {
        vx2.m53591g(wi4, "options");
        int f = up7.m72973f(this, wi4, false, 2, (Object) null);
        if (f == -1) {
            return -1;
        }
        skip((long) wi4.mo66713n()[f].size());
        return f;
    }

    /* renamed from: K */
    public final void mo56027K(long j) {
        this.f40753d = j;
    }

    /* renamed from: L */
    public final ByteString mo56028L() {
        boolean z;
        if (size() <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo56032N((int) size());
        }
        throw new IllegalStateException(vx2.m53598n("size > Int.MAX_VALUE: ", Long.valueOf(size())).toString());
    }

    /* renamed from: L0 */
    public long mo56029L0(z56 z56) throws IOException {
        vx2.m53591g(z56, "source");
        long j = 0;
        while (true) {
            long read = z56.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: M */
    public long mo56030M(ByteString byteString) throws IOException {
        vx2.m53591g(byteString, "bytes");
        return mo56071m(byteString, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r6 == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r5 >= r14) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (size() == 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r6 == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + p000.zp7.m75211i(mo56066j(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r6 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo56031M0() throws java.io.EOFException {
        /*
            r16 = this;
            r0 = r16
            long r1 = r16.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            r1 = -7
            r5 = 0
            r8 = r3
            r6 = r5
            r7 = r6
        L_0x0012:
            ct5 r10 = r0.f40752a
            p000.vx2.m53588d(r10)
            byte[] r11 = r10.f37200a
            int r12 = r10.f37201b
            int r13 = r10.f37202c
        L_0x001d:
            if (r12 >= r13) goto L_0x0078
            byte r15 = r11[r12]
            r14 = 48
            byte r14 = (byte) r14
            if (r15 < r14) goto L_0x0065
            r3 = 57
            byte r3 = (byte) r3
            if (r15 > r3) goto L_0x0065
            int r14 = r14 - r15
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0043
            if (r3 != 0) goto L_0x003d
            long r3 = (long) r14
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L_0x0070
        L_0x0043:
            m40 r1 = new m40
            r1.<init>()
            m40 r1 = r1.mo56096w0(r8)
            m40 r1 = r1.writeByte(r15)
            if (r6 != 0) goto L_0x0055
            r1.readByte()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.mo56048b1()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = p000.vx2.m53598n(r3, r1)
            r2.<init>(r1)
            throw r2
        L_0x0065:
            r3 = 45
            byte r3 = (byte) r3
            if (r15 != r3) goto L_0x0077
            if (r5 != 0) goto L_0x0077
            r3 = 1
            long r1 = r1 - r3
            r6 = 1
        L_0x0070:
            int r12 = r12 + 1
            int r5 = r5 + 1
            r3 = 0
            goto L_0x001d
        L_0x0077:
            r7 = 1
        L_0x0078:
            if (r12 != r13) goto L_0x0084
            ct5 r3 = r10.mo51003b()
            r0.f40752a = r3
            p000.et5.m57488b(r10)
            goto L_0x0086
        L_0x0084:
            r10.f37201b = r12
        L_0x0086:
            if (r7 != 0) goto L_0x0090
            ct5 r3 = r0.f40752a
            if (r3 != 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r3 = 0
            goto L_0x0012
        L_0x0090:
            long r1 = r16.size()
            long r3 = (long) r5
            long r1 = r1 - r3
            r0.mo56027K(r1)
            if (r6 == 0) goto L_0x009d
            r14 = 2
            goto L_0x009e
        L_0x009d:
            r14 = 1
        L_0x009e:
            if (r5 >= r14) goto L_0x00db
            long r1 = r16.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00af
            java.lang.String r1 = "Expected a digit"
            goto L_0x00b1
        L_0x00af:
            java.lang.String r1 = "Expected a digit or '-'"
        L_0x00b1:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r1 = r0.mo56066j(r4)
            java.lang.String r1 = p000.zp7.m75211i(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00d5:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00db:
            if (r6 == 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            long r8 = -r8
        L_0x00df:
            return r8
        L_0x00e0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m40.mo56031M0():long");
    }

    /* renamed from: N */
    public final ByteString mo56032N(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        zp7.m75204b(size(), 0, (long) i);
        ct5 ct5 = this.f40752a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            vx2.m53588d(ct5);
            int i5 = ct5.f37202c;
            int i6 = ct5.f37201b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                ct5 = ct5.f37205f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        ct5 ct52 = this.f40752a;
        int i7 = 0;
        while (i2 < i) {
            vx2.m53588d(ct52);
            bArr[i7] = ct52.f37200a;
            i2 += ct52.f37202c - ct52.f37201b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ct52.f37201b;
            ct52.f37203d = true;
            i7++;
            ct52 = ct52.f37205f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    /* renamed from: O */
    public final ct5 mo56033O(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            ct5 ct5 = this.f40752a;
            if (ct5 == null) {
                ct5 c = et5.m57489c();
                this.f40752a = c;
                c.f37206g = c;
                c.f37205f = c;
                return c;
            }
            vx2.m53588d(ct5);
            ct5 ct52 = ct5.f37206g;
            vx2.m53588d(ct52);
            if (ct52.f37202c + i > 8192 || !ct52.f37204e) {
                return ct52.mo51004c(et5.m57489c());
            }
            return ct52;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: P */
    public m40 mo56034P(z56 z56, long j) throws IOException {
        vx2.m53591g(z56, "source");
        while (j > 0) {
            long read = z56.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: R0 */
    public long mo56035R0(s36 s36) throws IOException {
        vx2.m53591g(s36, "sink");
        long size = size();
        if (size > 0) {
            s36.write(this, size);
        }
        return size;
    }

    /* renamed from: S */
    public m40 mo56054e1(ByteString byteString) {
        vx2.m53591g(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    /* renamed from: T */
    public long mo56037T(ByteString byteString) {
        vx2.m53591g(byteString, "targetBytes");
        return mo56076p(byteString, 0);
    }

    /* renamed from: T0 */
    public String mo56038T0(Charset charset) {
        vx2.m53591g(charset, "charset");
        return mo56021G(this.f40753d, charset);
    }

    /* renamed from: V */
    public String mo56041V(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long l = mo56069l(b, 0, j2);
            if (l != -1) {
                return up7.m72971d(this, l);
            }
            if (j2 < size() && mo56066j(j2 - 1) == ((byte) 13) && mo56066j(j2) == b) {
                return up7.m72971d(this, j2);
            }
            m40 m40 = new m40();
            mo56058g(m40, 0, Math.min((long) 32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + m40.mo56042V0().hex() + 8230);
        }
        throw new IllegalArgumentException(vx2.m53598n("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: V0 */
    public ByteString mo56042V0() {
        return mo56106z0(size());
    }

    /* renamed from: Y */
    public m40 write(byte[] bArr) {
        vx2.m53591g(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void mo56045a() {
        skip(size());
    }

    /* renamed from: a0 */
    public boolean mo56046a0(long j, ByteString byteString) {
        vx2.m53591g(byteString, "bytes");
        return mo56095v(j, byteString, 0, byteString.size());
    }

    /* renamed from: b */
    public m40 clone() {
        return mo56056f();
    }

    /* renamed from: b1 */
    public String mo56048b1() {
        return mo56021G(this.f40753d, ae0.f36435b);
    }

    /* renamed from: c0 */
    public m40 write(byte[] bArr, int i, int i2) {
        vx2.m53591g(bArr, "source");
        long j = (long) i2;
        zp7.m75204b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            ct5 O = mo56033O(1);
            int min = Math.min(i3 - i, 8192 - O.f37202c);
            int i4 = i + min;
            C6706xq.m54491e(bArr, O.f37200a, O.f37202c, i, i4);
            O.f37202c += min;
            i = i4;
        }
        mo56027K(size() + j);
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public final long mo56051d() {
        long size = size();
        if (size == 0) {
            return 0;
        }
        ct5 ct5 = this.f40752a;
        vx2.m53588d(ct5);
        ct5 ct52 = ct5.f37206g;
        vx2.m53588d(ct52);
        int i = ct52.f37202c;
        if (i < 8192 && ct52.f37204e) {
            size -= (long) (i - ct52.f37201b);
        }
        return size;
    }

    /* renamed from: e0 */
    public m40 writeByte(int i) {
        ct5 O = mo56033O(1);
        byte[] bArr = O.f37200a;
        int i2 = O.f37202c;
        O.f37202c = i2 + 1;
        bArr[i2] = (byte) i;
        mo56027K(size() + 1);
        return this;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x008b
        L_0x000b:
            boolean r4 = r1 instanceof p000.m40
            if (r4 != 0) goto L_0x0011
            goto L_0x008b
        L_0x0011:
            long r4 = r18.size()
            m40 r1 = (p000.m40) r1
            long r6 = r1.size()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0021
            goto L_0x008b
        L_0x0021:
            long r4 = r18.size()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            goto L_0x0008
        L_0x002c:
            ct5 r4 = r0.f40752a
            p000.vx2.m53588d(r4)
            ct5 r1 = r1.f40752a
            p000.vx2.m53588d(r1)
            int r5 = r4.f37201b
            int r8 = r1.f37201b
            r9 = r6
        L_0x003b:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f37202c
            int r11 = r11 - r5
            int r12 = r1.f37202c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0073
            r13 = r6
        L_0x0053:
            r15 = 1
            long r13 = r13 + r15
            byte[] r15 = r4.f37200a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f37200a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x006e
            r5 = r16
            r8 = r17
            goto L_0x0073
        L_0x006e:
            r5 = r16
            r8 = r17
            goto L_0x0053
        L_0x0073:
            int r13 = r4.f37202c
            if (r5 != r13) goto L_0x007e
            ct5 r4 = r4.f37205f
            p000.vx2.m53588d(r4)
            int r5 = r4.f37201b
        L_0x007e:
            int r13 = r1.f37202c
            if (r8 != r13) goto L_0x0089
            ct5 r1 = r1.f37205f
            p000.vx2.m53588d(r1)
            int r8 = r1.f37201b
        L_0x0089:
            long r9 = r9 + r11
            goto L_0x003b
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m40.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final m40 mo56056f() {
        m40 m40 = new m40();
        if (size() != 0) {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            ct5 d = ct5.mo51005d();
            m40.f40752a = d;
            d.f37206g = d;
            d.f37205f = d;
            for (ct5 ct52 = ct5.f37205f; ct52 != ct5; ct52 = ct52.f37205f) {
                ct5 ct53 = d.f37206g;
                vx2.m53588d(ct53);
                vx2.m53588d(ct52);
                ct53.mo51004c(ct52.mo51005d());
            }
            m40.mo56027K(size());
        }
        return m40;
    }

    /* renamed from: f0 */
    public void mo56057f0(m40 m40, long j) throws EOFException {
        vx2.m53591g(m40, "sink");
        if (size() >= j) {
            m40.write(this, j);
        } else {
            m40.write(this, size());
            throw new EOFException();
        }
    }

    public void flush() {
    }

    /* renamed from: g */
    public final m40 mo56058g(m40 m40, long j, long j2) {
        vx2.m53591g(m40, "out");
        zp7.m75204b(size(), j, j2);
        if (j2 != 0) {
            m40.mo56027K(m40.size() + j2);
            ct5 ct5 = this.f40752a;
            while (true) {
                vx2.m53588d(ct5);
                int i = ct5.f37202c;
                int i2 = ct5.f37201b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                ct5 = ct5.f37205f;
            }
            while (j2 > 0) {
                vx2.m53588d(ct5);
                ct5 d = ct5.mo51005d();
                int i3 = d.f37201b + ((int) j);
                d.f37201b = i3;
                d.f37202c = Math.min(i3 + ((int) j2), d.f37202c);
                ct5 ct52 = m40.f40752a;
                if (ct52 == null) {
                    d.f37206g = d;
                    d.f37205f = d;
                    m40.f40752a = d;
                } else {
                    vx2.m53588d(ct52);
                    ct5 ct53 = ct52.f37206g;
                    vx2.m53588d(ct53);
                    ct53.mo51004c(d);
                }
                j2 -= (long) (d.f37202c - d.f37201b);
                ct5 = ct5.f37205f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: g0 */
    public m40 mo56096w0(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo56044Z("-9223372036854775808");
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        ct5 O = mo56033O(i2);
        byte[] bArr = O.f37200a;
        int i3 = O.f37202c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = up7.m72969b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        O.f37202c += i2;
        mo56027K(size() + ((long) i2));
        return this;
    }

    /* renamed from: h */
    public m40 mo56022H() {
        return this;
    }

    /* renamed from: h0 */
    public m40 mo56040U0(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        ct5 O = mo56033O(i);
        byte[] bArr = O.f37200a;
        int i2 = O.f37202c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = up7.m72969b()[(int) (15 & j)];
            j >>>= 4;
        }
        O.f37202c += i;
        mo56027K(size() + ((long) i));
        return this;
    }

    public int hashCode() {
        ct5 ct5 = this.f40752a;
        if (ct5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ct5.f37202c;
            for (int i3 = ct5.f37201b; i3 < i2; i3++) {
                i = (i * 31) + ct5.f37200a[i3];
            }
            ct5 = ct5.f37205f;
            vx2.m53588d(ct5);
        } while (ct5 != this.f40752a);
        return i;
    }

    /* renamed from: i */
    public m40 mo56039U() {
        return this;
    }

    /* renamed from: i0 */
    public m40 writeInt(int i) {
        ct5 O = mo56033O(4);
        byte[] bArr = O.f37200a;
        int i2 = O.f37202c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        O.f37202c = i5 + 1;
        mo56027K(size() + 4);
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final byte mo56066j(long j) {
        zp7.m75204b(size(), j, 1);
        ct5 ct5 = this.f40752a;
        if (ct5 == null) {
            vx2.m53588d((Object) null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                ct5 = ct5.f37206g;
                vx2.m53588d(ct5);
                size -= (long) (ct5.f37202c - ct5.f37201b);
            }
            vx2.m53588d(ct5);
            return ct5.f37200a[(int) ((((long) ct5.f37201b) + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (ct5.f37202c - ct5.f37201b)) + j2;
                if (j3 > j) {
                    vx2.m53588d(ct5);
                    return ct5.f37200a[(int) ((((long) ct5.f37201b) + j) - j2)];
                }
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                j2 = j3;
            }
        }
    }

    /* renamed from: j0 */
    public m40 mo56067j0(long j) {
        ct5 O = mo56033O(8);
        byte[] bArr = O.f37200a;
        int i = O.f37202c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        O.f37202c = i8 + 1;
        mo56027K(size() + 8);
        return this;
    }

    /* renamed from: k0 */
    public m40 writeShort(int i) {
        ct5 O = mo56033O(2);
        byte[] bArr = O.f37200a;
        int i2 = O.f37202c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        O.f37202c = i3 + 1;
        mo56027K(size() + 2);
        return this;
    }

    /* renamed from: l */
    public long mo56069l(byte b, long j, long j2) {
        ct5 ct5;
        long j3;
        int i;
        long j4 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > size()) {
                j2 = size();
            }
            long j5 = j2;
            if (j == j5 || (ct5 = this.f40752a) == null) {
                return -1;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    ct5 = ct5.f37206g;
                    vx2.m53588d(ct5);
                    j3 -= (long) (ct5.f37202c - ct5.f37201b);
                }
                while (j3 < j5) {
                    byte[] bArr = ct5.f37200a;
                    int min = (int) Math.min((long) ct5.f37202c, (((long) ct5.f37201b) + j5) - j3);
                    i = (int) ((((long) ct5.f37201b) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (ct5.f37202c - ct5.f37201b);
                    ct5 = ct5.f37205f;
                    vx2.m53588d(ct5);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j6 = ((long) (ct5.f37202c - ct5.f37201b)) + j4;
                if (j6 > j) {
                    break;
                }
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                j4 = j6;
            }
            while (j3 < j5) {
                byte[] bArr2 = ct5.f37200a;
                int min2 = (int) Math.min((long) ct5.f37202c, (((long) ct5.f37201b) + j5) - j3);
                int i2 = (int) ((((long) ct5.f37201b) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (ct5.f37202c - ct5.f37201b));
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                j = j4;
            }
            return -1;
            return ((long) (i - ct5.f37201b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: l0 */
    public m40 mo56070l0(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        vx2.m53591g(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (vx2.m53586b(charset, ae0.f36435b)) {
                    return mo56052d0(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    vx2.m53590f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        vx2.m53590f(bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(vx2.m53598n("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
    }

    /* renamed from: m */
    public long mo56071m(ByteString byteString, long j) throws IOException {
        boolean z;
        boolean z2;
        vx2.m53591g(byteString, "bytes");
        if (byteString.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = 0;
            if (j >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ct5 ct5 = this.f40752a;
                if (ct5 != null) {
                    if (size() - j < j) {
                        long size = size();
                        while (size > j) {
                            ct5 = ct5.f37206g;
                            vx2.m53588d(ct5);
                            size -= (long) (ct5.f37202c - ct5.f37201b);
                        }
                        byte[] internalArray$okio = byteString.internalArray$okio();
                        byte b = internalArray$okio[0];
                        int size2 = byteString.size();
                        long size3 = (size() - ((long) size2)) + 1;
                        long j3 = size;
                        long j4 = j;
                        while (j3 < size3) {
                            byte[] bArr = ct5.f37200a;
                            int min = (int) Math.min((long) ct5.f37202c, (((long) ct5.f37201b) + size3) - j3);
                            int i = (int) ((((long) ct5.f37201b) + j4) - j3);
                            if (i < min) {
                                while (true) {
                                    int i2 = i + 1;
                                    if (bArr[i] == b && up7.m72970c(ct5, i2, internalArray$okio, 1, size2)) {
                                        return ((long) (i - ct5.f37201b)) + j3;
                                    }
                                    if (i2 >= min) {
                                        break;
                                    }
                                    i = i2;
                                }
                            }
                            j3 += (long) (ct5.f37202c - ct5.f37201b);
                            ct5 = ct5.f37205f;
                            vx2.m53588d(ct5);
                            j4 = j3;
                        }
                    } else {
                        while (true) {
                            long j5 = ((long) (ct5.f37202c - ct5.f37201b)) + j2;
                            if (j5 > j) {
                                break;
                            }
                            ct5 = ct5.f37205f;
                            vx2.m53588d(ct5);
                            j2 = j5;
                        }
                        byte[] internalArray$okio2 = byteString.internalArray$okio();
                        byte b2 = internalArray$okio2[0];
                        int size4 = byteString.size();
                        long size5 = (size() - ((long) size4)) + 1;
                        long j6 = j2;
                        long j7 = j;
                        while (j6 < size5) {
                            byte[] bArr2 = ct5.f37200a;
                            long j8 = size5;
                            int min2 = (int) Math.min((long) ct5.f37202c, (((long) ct5.f37201b) + size5) - j6);
                            int i3 = (int) ((((long) ct5.f37201b) + j7) - j6);
                            if (i3 < min2) {
                                while (true) {
                                    int i4 = i3 + 1;
                                    if (bArr2[i3] == b2 && up7.m72970c(ct5, i4, internalArray$okio2, 1, size4)) {
                                        return ((long) (i3 - ct5.f37201b)) + j6;
                                    }
                                    if (i4 >= min2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                            j6 += (long) (ct5.f37202c - ct5.f37201b);
                            ct5 = ct5.f37205f;
                            vx2.m53588d(ct5);
                            j7 = j6;
                            size5 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(vx2.m53598n("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: m0 */
    public String mo56072m0() throws EOFException {
        return mo56041V(Long.MAX_VALUE);
    }

    /* renamed from: n1 */
    public OutputStream mo56073n1() {
        return new C7862b(this);
    }

    /* renamed from: o0 */
    public m40 mo56074o0(String str, Charset charset) {
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        vx2.m53591g(charset, "charset");
        return mo56070l0(str, 0, str.length(), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r8 != r9) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r14.f40752a = r6.mo51003b();
        p000.et5.m57488b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r6.f37201b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1 != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo56075o1() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            ct5 r6 = r14.f40752a
            p000.vx2.m53588d(r6)
            byte[] r7 = r6.f37200a
            int r8 = r6.f37201b
            int r9 = r6.f37202c
        L_0x0018:
            if (r8 >= r9) goto L_0x0084
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0070
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0070
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            m40 r0 = new m40
            r0.<init>()
            m40 r0 = r0.mo56040U0(r4)
            m40 r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.mo56048b1()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = p000.vx2.m53598n(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0084
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = p000.zp7.m75211i(r10)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = p000.vx2.m53598n(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0084:
            if (r8 != r9) goto L_0x0090
            ct5 r7 = r6.mo51003b()
            r14.f40752a = r7
            p000.et5.m57488b(r6)
            goto L_0x0092
        L_0x0090:
            r6.f37201b = r8
        L_0x0092:
            if (r1 != 0) goto L_0x0098
            ct5 r6 = r14.f40752a
            if (r6 != 0) goto L_0x000d
        L_0x0098:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.mo56027K(r1)
            return r4
        L_0x00a2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m40.mo56075o1():long");
    }

    /* renamed from: p */
    public long mo56076p(ByteString byteString, long j) {
        boolean z;
        long j2;
        int i;
        int i2;
        int i3;
        vx2.m53591g(byteString, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ct5 ct5 = this.f40752a;
            if (ct5 == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    ct5 = ct5.f37206g;
                    vx2.m53588d(ct5);
                    j2 -= (long) (ct5.f37202c - ct5.f37201b);
                }
                if (byteString.size() == 2) {
                    byte b = byteString.getByte(0);
                    byte b2 = byteString.getByte(1);
                    while (j2 < size()) {
                        byte[] bArr = ct5.f37200a;
                        i2 = (int) ((((long) ct5.f37201b) + j) - j2);
                        int i4 = ct5.f37202c;
                        while (i2 < i4) {
                            byte b3 = bArr[i2];
                            if (!(b3 == b || b3 == b2)) {
                                i2++;
                            }
                        }
                        j2 += (long) (ct5.f37202c - ct5.f37201b);
                        ct5 = ct5.f37205f;
                        vx2.m53588d(ct5);
                        j = j2;
                    }
                    return -1;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j2 < size()) {
                    byte[] bArr2 = ct5.f37200a;
                    i = (int) ((((long) ct5.f37201b) + j) - j2);
                    int i5 = ct5.f37202c;
                    while (i < i5) {
                        byte b4 = bArr2[i];
                        int length = internalArray$okio.length;
                        int i6 = 0;
                        while (i6 < length) {
                            byte b5 = internalArray$okio[i6];
                            i6++;
                            if (b4 == b5) {
                                i3 = ct5.f37201b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i++;
                    }
                    j2 += (long) (ct5.f37202c - ct5.f37201b);
                    ct5 = ct5.f37205f;
                    vx2.m53588d(ct5);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (ct5.f37202c - ct5.f37201b)) + j3;
                if (j4 > j) {
                    break;
                }
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                j3 = j4;
            }
            if (byteString.size() == 2) {
                byte b6 = byteString.getByte(0);
                byte b7 = byteString.getByte(1);
                while (j2 < size()) {
                    byte[] bArr3 = ct5.f37200a;
                    int i7 = (int) ((((long) ct5.f37201b) + j) - j2);
                    int i8 = ct5.f37202c;
                    while (i2 < i8) {
                        byte b8 = bArr3[i2];
                        if (!(b8 == b6 || b8 == b7)) {
                            i7 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (ct5.f37202c - ct5.f37201b));
                    ct5 = ct5.f37205f;
                    vx2.m53588d(ct5);
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < size()) {
                byte[] bArr4 = ct5.f37200a;
                int i9 = (int) ((((long) ct5.f37201b) + j) - j2);
                int i10 = ct5.f37202c;
                while (i < i10) {
                    byte b9 = bArr4[i];
                    int length2 = internalArray$okio2.length;
                    int i11 = 0;
                    while (i11 < length2) {
                        byte b10 = internalArray$okio2[i11];
                        i11++;
                        if (b9 == b10) {
                            i3 = ct5.f37201b;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i9 = i + 1;
                }
                j3 = j2 + ((long) (ct5.f37202c - ct5.f37201b));
                ct5 = ct5.f37205f;
                vx2.m53588d(ct5);
                j = j3;
            }
            return -1;
            i3 = ct5.f37201b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(vx2.m53598n("fromIndex < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: p0 */
    public byte[] mo56077p0(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount: ", Long.valueOf(j)).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: p1 */
    public InputStream mo56078p1() {
        return new C7861a(this);
    }

    public w40 peek() {
        return sg4.m71929d(new an4(this));
    }

    /* renamed from: q0 */
    public m40 mo56044Z(String str) {
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        return mo56052d0(str, 0, str.length());
    }

    /* renamed from: r */
    public m40 mo56081r() {
        return this;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        vx2.m53591g(byteBuffer, "sink");
        ct5 ct5 = this.f40752a;
        if (ct5 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ct5.f37202c - ct5.f37201b);
        byteBuffer.put(ct5.f37200a, ct5.f37201b, min);
        int i = ct5.f37201b + min;
        ct5.f37201b = i;
        this.f40753d -= (long) min;
        if (i == ct5.f37202c) {
            this.f40752a = ct5.mo51003b();
            et5.m57488b(ct5);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (size() != 0) {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            int i = ct5.f37201b;
            int i2 = ct5.f37202c;
            int i3 = i + 1;
            byte b = ct5.f37200a[i];
            mo56027K(size() - 1);
            if (i3 == i2) {
                this.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            } else {
                ct5.f37201b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) throws EOFException {
        vx2.m53591g(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() throws EOFException {
        if (size() >= 4) {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            int i = ct5.f37201b;
            int i2 = ct5.f37202c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = ct5.f37200a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo56027K(size() - 4);
            if (i6 == i2) {
                this.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            } else {
                ct5.f37201b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() throws EOFException {
        if (size() >= 8) {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            int i = ct5.f37201b;
            int i2 = ct5.f37202c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = ct5.f37200a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mo56027K(size() - 8);
            if (i10 == i2) {
                this.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            } else {
                ct5.f37201b = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (size() >= 2) {
            ct5 ct5 = this.f40752a;
            vx2.m53588d(ct5);
            int i = ct5.f37201b;
            int i2 = ct5.f37202c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = ct5.f37200a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo56027K(size() - 2);
            if (i4 == i2) {
                this.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            } else {
                ct5.f37201b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    public boolean request(long j) {
        if (this.f40753d >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: s0 */
    public m40 mo56052d0(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        boolean z4;
        char charAt;
        vx2.m53591g(str, Utf8String.TYPE_NAME);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            ct5 O = mo56033O(1);
                            byte[] bArr = O.f37200a;
                            int i3 = O.f37202c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = O.f37202c;
                                    int i6 = (i3 + i) - i5;
                                    O.f37202c = i5 + i6;
                                    mo56027K(size() + ((long) i6));
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = O.f37202c;
                            int i62 = (i3 + i) - i52;
                            O.f37202c = i52 + i62;
                            mo56027K(size() + ((long) i62));
                        } else {
                            if (charAt2 < 2048) {
                                ct5 O2 = mo56033O(2);
                                byte[] bArr2 = O2.f37200a;
                                int i7 = O2.f37202c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                O2.f37202c = i7 + 2;
                                mo56027K(size() + 2);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                ct5 O3 = mo56033O(3);
                                byte[] bArr3 = O3.f37200a;
                                int i8 = O3.f37202c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                O3.f37202c = i8 + 3;
                                mo56027K(size() + 3);
                            } else {
                                int i9 = i + 1;
                                if (i9 < i2) {
                                    c = str.charAt(i9);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 > c || c > 57343) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4) {
                                        int i10 = (((charAt2 & 1023) << 10) | (c & 1023)) + Base64Variant.PADDING_CHAR_NONE;
                                        ct5 O4 = mo56033O(4);
                                        byte[] bArr4 = O4.f37200a;
                                        int i11 = O4.f37202c;
                                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                        O4.f37202c = i11 + 4;
                                        mo56027K(size() + 4);
                                        i += 2;
                                    }
                                }
                                writeByte(63);
                                i = i9;
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(vx2.m53598n("beginIndex < 0: ", Integer.valueOf(i)).toString());
    }

    public final long size() {
        return this.f40753d;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            ct5 ct5 = this.f40752a;
            if (ct5 != null) {
                int min = (int) Math.min(j, (long) (ct5.f37202c - ct5.f37201b));
                long j2 = (long) min;
                mo56027K(size() - j2);
                j -= j2;
                int i = ct5.f37201b + min;
                ct5.f37201b = i;
                if (i == ct5.f37202c) {
                    this.f40752a = ct5.mo51003b();
                    et5.m57488b(ct5);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public qq6 timeout() {
        return qq6.NONE;
    }

    public String toString() {
        return mo56028L().toString();
    }

    /* renamed from: u0 */
    public void mo56094u0(long j) throws EOFException {
        if (this.f40753d < j) {
            throw new EOFException();
        }
    }

    /* renamed from: v */
    public boolean mo56095v(long j, ByteString byteString, int i, int i2) {
        vx2.m53591g(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (mo56066j(((long) i3) + j) != byteString.getByte(i3 + i)) {
                    return false;
                }
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return true;
    }

    /* renamed from: x */
    public final C7863c mo56103x(C7863c cVar) {
        vx2.m53591g(cVar, "unsafeCursor");
        return up7.m72968a(this, cVar);
    }

    /* renamed from: x0 */
    public m40 mo56104x0(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            ct5 O = mo56033O(2);
            byte[] bArr = O.f37200a;
            int i2 = O.f37202c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            O.f37202c = i2 + 2;
            mo56027K(size() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i <= 57343) {
                z = true;
            }
            if (z) {
                writeByte(63);
            } else if (i < 65536) {
                ct5 O2 = mo56033O(3);
                byte[] bArr2 = O2.f37200a;
                int i3 = O2.f37202c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                O2.f37202c = i3 + 3;
                mo56027K(size() + 3);
            } else if (i <= 1114111) {
                ct5 O3 = mo56033O(4);
                byte[] bArr3 = O3.f37200a;
                int i4 = O3.f37202c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                O3.f37202c = i4 + 4;
                mo56027K(size() + 4);
            } else {
                throw new IllegalArgumentException(vx2.m53598n("Unexpected code point: 0x", zp7.m75212j(i)));
            }
        }
        return this;
    }

    /* renamed from: z */
    public int mo56105z() throws EOFException {
        return zp7.m75209g(readInt());
    }

    /* renamed from: z0 */
    public ByteString mo56106z0(long j) throws EOFException {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount: ", Long.valueOf(j)).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new ByteString(mo56077p0(j));
        } else {
            ByteString N = mo56032N((int) j);
            skip(j);
            return N;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, mo44877d2 = {"m40$a", "Ljava/io/InputStream;", "", "read", "", "sink", "offset", "byteCount", "available", "Lr37;", "close", "", "toString", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: m40$a */
    /* compiled from: Buffer.kt */
    public static final class C7861a extends InputStream {

        /* renamed from: a */
        public final /* synthetic */ m40 f40754a;

        public C7861a(m40 m40) {
            this.f40754a = m40;
        }

        public int available() {
            return (int) Math.min(this.f40754a.size(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f40754a.size() > 0) {
                return this.f40754a.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f40754a + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            vx2.m53591g(bArr, "sink");
            return this.f40754a.read(bArr, i, i2);
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        vx2.m53591g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ct5 O = mo56033O(1);
            int min = Math.min(i, 8192 - O.f37202c);
            byteBuffer.get(O.f37200a, O.f37202c, min);
            i -= min;
            O.f37202c += min;
        }
        this.f40753d += (long) remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i, int i2) {
        vx2.m53591g(bArr, "sink");
        zp7.m75204b((long) bArr.length, (long) i, (long) i2);
        ct5 ct5 = this.f40752a;
        if (ct5 == null) {
            return -1;
        }
        int min = Math.min(i2, ct5.f37202c - ct5.f37201b);
        byte[] bArr2 = ct5.f37200a;
        int i3 = ct5.f37201b;
        C6706xq.m54491e(bArr2, bArr, i, i3, i3 + min);
        ct5.f37201b += min;
        mo56027K(size() - ((long) min));
        if (ct5.f37201b == ct5.f37202c) {
            this.f40752a = ct5.mo51003b();
            et5.m57488b(ct5);
        }
        return min;
    }

    public void write(m40 m40, long j) {
        ct5 ct5;
        vx2.m53591g(m40, "source");
        if (m40 != this) {
            zp7.m75204b(m40.size(), 0, j);
            while (j > 0) {
                ct5 ct52 = m40.f40752a;
                vx2.m53588d(ct52);
                int i = ct52.f37202c;
                ct5 ct53 = m40.f40752a;
                vx2.m53588d(ct53);
                if (j < ((long) (i - ct53.f37201b))) {
                    ct5 ct54 = this.f40752a;
                    if (ct54 != null) {
                        vx2.m53588d(ct54);
                        ct5 = ct54.f37206g;
                    } else {
                        ct5 = null;
                    }
                    if (ct5 != null && ct5.f37204e) {
                        if ((((long) ct5.f37202c) + j) - ((long) (ct5.f37203d ? 0 : ct5.f37201b)) <= 8192) {
                            ct5 ct55 = m40.f40752a;
                            vx2.m53588d(ct55);
                            ct55.mo51008g(ct5, (int) j);
                            m40.mo56027K(m40.size() - j);
                            mo56027K(size() + j);
                            return;
                        }
                    }
                    ct5 ct56 = m40.f40752a;
                    vx2.m53588d(ct56);
                    m40.f40752a = ct56.mo51006e((int) j);
                }
                ct5 ct57 = m40.f40752a;
                vx2.m53588d(ct57);
                long j2 = (long) (ct57.f37202c - ct57.f37201b);
                m40.f40752a = ct57.mo51003b();
                ct5 ct58 = this.f40752a;
                if (ct58 == null) {
                    this.f40752a = ct57;
                    ct57.f37206g = ct57;
                    ct57.f37205f = ct57;
                } else {
                    vx2.m53588d(ct58);
                    ct5 ct59 = ct58.f37206g;
                    vx2.m53588d(ct59);
                    ct59.mo51004c(ct57).mo51002a();
                }
                m40.mo56027K(m40.size() - j2);
                mo56027K(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public long read(m40 m40, long j) {
        vx2.m53591g(m40, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (size() == 0) {
            return -1;
        } else {
            if (j > size()) {
                j = size();
            }
            m40.write(this, j);
            return j;
        }
    }
}
