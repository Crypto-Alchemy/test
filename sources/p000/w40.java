package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H&J\b\u0010%\u001a\u00020$H&J\b\u0010&\u001a\u00020$H&J\u0010\u0010(\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H&J\u0018\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\b\u00102\u001a\u00020\u0000H&J\b\u00104\u001a\u000203H&R\u0014\u00107\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, mo44877d2 = {"Lw40;", "Lz56;", "Ljava/nio/channels/ReadableByteChannel;", "Lm40;", "F", "", "I0", "", "byteCount", "Lr37;", "u0", "request", "", "readByte", "", "readShort", "", "readInt", "readLong", "M0", "o1", "skip", "Lokio/ByteString;", "V0", "z0", "Lwi4;", "options", "J0", "", "F0", "p0", "sink", "readFully", "f0", "Ls36;", "R0", "", "b1", "m0", "limit", "V", "Ljava/nio/charset/Charset;", "charset", "T0", "bytes", "M", "targetBytes", "T", "offset", "a0", "peek", "Ljava/io/InputStream;", "p1", "r", "()Lm40;", "buffer", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: w40 */
/* compiled from: BufferedSource.kt */
public interface w40 extends z56, ReadableByteChannel {
    /* renamed from: F */
    m40 mo56019F();

    /* renamed from: F0 */
    byte[] mo56020F0() throws IOException;

    /* renamed from: I0 */
    boolean mo56024I0() throws IOException;

    /* renamed from: J0 */
    int mo56026J0(wi4 wi4) throws IOException;

    /* renamed from: M */
    long mo56030M(ByteString byteString) throws IOException;

    /* renamed from: M0 */
    long mo56031M0() throws IOException;

    /* renamed from: R0 */
    long mo56035R0(s36 s36) throws IOException;

    /* renamed from: T */
    long mo56037T(ByteString byteString) throws IOException;

    /* renamed from: T0 */
    String mo56038T0(Charset charset) throws IOException;

    /* renamed from: V */
    String mo56041V(long j) throws IOException;

    /* renamed from: V0 */
    ByteString mo56042V0() throws IOException;

    /* renamed from: a0 */
    boolean mo56046a0(long j, ByteString byteString) throws IOException;

    /* renamed from: b1 */
    String mo56048b1() throws IOException;

    /* renamed from: f0 */
    void mo56057f0(m40 m40, long j) throws IOException;

    /* renamed from: m0 */
    String mo56072m0() throws IOException;

    /* renamed from: o1 */
    long mo56075o1() throws IOException;

    /* renamed from: p0 */
    byte[] mo56077p0(long j) throws IOException;

    /* renamed from: p1 */
    InputStream mo56078p1();

    w40 peek();

    /* renamed from: r */
    m40 mo56081r();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: u0 */
    void mo56094u0(long j) throws IOException;

    /* renamed from: z0 */
    ByteString mo56106z0(long j) throws IOException;
}
