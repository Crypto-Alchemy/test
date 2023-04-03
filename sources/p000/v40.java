package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u0000H&J\b\u0010!\u001a\u00020\u0000H&J\b\u0010#\u001a\u00020\"H&R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, mo44877d2 = {"Lv40;", "Ls36;", "Ljava/nio/channels/WritableByteChannel;", "Lokio/ByteString;", "byteString", "e1", "", "source", "write", "", "offset", "byteCount", "Lz56;", "", "L0", "", "string", "Z", "beginIndex", "endIndex", "d0", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "w0", "U0", "Lr37;", "flush", "H", "U", "Ljava/io/OutputStream;", "n1", "Lm40;", "r", "()Lm40;", "buffer", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: v40 */
/* compiled from: BufferedSink.kt */
public interface v40 extends s36, WritableByteChannel {
    /* renamed from: H */
    v40 mo56022H() throws IOException;

    /* renamed from: L0 */
    long mo56029L0(z56 z56) throws IOException;

    /* renamed from: U */
    v40 mo56039U() throws IOException;

    /* renamed from: U0 */
    v40 mo56040U0(long j) throws IOException;

    /* renamed from: Z */
    v40 mo56044Z(String str) throws IOException;

    /* renamed from: d0 */
    v40 mo56052d0(String str, int i, int i2) throws IOException;

    /* renamed from: e1 */
    v40 mo56054e1(ByteString byteString) throws IOException;

    void flush() throws IOException;

    /* renamed from: n1 */
    OutputStream mo56073n1();

    /* renamed from: r */
    m40 mo56081r();

    /* renamed from: w0 */
    v40 mo56096w0(long j) throws IOException;

    v40 write(byte[] bArr) throws IOException;

    v40 write(byte[] bArr, int i, int i2) throws IOException;

    v40 writeByte(int i) throws IOException;

    v40 writeInt(int i) throws IOException;

    v40 writeShort(int i) throws IOException;
}
