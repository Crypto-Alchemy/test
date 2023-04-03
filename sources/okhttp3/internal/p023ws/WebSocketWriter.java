package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import okio.ByteString;
import p000.m40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, mo44877d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/ByteString;", "payload", "Lr37;", "writeControlFrame", "writePing", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "", "isClient", "Z", "Lv40;", "sink", "Lv40;", "getSink", "()Lv40;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "Lm40;", "messageBuffer", "Lm40;", "sinkBuffer", "writerClosed", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lm40$c;", "maskCursor", "Lm40$c;", "<init>", "(ZLv40;Ljava/util/Random;ZZJ)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.WebSocketWriter */
/* compiled from: WebSocketWriter.kt */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final m40.C7863c maskCursor;
    private final byte[] maskKey;
    private final m40 messageBuffer = new m40();
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final v40 sink;
    private final m40 sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, v40 v40, Random random2, boolean z2, boolean z3, long j) {
        byte[] bArr;
        vx2.m53591g(v40, "sink");
        vx2.m53591g(random2, "random");
        this.isClient = z;
        this.sink = v40;
        this.random = random2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.sinkBuffer = v40.mo56081r();
        m40.C7863c cVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new m40.C7863c() : cVar;
    }

    private final void writeControlFrame(int i, ByteString byteString) throws IOException {
        boolean z;
        if (!this.writerClosed) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(size | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    vx2.m53588d(bArr);
                    random2.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (size > 0) {
                        long size2 = this.sinkBuffer.size();
                        this.sinkBuffer.mo56054e1(byteString);
                        m40 m40 = this.sinkBuffer;
                        m40.C7863c cVar = this.maskCursor;
                        vx2.m53588d(cVar);
                        m40.mo56103x(cVar);
                        this.maskCursor.mo56121d(size2);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(size);
                    this.sinkBuffer.mo56054e1(byteString);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public void close() {
        MessageDeflater messageDeflater2 = this.messageDeflater;
        if (messageDeflater2 != null) {
            messageDeflater2.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final v40 getSink() {
        return this.sink;
    }

    public final void writeClose(int i, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (!(i == 0 && byteString == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            m40 m40 = new m40();
            m40.writeShort(i);
            if (byteString != null) {
                m40.mo56054e1(byteString);
            }
            byteString2 = m40.mo56042V0();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, ByteString byteString) throws IOException {
        vx2.m53591g(byteString, "data");
        if (!this.writerClosed) {
            this.messageBuffer.mo56054e1(byteString);
            int i2 = 128;
            int i3 = i | 128;
            if (this.perMessageDeflate && ((long) byteString.size()) >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater2 = this.messageDeflater;
                if (messageDeflater2 == null) {
                    messageDeflater2 = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater2;
                }
                messageDeflater2.deflate(this.messageBuffer);
                i3 |= 64;
            }
            long size = this.messageBuffer.size();
            this.sinkBuffer.writeByte(i3);
            if (!this.isClient) {
                i2 = 0;
            }
            if (size <= 125) {
                this.sinkBuffer.writeByte(((int) size) | i2);
            } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i2 | 126);
                this.sinkBuffer.writeShort((int) size);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.mo56067j0(size);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                vx2.m53588d(bArr);
                random2.nextBytes(bArr);
                this.sinkBuffer.write(this.maskKey);
                if (size > 0) {
                    m40 m40 = this.messageBuffer;
                    m40.C7863c cVar = this.maskCursor;
                    vx2.m53588d(cVar);
                    m40.mo56103x(cVar);
                    this.maskCursor.mo56121d(0);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, size);
            this.sink.mo56022H();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(ByteString byteString) throws IOException {
        vx2.m53591g(byteString, "payload");
        writeControlFrame(9, byteString);
    }

    public final void writePong(ByteString byteString) throws IOException {
        vx2.m53591g(byteString, "payload");
        writeControlFrame(10, byteString);
    }
}
