package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okio.ByteString;
import p000.m40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00010B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010\fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, mo44877d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "Lr37;", "readHeader", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "", "isClient", "Z", "Lw40;", "source", "Lw40;", "getSource", "()Lw40;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "closed", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lm40;", "controlFrameBuffer", "Lm40;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Lm40$c;", "maskCursor", "Lm40$c;", "<init>", "(ZLw40;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "FrameCallback", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.WebSocketReader */
/* compiled from: WebSocketReader.kt */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final m40 controlFrameBuffer = new m40();
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final m40.C7863c maskCursor;
    private final byte[] maskKey;
    private final m40 messageFrameBuffer = new m40();
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final w40 source;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u000f"}, mo44877d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", "text", "Lr37;", "onReadMessage", "Lokio/ByteString;", "bytes", "payload", "onReadPing", "onReadPong", "", "code", "reason", "onReadClose", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    /* compiled from: WebSocketReader.kt */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, w40 w40, FrameCallback frameCallback2, boolean z2, boolean z3) {
        byte[] bArr;
        vx2.m53591g(w40, "source");
        vx2.m53591g(frameCallback2, "frameCallback");
        this.isClient = z;
        this.source = w40;
        this.frameCallback = frameCallback2;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        m40.C7863c cVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = !z ? new m40.C7863c() : cVar;
    }

    private final void readControlFrame() throws IOException {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo56057f0(this.controlFrameBuffer, j);
            if (!this.isClient) {
                m40 m40 = this.controlFrameBuffer;
                m40.C7863c cVar = this.maskCursor;
                vx2.m53588d(cVar);
                m40.mo56103x(cVar);
                this.maskCursor.mo56121d(0);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                m40.C7863c cVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                vx2.m53588d(bArr);
                webSocketProtocol.toggleMask(cVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.mo56048b1();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.mo56042V0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.mo56042V0());
                return;
            default:
                throw new ProtocolException(vx2.m53598n("Unknown control opcode: ", Util.toHexString(this.opcode)));
        }
    }

    /* JADX INFO: finally extract failed */
    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i = and & 15;
                this.opcode = i;
                boolean z7 = false;
                if ((and & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((and & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (!z2 || z) {
                    if ((and & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i == 1 || i == 2) {
                        if (!z3) {
                            z6 = false;
                        } else if (this.perMessageDeflate) {
                            z6 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.readingCompressedMessage = z6;
                    } else if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((and & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if ((and & 16) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            int and2 = Util.and(this.source.readByte(), 255);
                            if ((and2 & 128) != 0) {
                                z7 = true;
                            }
                            if (z7 == this.isClient) {
                                if (this.isClient) {
                                    str = "Server-sent frames must not be masked.";
                                } else {
                                    str = "Client-sent frames must be masked.";
                                }
                                throw new ProtocolException(str);
                            }
                            long j = (long) (and2 & 127);
                            this.frameLength = j;
                            if (j == 126) {
                                this.frameLength = (long) Util.and(this.source.readShort(), 65535);
                            } else if (j == 127) {
                                long readLong = this.source.readLong();
                                this.frameLength = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.isControlFrame && this.frameLength > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z7) {
                                w40 w40 = this.source;
                                byte[] bArr = this.maskKey;
                                vx2.m53588d(bArr);
                                w40.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo56057f0(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    m40 m40 = this.messageFrameBuffer;
                    m40.C7863c cVar = this.maskCursor;
                    vx2.m53588d(cVar);
                    m40.mo56103x(cVar);
                    this.maskCursor.mo56121d(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    m40.C7863c cVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    vx2.m53588d(bArr);
                    webSocketProtocol.toggleMask(cVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException(vx2.m53598n("Expected continuation opcode. Got: ", Util.toHexString(this.opcode)));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (this.readingCompressedMessage) {
                MessageInflater messageInflater2 = this.messageInflater;
                if (messageInflater2 == null) {
                    messageInflater2 = new MessageInflater(this.noContextTakeover);
                    this.messageInflater = messageInflater2;
                }
                messageInflater2.inflate(this.messageFrameBuffer);
            }
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo56048b1());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo56042V0());
            }
        } else {
            throw new ProtocolException(vx2.m53598n("Unknown opcode: ", Util.toHexString(i)));
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    public void close() throws IOException {
        MessageInflater messageInflater2 = this.messageInflater;
        if (messageInflater2 != null) {
            messageInflater2.close();
        }
    }

    public final w40 getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
