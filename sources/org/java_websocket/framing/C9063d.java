package org.java_websocket.framing;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* renamed from: org.java_websocket.framing.d */
/* compiled from: ControlFrame */
public abstract class C9063d extends C9065f {
    public C9063d(Framedata.Opcode opcode) {
        super(opcode);
    }

    /* renamed from: h */
    public void mo64946h() throws InvalidDataException {
        if (!mo64944e()) {
            throw new InvalidFrameException("Control frame cant have fin==false set");
        } else if (mo64940a()) {
            throw new InvalidFrameException("Control frame cant have rsv1==true set");
        } else if (mo64941b()) {
            throw new InvalidFrameException("Control frame cant have rsv2==true set");
        } else if (mo64943d()) {
            throw new InvalidFrameException("Control frame cant have rsv3==true set");
        }
    }
}
