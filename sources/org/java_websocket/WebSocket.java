package org.java_websocket;

import org.java_websocket.framing.Framedata;

public interface WebSocket {

    public enum READYSTATE {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public enum Role {
        CLIENT,
        SERVER
    }

    /* renamed from: h */
    void mo50243h(Framedata framedata);
}
