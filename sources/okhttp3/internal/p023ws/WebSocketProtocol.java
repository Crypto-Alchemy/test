package okhttp3.internal.p023ws;

import kotlin.Metadata;
import okio.ByteString;
import p000.m40;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\n8\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010 \u001a\u00020\u001f8\u0000XT¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0000XT¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u001f8\u0000XT¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u0014\u0010&\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010'\u001a\u00020\b8\u0000XT¢\u0006\u0006\n\u0004\b'\u0010\u0011¨\u0006*"}, mo44877d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "Lm40$c;", "cursor", "", "key", "Lr37;", "toggleMask", "", "code", "", "closeCodeExceptionMessage", "validateCloseCode", "acceptHeader", "ACCEPT_MAGIC", "Ljava/lang/String;", "B0_FLAG_FIN", "I", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "OPCODE_FLAG_CONTROL", "B1_FLAG_MASK", "B1_MASK_LENGTH", "OPCODE_CONTINUATION", "OPCODE_TEXT", "OPCODE_BINARY", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "", "PAYLOAD_BYTE_MAX", "J", "CLOSE_MESSAGE_MAX", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX", "PAYLOAD_LONG", "CLOSE_CLIENT_GOING_AWAY", "CLOSE_NO_STATUS_CODE", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.WebSocketProtocol */
/* compiled from: WebSocketProtocol.kt */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        vx2.m53591g(str, "key");
        return ByteString.Companion.mo64480d(vx2.m53598n(str, ACCEPT_MAGIC)).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i) {
        boolean z;
        if (i < 1000 || i >= 5000) {
            return vx2.m53598n("Code must be in range [1000,5000): ", Integer.valueOf(i));
        }
        boolean z2 = true;
        if (1004 > i || i >= 1007) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (1015 > i || i >= 3000) {
                z2 = false;
            }
            if (!z2) {
                return null;
            }
        }
        return "Code " + i + " is reserved and may not be used.";
    }

    public final void toggleMask(m40.C7863c cVar, byte[] bArr) {
        vx2.m53591g(cVar, "cursor");
        vx2.m53591g(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.f40760k;
            int i2 = cVar.f40761r;
            int i3 = cVar.f40762s;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (cVar.mo56118b() != -1);
    }

    public final void validateCloseCode(int i) {
        boolean z;
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            vx2.m53588d(closeCodeExceptionMessage);
            throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
        }
    }
}
