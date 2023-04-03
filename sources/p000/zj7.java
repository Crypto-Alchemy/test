package p000;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.C9067g;
import org.java_websocket.framing.C9068h;
import org.java_websocket.framing.Framedata;

/* renamed from: zj7 */
/* compiled from: WebSocketAdapter */
public abstract class zj7 implements ck7 {
    /* renamed from: b */
    public void mo50914b(WebSocket webSocket, lg0 lg0) throws InvalidDataException {
    }

    /* renamed from: d */
    public cx5 mo50915d(WebSocket webSocket, Draft draft, lg0 lg0) throws InvalidDataException {
        return new al2();
    }

    /* renamed from: e */
    public void mo50916e(WebSocket webSocket, Framedata framedata) {
    }

    /* renamed from: f */
    public void mo50917f(WebSocket webSocket, Framedata framedata) {
        webSocket.mo50243h(new C9068h((C9067g) framedata));
    }

    /* renamed from: g */
    public void mo50918g(WebSocket webSocket, lg0 lg0, bx5 bx5) throws InvalidDataException {
    }
}
