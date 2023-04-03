package org.java_websocket.framing;

import java.nio.ByteBuffer;

public interface Framedata {

    public enum Opcode {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    /* renamed from: a */
    boolean mo64940a();

    /* renamed from: b */
    boolean mo64941b();

    /* renamed from: c */
    Opcode mo64942c();

    /* renamed from: d */
    boolean mo64943d();

    /* renamed from: e */
    boolean mo64944e();

    /* renamed from: f */
    ByteBuffer mo64945f();
}
