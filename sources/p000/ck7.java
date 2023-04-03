package p000;

import java.nio.ByteBuffer;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

/* renamed from: ck7 */
/* compiled from: WebSocketListener */
public interface ck7 {
    /* renamed from: a */
    void mo50241a(WebSocket webSocket, int i, String str, boolean z);

    /* renamed from: b */
    void mo50914b(WebSocket webSocket, lg0 lg0) throws InvalidDataException;

    /* renamed from: c */
    void mo50242c(WebSocket webSocket, ByteBuffer byteBuffer);

    /* renamed from: d */
    cx5 mo50915d(WebSocket webSocket, Draft draft, lg0 lg0) throws InvalidDataException;

    /* renamed from: e */
    void mo50916e(WebSocket webSocket, Framedata framedata);

    /* renamed from: f */
    void mo50917f(WebSocket webSocket, Framedata framedata);

    /* renamed from: g */
    void mo50918g(WebSocket webSocket, lg0 lg0, bx5 bx5) throws InvalidDataException;

    /* renamed from: i */
    void mo50244i(WebSocket webSocket);

    /* renamed from: j */
    void mo50245j(WebSocket webSocket, int i, String str);

    /* renamed from: k */
    void mo50246k(WebSocket webSocket, bl2 bl2);

    /* renamed from: l */
    void mo50247l(WebSocket webSocket, Exception exc);

    /* renamed from: m */
    void mo50248m(WebSocket webSocket, String str);

    /* renamed from: n */
    void mo50249n(WebSocket webSocket, int i, String str, boolean z);
}
