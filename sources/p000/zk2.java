package p000;

import org.slf4j.Marker;

/* renamed from: zk2 */
/* compiled from: HandshakeImpl1Client */
public class zk2 extends cl2 implements mg0 {

    /* renamed from: c */
    public String f46404c = Marker.ANY_MARKER;

    /* renamed from: c */
    public String mo55892c() {
        return this.f46404c;
    }

    /* renamed from: f */
    public void mo56254f(String str) throws IllegalArgumentException {
        if (str != null) {
            this.f46404c = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }
}
