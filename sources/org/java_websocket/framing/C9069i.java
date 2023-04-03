package org.java_websocket.framing;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.framing.i */
/* compiled from: TextFrame */
public class C9069i extends C9064e {
    public C9069i() {
        super(Framedata.Opcode.TEXT);
    }

    /* renamed from: h */
    public void mo64946h() throws InvalidDataException {
        super.mo64946h();
        if (!zd0.m74858b(mo64945f())) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
    }
}
