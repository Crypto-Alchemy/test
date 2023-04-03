package p000;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;

/* renamed from: z71 */
/* compiled from: DefaultExtension */
public class z71 implements wn2 {
    /* renamed from: a */
    public wn2 mo66737a() {
        return new z71();
    }

    /* renamed from: b */
    public boolean mo66738b(String str) {
        return true;
    }

    /* renamed from: c */
    public void mo66739c(Framedata framedata) throws InvalidDataException {
    }

    /* renamed from: d */
    public String mo66740d() {
        return "";
    }

    /* renamed from: e */
    public boolean mo66741e(String str) {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() == obj.getClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo66742f(Framedata framedata) {
    }

    /* renamed from: g */
    public void mo66743g(Framedata framedata) throws InvalidDataException {
        if (framedata.mo64940a() || framedata.mo64941b() || framedata.mo64943d()) {
            throw new InvalidFrameException("bad rsv RSV1: " + framedata.mo64940a() + " RSV2: " + framedata.mo64941b() + " RSV3: " + framedata.mo64943d());
        }
    }

    /* renamed from: h */
    public String mo66744h() {
        return "";
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public void reset() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
